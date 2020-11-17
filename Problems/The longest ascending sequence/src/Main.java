import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int longestSequence = 0;
        int sequence;
        if (length == 1) {
            System.out.println(1);
        } else {
            for (int i = 0; i < length - 1; i++) {
                sequence = 1;
                for (int j = i; j < length - 1; j++) {
                    if (numbers[j + 1] > numbers[j]) {
                        sequence++;
                    } else {
                        i = j;
                        break;
                    }
                }

                if (sequence > longestSequence) {
                    longestSequence = sequence;
                }
            }

            System.out.println(longestSequence);
        }
    }
}
