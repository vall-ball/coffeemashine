import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];
        int index = 0;
        for (int i = 1; i < length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}