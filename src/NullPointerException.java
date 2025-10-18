// NullPointerException.java
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String[] names = {"Alice", null, "Bob"};

        for (String name : names) {
            try {
                // Attempt to print length of the string
                System.out.println(name.length());
            } catch (NullPointerException e) {
                System.out.println("Caught a NullPointerException: name is null");
            }
        }

        System.out.println("Program completed safely.");
    }
}
