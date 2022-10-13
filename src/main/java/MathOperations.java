public class MathOperations {
    private double addition;
    private double subtraction;
    private double multiplication;
    private double division;

    public void add(double a, double b) {
        addition = a + b;
    }

    public void sub(double a, double b) {
        subtraction = a - b;
    }

    public void mult(double a, double b) {
        multiplication = a * b;
    }

    public void div(double a, double b) {
        division = a / b;
    }

    public double getAddition() {
        return addition;
    }

    public double getSubtraction() {
        return subtraction;
    }

    public double getMultiplication() {
        return multiplication;
    }

    public double getDivision() {
        return division;
    }
}
