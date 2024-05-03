package Week2;
import java.util.Scanner;
/*or
 * import java.util.*;
 */
public class InputOutput {
    public static void main(String[] args) {
        /*Use Input */
        System.out.println("This sentence will have line break.");
        /*System.out.print */
        System.out.print("This will not have break");
        System.out.print("this line will continue.\n");
        /*String formatting using System.out.printf 
         * %s String, %d Integral,%f floating point,%b boolean
         * This will also not break line
        */
        System.out.printf("Hello %s, good morning","world");
        System.out.printf("the number is %d",10);
        /*can use multiple formatter  */
        System.out.printf("\nThe formatting %f and boolean %b",10.3f,false);


        /* USer Input
         * import java.util.Scanner;// copy this line a t the top of the code
         */
        // Scanner scan= new Scanner(System.in);
        // System.out.println("The following take whole sentence");
        // String wholeOutput= scan.nextLine();
        // System.out.println("the input taken is " + wholeOutput);
        // System.out.println("the following take integer");
        // int intInput= scan.nextInt();
        // System.out.println("The input taken is " + intInput);
        // System.out.println("the following take double");
        // double doubleInput= scan.nextDouble();
        // System.out.println("The input taken is " + doubleInput);
        // System.out.println("the following take boolean");
        // boolean booleanInput= scan.nextBoolean();
        // System.out.println("The input taken is " + booleanInput);
        // scan.close(); //you must close the scanner once all input is taken

        /*Task
         * Make a new scanner object scan1
         * Prompt the following and take input
         * What is your name? save the input to string -> name
         * Are you over 18? save the input to boolean -> status
         * How many sibling? save the input to integer -> sibling
         * Print the following
         * Hello name,
         * over 18?, status
         * You have sibling number of sibling
         */

         Scanner scan1= new Scanner(System.in);
         System.out.println("What is your name? ");
         String name= scan1.nextLine();
         System.out.println("Are you over 18? ");
         boolean status= scan1.nextBoolean();
         System.out.println("How many sibling? ");
         int sibling= scan1.nextInt();
         System.out.printf("hello %s,\n over 18 ? , %b \n You have %d number of sibling",name,status,sibling);
         scan1.close();

    }
    
}
