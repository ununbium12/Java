package chapter03;

public class CalculatorExample {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.powerOn();

        int result1 = calc.plus(5,6);
        System.out.println("result1 : "+ result1);

        byte x = 10;
        byte y = 4;
        double result2 = calc.divide(x, y);
        System.out.println("result2 : "+ result2);

        int result3 = calc.sum2(3,4,5);
        System.out.println("result3 : "+ result3);

        calc.powerOff();
    }

}