package Week2;

public class Variable {
    /*Instance Variable 
     * Will need object to access this variable
     * Not shared between the object
    */
    int instanceVariable=100;
    /*static/Class Variable
     * No need of object, can be called from class
     * shared between the objects
     */
    static int staticVariable=20;


    public static void main(String[] args) {
        /*Non Primitive data type */
        /*Declaration */
        byte byteValue;
        /*Initialization */
        byteValue=100;
        /*Declaration and Initialization */
        short shortValue =200;
        /*Multiple declaration */
        int intValue1, intValue2;
        intValue1=10000;
        intValue2=2000;
        /*Multiple declaration and initialization */
        long longVal1=-9000, longValue2=9000;
        float floatValue=90.90f; //the letter 'f' is needed 
        double doubleValue= 100.897d; // the letter 'd' is optional
        char charValue ='c'; // must be single quote '
        boolean booleanValue=false;
        /*Illegal actions below */
        //byte byteValue= 100; //we cannot redeclare the variable
        //byteValue=200; // instead use reassignment 
        //boolean boolVal2='false'; // cannot use different type
        //byte byteValue2=100000000; //cannot exceed min and max

        /*Non primitive data type */
        String stringValue = "This is a string value";
        /*Using class */
        String stringValue2=new String("This string uses class");
        System.out.println(stringValue2);
        /*Object, for this we can use the same public class made */
        Variable variableObject= new Variable();
        /*use object from above to access instance variable */
        System.out.println(variableObject.instanceVariable);
        /*use class to use static variable */
        System.out.println(Variable.staticVariable);

        /*Type Casting */
        int intValueType= 100;
        double intValueConvertedToDouble=intValueType;
        /*Automatically cast from low datatype to high datatype */

        /*Explicit Casting */
        double doubleValueType= 190.8109;
        int doubleValueConvertedToInt= (int) doubleValue;
        /*Manually specify data type for eg. (int) */
        /*Note this type cast only can be done in primitive data type */ 
        
        
        
        /*Task
         * Make one double variable called doubleVar1=1000.12
         * Explicitly cast the variable into float, floatVar1
         * Explicitly cast the floatVar1 into int
         * Make a string variable with "The integer is"
         * Print the string variable and print the int variable in another
         */

        double doubleVar1=1000.12;
        float floatVar1= (float) doubleVar1;
        int intVar1= (int)floatVar1;
        String info="The integer is";
        System.out.println(info);
        



    }
    
}
