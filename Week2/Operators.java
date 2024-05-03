package Week2;

public class Operators {
    public static void main(String[] args) {
        /*Airthmetic Operators */
        int a=10, b=10;
        int sum=a+b; //here the "+" is an airthmetic operators
        System.out.println("Addition for a+b is "+ sum);
        System.out.println("Diffrence for a-b is "+(a-b));
        System.out.println("Multiplication  for axb is "+(a*b));
        System.out.println("Division for a/b is "+(a/b));
        System.out.println("Modulo for a and b is "+(a%b));

        /*Assignment Operators */
        int aNumber1;
        aNumber1=10;
        /*or declare and assign */
        int aNumber2=20;
        /* assign with another variable */
        int aNumber3=aNumber1;
        System.out.println("Assignment with += " + (aNumber1+=10));
        aNumber2-=30; //same as aNumber2=aNumber2-30;
        System.out.println("Assignment with -= " + aNumber2);

        /*Relational Operators */
        int rNumber1=10, rNumber2=20;
        System.out.println("rNumber1 equals to rNumber2 "+(rNumber1 ==rNumber2));
        System.out.println("rNumber1 greater than rNumber2 "+(rNumber1>rNumber2));
        System.out.println("rNumber1 less than or equals to rNumber2 "+(rNumber1<=rNumber2));
        System.out.println("rNumber1 not equals to rNumber2 "+(rNumber1!=rNumber2));

        /*Logical Operators */
        int lNumber1=10, lNumber2=12;
        boolean lExpression1= lNumber1==lNumber2;
        boolean lExpression2= lNumber1<=lNumber2;
        System.out.println("And operator uses && "+ (lExpression1 && lExpression2));
        System.out.println("Or operator uses || "+ (lExpression1 || lExpression2));
        System.out.println("Not operator uses ! "+ !lExpression1);

        /*Unary Operator */
        int uNumber1=10;
        uNumber1++; //meaning uNumber1 +1;
        System.out.println("Unary for increment is ++ "+ uNumber1);
        uNumber1--;
        System.out.println("Unary for decrement is -- "+ uNumber1);

        /*Ternary Operators */
        int tNumber1=10, tNumber2=10;
        boolean tExpression = tNumber1 == tNumber2;
        /*
         * one line if else , see the given example in if else
         * String Output;
         * if(tExpression==true){
         * output= "True statement";
         * }else{
         * output="False statement";
         * }
         */
        String output = tExpression ? "True Statement" : "False Statement";
        /*Here we can assign a string out with one expression
         if expression is true it will return the value after the "?"
          if the expression is false it will return the value after the ":""
          */
        int numberOutput = tNumber1<tNumber2 ? 10:20;
        System.out.println(output);
        System.out.println(numberOutput);  



        /*Task1
         * Write a program to print whether a variable is greater or equal to 18
         */
        int Num1=10, Num2=18;
        System.out.println(Num1>Num2);

        /*Task2
         * Write a program to print simple interest from variables
         * make 3 variable  for amount, time and rate and save the calculation into a variable
         * Formula:
         * si=amount*time*rate/100 
         */
        int amount=10000, time=4, rate=10;
        System.out.println("Simple interest is "+ (amount*time*rate/100));

        /*Task3
         * write a program to print the area and perimeter of rectangle
         * a=l*b
         * p=2(l+b)
         */

         int length=10, breadth=8;
         System.out.println("the area of rectangle is "+ (length*breadth));
         System.out.println("the perimeter of rectangle is "+ (2*(length+breadth)));

         /*Task4
          * Complete the task 1 using ternary operators
        
          */
        int Variable1=10, Variable2=18;
        boolean gExpression= Variable1 >= Variable2;
        String result= gExpression ? "Greater or equal" : "less";
        System.out.println(result);

         

        

         }
        
    
}
