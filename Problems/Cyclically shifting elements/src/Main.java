import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int temp = numbers[n - 1];
        //numbers[0] = numbers[n-1];
        for (int i = n - 1; i > 0; i--) {
            //temp = numbers[i - 1];
            numbers[i] = numbers[i - 1];


        }
        numbers[0] = temp;

        //numbers[0] = temp;
        for (int el : numbers) {
            System.out.print(el + " ");
        }
    }
}