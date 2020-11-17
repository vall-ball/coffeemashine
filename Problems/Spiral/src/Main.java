import java.util.Scanner;

class Main {

    static int firstUpRow;
    static int lastDownRow;
    static int firstLeftColumn;
    static int lastRightColumn;
    static int[][] matrix;
    static int value;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        matrix = new int[n][n];
        value = 1;
        firstUpRow = 0;
        lastDownRow = n - 1;
        firstLeftColumn = 0;
        lastRightColumn = n - 1;


        while (value <= n * n) {
            goRight();
            goDown();
            goLeft();
            goUp();
        }

        for (int[] m : matrix) {
            for (int i : m) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    static void goRight() {
        for (int i = firstLeftColumn; i <= lastRightColumn; i++) {
            matrix[firstUpRow][i] = value;
            value++;
        }
        firstUpRow++;
    }

    static void goLeft() {
        for (int i = lastRightColumn; i >= firstLeftColumn; i--) {
            matrix[lastDownRow][i] = value;
            value++;
        }
        lastDownRow--;
    }

    static void goUp() {
        for (int i = lastDownRow; i >= firstUpRow; i--) {
            matrix[i][firstLeftColumn] = value;
            value++;
        }
        firstLeftColumn++;
    }

    static void goDown() {
        for (int i = firstUpRow; i <= lastDownRow; i++) {
            matrix[i][lastRightColumn] = value;
            value++;
        }
        lastRightColumn--;
    }

}