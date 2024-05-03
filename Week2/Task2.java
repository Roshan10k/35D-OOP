package Week2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
         * 1. Write a program to check whether a person can cast a vote or not. The
         * condition is you must be over 18 years old to vote.
         * 
         */

        int age = 19;
        if (age > 18) {
            System.out.println("You are allowed to cast vote.");
        } else {
            System.out.println("You are not allowed to cast vote.");
        }
        /*
         * 2. Write a program to calculate SI.
         * 
         * Formula Simple Interest = (PrincipleAmount*Time*Rate/100);
         */

        int PrincipleAmount = 9000;
        int Time = 2;
        int Rate = 8;

        int SimpleIntrest = (PrincipleAmount * Time * Rate / 100);
        System.out.println("The Simple Intrest is " + SimpleIntrest);

        /*
         * 3. Write a program to calculate, area of the triangle, and the Volume of the
         * Cube and Cuboid.
         * 
         * Formula: Volume of Cuboid = length*width*height; and Volume of Cube:
         * side*side*side;
         */
        int length = 12;
        int width = 10;
        int height = 15;
        int side = 8;

        int VolumeOfCuboid = (length * width * height);
        System.out.println("The Volume of cubid is " + VolumeOfCuboid + " unit^3");

        int volumeofcube = (side * side * side);
        System.out.println("Volume of cube is " + volumeofcube + " unit^3");

        /* 4. Write the ternary operator for question no. 1 */

        int age1 = 20;
        String canVote = (age1 >= 18) ? "Can vote" : "Cannot vote";

        System.out.println(canVote);

        /*
         * 5. Write a program to take two integer inputs from the user and print the sum
         * and product of them.
         */

        /*
         * Scanner scanner = new Scanner(System.in);
         * 
         * System.out.println("Enter the first integer: ");
         * int firstInt = scanner.nextInt();
         * 
         * System.out.println("Enter the second integer: ");
         * int secondInt = scanner.nextInt();
         * 
         * int sum = firstInt + secondInt;
         * System.out.println("Sum of the two integers: " + sum);
         * 
         * int product = firstInt * secondInt;
         * System.out.println("Product of the two integers: " + product);
         * 
         * scanner.close();
         */

        /*
         * 6. Take two integer inputs from the user. First, calculate the sum of two,
         * then the product of two. Finally, calculate the division of the thus obtained
         * sum and product and print the result.
         */

        /*
         * Scanner scanner2 = new Scanner(System.in);
         * System.out.println("Enter the first integer: ");
         * int firstInt = scanner2.nextInt();
         * 
         * System.out.println("Enter the second integer: ");
         * int secondInt = scanner2.nextInt();
         * 
         * int sum = firstInt + secondInt;
         * 
         * int product = firstInt * secondInt;
         * 
         * if (product != 0) {
         * double divisionResult = (double) sum / product;
         * System.out.println("Division of the sum and product: " + divisionResult);
         * } else {
         * System.out.println("Cannot divide by zero. Product is zero.");
         * }
         * scanner2.close();
         * 
         * /*
         * 7. Take the name, roll number, and field of interest from the user and print
         * in the format below: Hey, my name is XYZ and my roll number is XYZ. My field
         * of interest are xyz.
         */

        /*
         * Scanner scan = new Scanner(System.in);
         * System.out.println("Enter your name: ");
         * String name = scan.nextLine();
         * System.out.println("Enter your roll number: ");
         * String roll = scan.nextLine();
         * System.out.println("Enter your field of intrest: ");
         * String intrest = scan.nextLine();
         * 
         * System.out.println("Hey, my name is " + name + " and my roll number is " +
         * roll + ". My field of intrest are " + intrest +".");
         * 
         * scan.close();
         */

        /*
         * 8. Take side of a square from user and print area and perimeter of it. Also,
         * calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid.
         * Take the attributes as user input.
         *
         */

         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the length of square: ");
         int Squarelength = scan.nextInt();
         int areaOfSquare = Squarelength*Squarelength;
         int perimeterOfSquare = 4*Squarelength;
         System.out.println("The area of square is " + areaOfSquare + " Unit^2 " + "and perimeter is " + perimeterOfSquare + " unit.");

         // 9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
        System.out.println("Enter the length of rectangle:");
        double l = scan.nextDouble();
        System.out.println("Enter the breadth of rectangle");
        double b = scan.nextDouble();
        double  Area = l * b;
        int intarea = (int) Area;
        System.out.println("The area is " + intarea);


        // 10. Write a program to calculate the total marks of four subjects of a student and
        // the total percentage secured. And use the following conditions to generate the final result;
        // a. If equal to or more than 70 -> First Class
        // b. If more than 59 -> Upper Second Class
        // c. If more than 49 -> Second class
        // d. If more than 39 -> Third class and if below than 40 the result is fail. 

        System.out.println("enter the marks of First subject");
        int first = scan.nextInt();
        System.out.println("Enter the marks of second subject");
        int second = scan.nextInt();
        System.out.println("enter the marks of third subject");
        int third = scan.nextInt();
        System.out.println("Enter the marks of fourth subject");
        int fourth = scan.nextInt();
        int Total = first+second+third+fourth;
        double Per = (Total/4.0);
        System.out.println("Total marks " + Total);
        System.out.println("Percentage is " + Per);
        String result = (Per>= 70) ? "First Class" :
                        (Per> 59) ? "Upper Second Class" :
                        (Per> 49) ? "Second Class" :
                        (Per> 39) ? "Third Class" : "Fail";
        System.out.println(result);
        scan.close();


    }

}