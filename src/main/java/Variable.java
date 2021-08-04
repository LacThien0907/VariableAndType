public class Variable {
    static String  global = "global variable";

    public static void main (String[] args) {
        String str = "DataS Type"; // Or String str; str = "Data Type"
        System.out.println(str);

        System.out.println(global);
        sum();

        final double PI = 3.14;

        System.out.println("NAME\tDOB");
        byte a1 = 10;
        short b2 = 20;
        int i = 30;
        long L = 1000000000L;

        double c = 4.15;
        float d = 5.25F;
        char f = 'F';
        char g = 65; // A
        boolean h = true;
        boolean h1 = false;

        Integer a = 100;
        Integer b = 200;
        System.out.println("a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("a = " + a + ", b = " + b);
    }
    static void swap(Integer a, Integer b) {
        Integer tmp = a;
        a = b;
        b = tmp;
        System.out.println("Swap: a = " + a + ", b = " + b);

        SimpleSeason sse = SimpleSeason.AUTUMN;
        System.out.println(sse);

        Season se = Season.SPRING;
        System.out.println(se.getValue());
    }

    public static void sum() {
        System.out.println(global);
    }
}
