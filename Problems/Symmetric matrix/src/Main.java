import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        boolean answer = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        if (n == 1) {
            System.out.println("YES");
        } else {
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        answer = false;
                        break;
                    }
                }
                if (!answer) {
                    break;
                }
            }

            if (answer) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}