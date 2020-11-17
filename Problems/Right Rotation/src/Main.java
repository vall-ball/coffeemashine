import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] string = scanner.nextLine().split(" ");
        int[] numbers = new int[string.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(string[i]);
        }

        int shift = scanner.nextInt();

        while (shift > numbers.length) {
            shift -= numbers.length;
        }

        //test
        //System.out.println(Arrays.toString(numbers));

        int[] temp = new int[shift];

        System.arraycopy(numbers, numbers.length - shift, temp, 0, shift);
       // for (int i = 0; i < shift; i++) {
         //   temp[i] = numbers[numbers.length - shift + i];
       // }
        //test
        //System.out.println(Arrays.toString(temp));

        for (int i = numbers.length - 1; i >= shift; i--) {
            numbers[i] = numbers[i - shift];
        }

        System.arraycopy(temp, 0, numbers, 0, shift);
        //for (int i = 0; i < shift; i++) {
          //  numbers[i] = temp[i];
        //}

        //test
        for (int i : numbers) {
            System.out.print(i + " ");
        }

    }
}