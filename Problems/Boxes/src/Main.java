import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstBox = new int[3];
        int[] secondBox = new int[3];

        for (int i = 0; i < 3; i++) {
            firstBox[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            secondBox[i] = scanner.nextInt();
        }
        Arrays.sort(firstBox);
        Arrays.sort(secondBox);

        if (firstBox[0] == secondBox[0] && firstBox[1] == secondBox[1] && firstBox[2] == secondBox[2]) {
            System.out.println("Box 1 = Box 2");
        } else if (firstBox[0] >= secondBox[0] && firstBox[1] >= secondBox[1] && firstBox[2] >= secondBox[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (firstBox[0] <= secondBox[0] && firstBox[1] <= secondBox[1] && firstBox[2] <= secondBox[2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incomparable ");
        }
    }
}