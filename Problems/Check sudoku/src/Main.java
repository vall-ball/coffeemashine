import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n * n][n * n];

        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] > n * n) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        if (check(matrix, n)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    public static boolean check(int[][] matrix, int n) {
        boolean answer = true;

        for (int i = 0; i < n * n; i++) {
            if (!checkLine(matrix[i])) {
                answer =  false;
                break;
            }
        }

        for (int i = 0; i < n * n; i++) {
            if (!checkLine(rotateMatrix(matrix)[i])) {
                answer =  false;
                break;
            }
        }

        for (int i = 0; i < n * n; i++) {
            if (!checkSquare(splitMatrix(matrix, n)[i])) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static boolean checkLine(int[] line) {
        boolean result = true;
        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line.length; j++) {
                if (line[i] == line[j] && i != j) {
                    result = false;
                }
            }
        }
        return result;
    }

    public static boolean checkSquare(int[][] matrix) {
        boolean result = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    for (int l = 0; l < matrix[0].length; l++) {
                        if (matrix[i][j] == matrix[k][l] && i != k && j != l) {
                            result = false;
                        }
                    }
                }
            }
        }
        return result;
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int[][] rotateMatrix = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rotateMatrix[i][j] = matrix[matrix.length - j - 1][i];
            }
        }
        return rotateMatrix;
    }

    public static int[][][] splitMatrix(int[][] matrix, int n) {
        int[][][] lines = splitMatrixToLine(matrix, n);

        int[][][] result = new int[n * n][n][n];

        for (int i = 0; i < n * n; i++) {
            result[i] = splitLineToMatrix(lines[i / n], n)[i % n];
        }
        return result;
    }

    public static int[][][] splitMatrixToLine(int[][] matrix, int n) {
        int[][][] result = new int[n][n][n * n];
        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                result[i / n][i % n][j] = matrix[i][j];
            }
        }

        return result;
    }

    public static int[][][] splitLineToMatrix(int[][] line, int n) {
        int[][][] result = new int[n][n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * n; j++) {
                result[j / n][i][j % n] = line[i][j];
            }
        }

        return result;
    }
}
