public class Calculator {
    public double sum(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) throws ArithmeticException {
        try {
            b = 0;
        }
        catch (ArithmeticException e) {
        }
        return a / b;
    }
    public double sqrt(double a) throws ArithmeticException{
        try {
            a = -1;
        }
        catch (ArithmeticException e) {
        }
        return Math.sqrt(a);
    }
}
