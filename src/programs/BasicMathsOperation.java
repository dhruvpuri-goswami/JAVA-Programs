//Write a program that takes input from the user and performs basic math operations like factorial,log,square root and other.
package programs;
import java.util.Scanner;

public class BasicMathsOperation {
    public static void main(String[] args) {
        System.out.println("Hello , Please enter your name : ");
        Scanner scanner = new Scanner(System.in);
        //getting input from keyboard
        String name = scanner.nextLine();
        System.out.println("Welcome , " +name+" :)");
        System.out.println("Please choose any option to perform maths operation ...\n" +
                "1) Factorial of number\n" +
                "2) Square root of number\n" +
                "3) Log of number\n" +
                "4) Log of number with base 10\n" +
                "");
        boolean check = scanner.hasNextInt();
        //checking that user enters integer number only.
        int opt;
        if(check){
            opt = scanner.nextInt();
            //factorial of number
            if(opt==1){
                System.out.println("Enter any Number : ");
                int num = scanner.nextInt();
                double fact = 1;
                for(int i=num;i>0;i--){
                    fact = fact*i;
                }
                System.out.println("Factorial of Number "+num+" = "+fact);
            }
            //square root of number
            else if(opt==2){
                System.out.println("Enter any Number : ");
                int num = scanner.nextInt();
                double sqrt = Math.sqrt(num);
                System.out.println("Square root of "+num+" = "+sqrt);
            }
            //log of number
            else if(opt==3){
                System.out.println("Enter any Number : ");
                double num = scanner.nextDouble();
                double log = Math.log(num);
                System.out.println("Log of "+num+" = "+log);
            }
            //log of number with base 10
            else if(opt==4){
                System.out.println("Enter any Number : ");
                double num = scanner.nextDouble();
                double log = Math.log10(num);
                System.out.println("Log of "+num+" with base 10 = "+log);
            }
        }
        else {
            System.out.println("Please enter valid number !!!");
        }
    }
}