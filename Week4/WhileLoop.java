package Week4;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        /*while takes boolean expression inside() 
         * The loop will run repetitively when the boolean is true
         * If the boolean is false the loop will end
        */
        while(count<5){
            System.out.println("While loop "+ count);
            ++count;
        }
        /* In while loop the condition is checked at the beginning 
         * If the condition is false in initial check the loop will not run
        */
        System.out.println("Please type the value between 0-100");
        Scanner scan = new Scanner(System.in);
        int inputValue = scan.nextInt();
        while(inputValue < 0|| inputValue > 100){
            System.out.println("Please input between 0-100");
            inputValue = scan.nextInt();
        }
        System.out.println("End Loop");

    }
    
}
