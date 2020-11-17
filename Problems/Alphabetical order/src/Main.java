import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String[] str = string.split(" ");
        boolean check = true;
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i].compareTo(str[i + 1]) > 0) {
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}