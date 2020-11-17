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
        int check = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] == n) {
                check++;
            }
        }
        System.out.println(check);
    }
}