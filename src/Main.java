public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Result: " + calculate(a, b));

        String name = null;

        if (name != null) {
            System.out.println(name);
        }

        int unused = 100;

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static int calculate(int a, int b) {
        return a + b;
    }

    public static void badMethod() {

        int x = 10;
        int y = 20;
        int z = x + y;

        System.out.println("This method is not needed");
    }
}


