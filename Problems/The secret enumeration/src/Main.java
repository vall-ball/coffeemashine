public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (Secret s : Secret.values()) {
            if (s.name().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
