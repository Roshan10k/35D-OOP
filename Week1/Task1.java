package Week1;

public class Task1{
    public static void main(String[] args) {
        /* 1. Write a program that prints Hello World! to the console. Save the program as Hello.java. */
        System.out.println("hello world");
        /*2. Extend/Modify the above program to print two additional lines:

This is my first program

I am on module ST4003CEM

System.out.print (not println) and produces the same output. */
        System.out.print("This is my first program\nI am on module ST4003CEM\n");

        /*3. Write a program that prints the following output:

A "quoted" String is

'much' better if you learn

the rules of "escape sequences."

Also, "" represents an empty

String. Don't forget: use \"

instead of " !

'' is not the same as "

 */
        System.out.print("A \"quoted\" String is\n 'much' better if you learn\nthe rules of \"escape sequences.\"\nAlso, \"\" represents an empty\n String.Don't forget:use\"\ninstead of \"!\n\"is not same as \"\n");
        
       /*  4. WAP that prints the following pattern:

        *
        
        **
        
        ***
        
        ****  */

        System.out.println("*\n**\n***\n****\n");
        /*5. WAP prints the following pattern:

*********

*********

*********

********* */
        System.out.println("*********\n*********\n*********\n*********\n");

        /*6. WAP that prints the following output:

A well-formed Java program has a main method with { and } braces.


A System.out.println statement has ( and ) and usually a 
String that starts and ends with a " character.
(But we type \" instead!)
What is the difference between
a ' and a "?  Or between a " and a \"?


One is what we see when we're typing our program. The other is what 
appears on the "console."

 */
        System.out.println("A well-formed Java program has a main method with { and } braces.\n\nA System.out.println statement has ( and ) and usually a \n" + //
                "String that starts and ends with a \" character.\n" + //
                "(But we type \\\" instead!)\n" + //
                "What is the difference between\n" + //
                "a ' and a \"?  Or between a \" and a \\\"?\n\nOne is what we see when we're typing our program. The other is what \n" + //
                        "appears on the \"console.\"\n" + //
                        "");
    }
}