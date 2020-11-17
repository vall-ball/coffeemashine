import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        boolean answer = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (check(matrix[i], k)) {
                System.out.println(i + 1);
                answer = true;
                break;
            }
        }
        if (!answer) {
            System.out.println(0);
        }

    }

    static boolean check(int[] row, int k) {
        boolean answer = false;
        int count = 0;
        for (int i = 0; i < row.length; i++) {
            while (i < row.length && row[i] == 0) {
                count++;
                i++;
            }
            if (count >= k) {
                answer = true;
                break;
            } else {
                count = 0;
            }
        }
        return answer;
    }
}