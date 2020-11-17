import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] incomes = new int[length];
        for (int i = 0; i < length; i++) {
            incomes[i] = scanner.nextInt();
        }

        int[] percents = new int[length];
        for (int i = 0; i < length; i++) {
            percents[i] = scanner.nextInt();
        }

        int max = incomes[0] * percents[0];
        int index = 0;

        for (int i = 1; i < length; i++) {
            if (max < incomes[i] * percents[i]) {
                max = incomes[i] * percents[i];
                index = i;
            }
        }
        System.out.println(index + 1);
    }
}