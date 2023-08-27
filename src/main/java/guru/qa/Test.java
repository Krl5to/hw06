package guru.qa;

import static java.lang.Integer.*;

public class Test {

    public static void main(String args[]) {
        int a = 20;
        int b = 40;
        int c = 50;
        int d = 50;

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
        boolean ba = true;
        boolean bb = false;
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
        int e = 10;
        int f;
        f = (e == 1) ? 20 : 30;
        System.out.println( "Значение f: " +  f );
        f = (e == 10) ? 20 : 30;
        System.out.println( "Значение f: " + f );

        // if-else
        if (e==10) {
            f=20;
        } else {
            f=30;
        };
        System.out.println( "Значение f: " + f );

        // switchCase
        char bestCar = 'A';
        switch(bestCar)
        {
            case 'A' : {
                System.out.println("Audi");
                break;
            }
            case 'B' : {
                System.out.println("BMW");
                break;
            }
            case 'C' : {
                System.out.println("Mercedes-Benz");
                break;
            }
            case 'D' : {
                System.out.println("VW");
                break;
            }
        }

        // Оператор instanceof
        String name = "Олег";
        // Вернётся true, поскольку тип String
        boolean result = name instanceof String;
        System.out.println( result );

        // переполнение
        int maxValue = MAX_VALUE;
        System.out.println("maxValue + 1 : " + (maxValue + 1));

        // 2) попробовать вычисления комбинаций типов данных (int и double)
        int intValue = 5;
        double doubleValue = 5.01;
        System.out.println("intValue + doubleValue : " + (intValue + doubleValue));
        System.out.println("intValue * doubleValue : " + (intValue * doubleValue));

        int intValue1 = 10;
        double doubleValue1 = 10.00;
        System.out.println("intValue1 == doubleValue1 : " + (intValue1 == doubleValue1));
    }
}