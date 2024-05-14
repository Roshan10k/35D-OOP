package Week6;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] data = {10,20,30,40,50};
        int arrayLength= data.length;
        /*first approach */
        for(int index=0;index < arrayLength; index++){
            System.out.println("Index "+index+" Value "+data[index]);
        }
        System.out.println("Using length -1");
        /*second approach */
        for(int index=0; index <=arrayLength -1; index++){
            System.out.println("Index "+index+" Value " +data[index]);
        }

        //data[100]; this will crash , no index accessible

        /*Task Make an array of length 10
         * Add the value as 10,20,30,40,50,60,70,80,90,100
         * Make another array with same length 10
         * add the value of first array in negative onto second array
         * second array should be -10,-20,-30,-40,-50,-60,-70,-80,-90,-100
         * Print the second array
         */

         int[] arr={10,20,30,40,50,60,70,80,90,100};
         int[] arr2= new int[10];
         int arrLength= arr.length;
         for(int i=0; i<arr.length;i++){
            arr2[i]=-arr[i];
            System.out.println(arr2[i]);  
         }


         /*Task
          * print the seccond array in descending order
          */
          for(int i=9; i>-1;i--){
            
            System.out.println(arr2[i]);
          }

    }
    
}
