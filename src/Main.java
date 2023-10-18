public class Main {
    public static void main(String[] args) {
        System.out.println("Вариант с классом Calculator");
        Calculator calcul = new Calculator();
        System.out.println(
                calcul.newFormula()
                        .addOperand(5)
                        .addOperand(10)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        System.out.println("\nВариант с классом IntsCalculator\n");
        Ints calc = new IntsCalculator();
        System.out.println(calc.mult(5, 8));
        System.out.println(calc.sub(15, 18));
        System.out.println(calc.pow(4, 2));
        System.out.println(calc.sum(500, 500));
        System.out.println(calc.div(500, 500));

    }
}
