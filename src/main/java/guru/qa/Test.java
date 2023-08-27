package guru.qa;

public class Test {

    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        int c = 50;
        int d = 50;
        boolean ba = true;
        boolean bb = false;

        // Арифметические операторы
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("a     = " +  (a));
        System.out.println("--b   = " +  (--b));
        System.out.println("d++   = " +  (d++));
        System.out.println("++d   = " +  (++d));

        // Операторы сравнения
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

        // Логические операторы
        System.out.println("a && b = " + (ba&&bb));
        System.out.println("a || b = " + (ba||bb) );
        System.out.println("!(a && b) = " + !(ba && bb));
    }
}