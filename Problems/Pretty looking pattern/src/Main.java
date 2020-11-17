import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrix = new String[4];
        for (int i = 0; i < 4; i++) {
            matrix[i] = scanner.nextLine();
        }

        boolean answer = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i].charAt(j) == matrix[i].charAt(j + 1) && matrix[i].charAt(j) == matrix[i + 1].charAt(j) && matrix[i].charAt(j) == matrix[i + 1].charAt(j + 1)) {
                    answer = true;
                    break;
                }
            }
            if (answer) {
                break;
            }
        }
        if (!answer) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
