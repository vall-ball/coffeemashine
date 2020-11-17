import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int count = 0;

        for (int i = 0; i < length - 2; i++) {
            if (numbers[i + 2] - numbers[i + 1] == 1 && numbers[i + 1] - numbers[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}