
public class Main {
    public static void main(String[] args) {
        int x=10 , y=0 ;

        //Task 10,11
        System.out.println("Task 10,11");
        try { //outer try
            try { //innner try
                System.out.println("hiii from inner try");
                System.out.println(x / y);
            }catch (NumberFormatException e) {
                System.out.println("from inner catch,"+e.getMessage());
            }
        }catch (ArithmeticException e) {
            System.out.println("Error from outer catch,"+e.getMessage());
        }finally {
            System.out.println("---------hiii from finally method---------");
        }

    }
}