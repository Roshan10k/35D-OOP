package Week12;
public class ExceptionHandling{
    public static void main(String[] args){
        System.out.println("Program start");
        int num1 = 100;
        try{
            int num2 = 100/ 0 ; // exception - program ends here
        }catch(ArithmeticException ex){
            System.out.println("Number error");
        }finally{
            System.out.println("I run with or without exception");
        }

        int[] numArr = new int[5];
        numArr[0] = 10;
        try{
            numArr[100] = 20;
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Array not long enough");
        }

        String data = null;
        // Any class can be set to null
        try{
            System.out.println(data.length()); // data.length() - number of character
        }catch(NullPointerException ex){
            System.out.println("Null data");
        }
        // Multi-level try-catch
        try{
            int inD1 = 10;
            int inD2 = 10/0;
            String data2 = null;
            System.out.println(data2.length());
            System.out.println("Try exit");
        }catch(ArithmeticException ex){
            System.out.println("Number exception");
        }catch(NullPointerException ex){
            System.out.println("Null ayo");
        }finally{
            System.out.println("Exiting try ");
        }

        // Student ko best exception
        try{
            int number1 = 10;
            int number2 = 20/0;
            String data3 = null;
            System.out.println(data3.length());
            int[] intArr10 = new int[10];
            intArr10[20] = 10000;
        }catch(Exception ex){
            System.out.println("I catch any exception");
        }
        // throwExample(10);
        try{
            ensureException(); // to run this function, must be inside try catch
        }catch(Exception ex){
            System.out.println("Exception");
        }
        // Task
        // Find the exception and use try block finally accordingly
        try{
        int number1 = 10;
        int number2 = number1 - 10;
        int number3 = number1 / number2;
        }catch(ArithmeticException ex){
            System.out.println("Arithmetic exception");
        }
        try{
        String name = null;
        
        System.out.println(name.length());
        }catch(NullPointerException ex){
            System.out.println("Null pointer exception");
        }
        String[] names = new String[100];
        try{
        names[0] = "Ram";
        names[110] = "Oskar";
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutofbound exception");
        }
        


        



        System.out.println("Program stop");
    }

    static void throwExample(int num){
        if(num < 18){
            // manually throw an exception
            throw new ArithmeticException("Not eligible");
        }
    }
    static void ensureException() throws Exception{
        System.out.println("To run this must wrap in try catch");
    }
}
