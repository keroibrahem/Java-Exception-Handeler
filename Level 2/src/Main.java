import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Task 4
        System.out.println("Task 4 :");
        int [] arr ={1,2,3,4,5};

        System.out.println("Enter index : ");
        int index = sc.nextInt();

        try {
            System.out.println( arr[index] );

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error,"+e.getMessage());
        }

        System.out.println("\nTask 5 :");
        FileReader file = null;
        try{
            file = new FileReader("text.txt");
        }catch (FileNotFoundException e){
            System.out.println("Error,"+e.getMessage());
        }

        System.out.println("\nTask 6 :");
        int x ,y ;
        String s=null;
        try {
            System.out.println("Enter the number 1 : ");
            x = sc.nextInt();
            System.out.println("Enter the number 2 : ");
            y = sc.nextInt();
            System.out.println(x/y);
            System.out.println(s.length());
        }catch (ArithmeticException e){
            System.out.println("Error,"+e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Error,"+e.getMessage());
        }



    }
}