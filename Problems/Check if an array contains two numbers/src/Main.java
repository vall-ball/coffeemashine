import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean check = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == n && numbers[i + 1] == m || numbers[i] == m && numbers[i + 1] == n) {
                check = true;
                break;
            }
        }
        System.out.println(check);
    }
}
