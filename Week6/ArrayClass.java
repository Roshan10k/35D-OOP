package Week6;

public class ArrayClass {
    public static void main(String[] args) {
        /* to create an array define datatype followed by [] */
        int[] myFirstArray;
        /*Initializing the array we need new reference */
        myFirstArray = new int[6]; // here the new int[6] -> refers to the size of array
        /* The size of an array can be further access by length */
        int myFirstArrayLength = myFirstArray.length;
        System.out.println("My first array size is " +myFirstArrayLength);


        /*Using index for array operation */
        myFirstArray[0] = 10;
        myFirstArray[1] = 30;
        myFirstArray[2] = 100;

        /*To print the array use the same index */
        System.out.println(("The first element is in 0 index " +myFirstArray[0]));
        /* Can also create  anew int Value */
        int secondArrayIndex = myFirstArray[1];
        System.out.println("The second element stored " +secondArrayIndex);


        /*Declaration and Initialization */
        int [] mySecondArray = new int[6];

        /*Declaration, Initialization and Value Assign */
        int[] myThirdArray = {10,20,30,0,100};
        /*or using constructor */
        int[] myFourthArray= new int[]{1,2,3,4};


        /*Task
         * Create a array of int called myFifthArray
         * with size of 5
         * insert the value of 10,20,30,40,50
         * print the value of an array as well as the multiplied by 2
         * Eg:
         * 10 20
         * 20 40
         * 30 60
         * 40 80
         * 50 100
         */

         int[] myFifthArray = new int[5];
         myFifthArray[0]=10;
         myFifthArray[1]=20;
         myFifthArray[2]=30;
         myFifthArray[3]=40;
         myFifthArray[4]=50;
         for(int i=0; i< myFifthArray.length; i++){
            System.out.print(myFifthArray[i]);
            System.out.println(" " +myFifthArray[i]*2);
            
            
         }
    }


    

}
