import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int min = scanner.nextInt();
        int n;
        for (int i = 1; i < length; i++) {
            n = scanner.nextInt();
            if (min > n) {
                min = n;
            }
        }
        System.out.println(min);
    }
}