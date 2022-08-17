public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int d = calc.multiply.apply(2,1);
        int c = calc.devide.apply(a, b); // выдает ошибку, если число b = 0
        //можно обойти ошибку с помощью тернарного оператора и при делении на 0 просто выводить 0

        calc.println.accept(c);
    }
}