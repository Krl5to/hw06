package guru.qa;

import static java.lang.Integer.*;

public class Test {

    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        int c = 50;
        int d = 50;
        boolean ba = true;
        boolean bb = false;
        int e = 10;
        int f;
        String name = "Олег";

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

        // Операторы присваивания
        c = a + b;
        System.out.println("c = a + b = " + c );
        c = c + a; // c += a;
        System.out.println("c = c + a = " + c );
        c = c - a; // c -= a;
        System.out.println("c = c - a = " + c );
        c = c * a; // c *= a;
        System.out.println("c = c * a = " + c );
        c = c / a; // c /= a ;
        System.out.println("c = c / a = " + c );
        c = c % a; // c %= a ;
        System.out.println("c = c % a = " + c );

        // Тернарный оператор
        f = (e == 1) ? 20 : 30;
        System.out.println( "Значение b: " +  f );
        f = (e == 10) ? 20 : 30;
        System.out.println( "Значение b: " + f );

        // Оператор instanceof
        // Вернётся верно, поскольку тип String
        boolean result = name instanceof String;
        System.out.println( result );

        // переполнение
        int maxValue = MAX_VALUE;
        System.out.println("maxValue + 1 : " + (maxValue + 1));

        // 2) попробовать вычисления комбинаций типов данных (int и double)
        int intValue = 5;
        double doubleValue = 5.01;
        int intValue1 = 10;
        double doubleValue1 = 10.00;

        System.out.println("intValue + doubleValue : " + (intValue + doubleValue));
        System.out.println("intValue * doubleValue : " + (intValue * doubleValue));
        System.out.println("intValue1 == doubleValue1 : " + (intValue1 == doubleValue1));
    }
}