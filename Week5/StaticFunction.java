package Week5;

public class StaticFunction {
    /*in the following public and static is optional */
    public static int addTwoNumber(int a , int b){
        int sum = a+b;
        return sum;
    }

    public static String vendingMachine(int menu){
        if(menu == 1){
            return "Coke";
        }
        if(menu ==2){
            return "Water";
        }
        if(menu == 3){
            return "Frooti";

        }
        return "Nothing";
    }

    public static boolean checkEven(int num){
        if(num%2==0){
            return true;

        }
        return false;
    }

    public static String checkEligible(int c, String name){
        if(c <18){
            return "Sorry"+name+ ", you are not eligible";
        }
        return "Congratulation"+name+ ", you are not eligible";
    }

    public static double makeMultiply(double num1, double num2){
        return num1*num2;
    }
    public static void main(String[] args) {
        //If a function is static no need to make object
        //If  the function is static in same class you can simply call the method
        int sunReturn = addTwoNumber(10, 30);
        System.out.println("The sum is " +sunReturn);


        String frooti = vendingMachine(3);
        System.out.println("Frooti check "+frooti);
        /*Task make a function checkEven
         * that takes one int
         * that returns a boolean
         * if the int is even return true else false
         */

         boolean checkTrue= checkEven(4);
         System.out.println("the number is even: "+checkTrue);

         /*Task 2
          * make a function checkEligible
          that takes one int age, one String name
          if the age is < 18
          return String "Sorry name, you are not eligible"
          else return"Congratulation name, you are eligible
          */

        System.out.println(checkEligible(19, "Nishad"));

        /*Task 3
         * make a function makeMultiply
         * take two double
         * multiply the two double
         */
        System.out.println(makeMultiply(10.5, 1.5));

         

         

    }
}
