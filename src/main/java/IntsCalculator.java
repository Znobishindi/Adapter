public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        System.out.print(arg0 + " + " + arg1 + " = ");
        return (int) target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.SUM).result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        System.out.print(arg0 + " * " + arg1 + " = ");
        return (int) target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.MULT).result();
    }

    @Override
    public int pow(int a, int b) {
        System.out.print(a + " в степени " + b + " = ");
        return (int) target.newFormula().addOperand(a).addOperand(b).calculate(Calculator.Operation.POW).result();
    }

    @Override
    public double div(double a, double b) {
        System.out.print(a + " / " + b + " = ");
        return target.newFormula().addOperand(a).addOperand(b).calculate(Calculator.Operation.DIV).result();
    }
}