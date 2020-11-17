import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        long mult = 1;

        for (int i = 0; i < length - 1; i++) {
            if (numbers[i] * numbers[i + 1] > mult) {
                mult = numbers[i] * numbers[i + 1];
            }
        }
        System.out.println(mult);
    }
}