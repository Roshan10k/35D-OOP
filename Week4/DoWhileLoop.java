package Week4;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int num1 = 0;
        while(num1 < 0){
            System.out.println("While checks condition first");
        }

        /*Do while checks condition after first iteration */
        do{
            System.out.println("Do while checks condition after");
        }while(num1 < 0);
        /*This means do while loop runs at least once */

        /*Task
         * Use a while loop to
         * ask user for an int value
         * if the user input positive value
         * prompt user to input negative value
         * loop until the user input negative int value
         */
        System.out.println("Input a negative value");
        Scanner scan = new Scanner(System.in);
        int inputValue = scan.nextInt();
        while(inputValue >= 0){
            System.out.println("Please input negative value ");
            inputValue = scan.nextInt();
        }
        System.out.println("The negative value is "+inputValue);
        scan.close();

    }
    
}
