public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1:");
        int x = 10, y = 0;

        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Task 2
        System.out.println("\nTask 2:");
        String S = "abc";

        try {
            int i = Integer.parseInt(S);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Task 3
        System.out.println("\nTask 3:");
        String S3 = null;

        try {
            S3 = S3.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
