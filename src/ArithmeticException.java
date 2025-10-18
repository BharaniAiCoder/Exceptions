// ArithmeticException.java
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {10, 0, 5};
        for (int number : numbers) {
            try {
                int result = 100 / number;
                System.out.println("100 / " + number + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught an ArithmeticException: " + e.getMessage());
            }
        }
    }
}
