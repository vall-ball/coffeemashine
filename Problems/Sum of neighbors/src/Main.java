import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] string = matrixFormation();


        int[][] matrix = matrixRecognation(string);

        int[][] result = matrixOfResult(matrix);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static String[] matrixFormation() {
        Scanner scanner = new Scanner(System.in);
        int initial = 10;
        String[] mass = new String[initial];
        String[] temp;
        int counter = 0;

        while (!scanner.hasNext("end")) {
            if (counter >= 10) {
                temp = mass;
                mass = Arrays.copyOf(temp, initial + 10);
            }
            mass[counter] = scanner.nextLine();
            counter++;
        }
        String[] result = new String[counter + 1];
        result = Arrays.copyOf(mass, counter);
        return result;
    }

    public static int[][] matrixRecognation(String[] mass) {
        String[][] matrixOfString = new String[mass.length][];
        for (int i = 0; i < mass.length; i++) {
            matrixOfString[i] = mass[i].split(" ");
        }
        int[][] result = new int[mass.length][matrixOfString[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < matrixOfString[0].length; j++) {
                result[i][j] = Integer.parseInt(matrixOfString[i][j]);
            }
        }
        return result;
    }

    public static int[][] matrixOfResult(int[][] mass) {
        int n = mass.length;
        int m = mass[0].length;
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                result[i][j] = mass[(i - 1 + n) % n][j] + mass[(i + 1) % n][j] + mass[i][(j - 1 + m) % m ] + mass[i][(j + 1) % m];

            }
        }
        return result;
    }
}