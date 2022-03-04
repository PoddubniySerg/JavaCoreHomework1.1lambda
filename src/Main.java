import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        int d = calc.multiply.apply(a, 5);

        int e = calc.pow.apply(a);
        int f = calc.abs.apply(-8);

        boolean g = calc.isPositive.test(-5);

        for(int i : new int[] {a, b, c, d, e, f}) {
            calc.println.accept(i);
        }

        System.out.println(g);

        //ошибка: Exception in thread "main" java.lang.ArithmeticException: / by zero
        //причина ошибки - деление на 0
        //значит, что при передаче в метод calc.devide значения у = 0, java не сможет выполнить операцию деления на 0
        //необходимо исключить саму вероятность того, что программе придется делить на 0
        //мне для этого нравится тернарный оператор
    }
}
