class Cat {

    String name;
    int age;
    static int count;

    public Cat(String name, int age) {
        this.age = age;
        this.name = name;
        count++;
        if (count > 5) {
           System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return count;
    }
}