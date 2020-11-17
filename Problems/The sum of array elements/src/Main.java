import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //int[] numbers = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            //numbers[i] = scanner.nextInt();
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }
}