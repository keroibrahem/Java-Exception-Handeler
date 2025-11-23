
public class Main {
    public static void main(String[] args) {

        int x=10 , y=0 ;

        try {
            System.out.println(x / y);
        }catch (ArithmeticException e) {
            System.out.println("Error,"+e.getMessage());
        }

    }
}