import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Task 7:");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
         try{
             CheckAge(age);
         }catch (InvalidAgeException e ){
             System.out.println("Error,"+e.getMessage());
         }

        System.out.println("\nTask 8:");
         try {
             methodA();
         }catch (Exception e){
             System.out.println("Error,"+e.getMessage());
         }
         System.out.println("\nTask 9:");
         try {
             readfile("text.txt");
         }catch (IOException e){
             System.out.println("Error,"+e.getMessage());
         }

    }
    public static void CheckAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException();
        }
        System.out.println("Age is vaild :)");
    }

    public static void methodA() throws Exception{
        methodB();
    }
    public static void methodB() throws Exception{
        throw new Exception("from methodB ");
    }
    public static void readfile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName);
        System.out.println("hii from readfile");

    }
}
