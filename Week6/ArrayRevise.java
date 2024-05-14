package Week6;

public class ArrayRevise {
    
        /*Make a function named arrayFinder
             * that takes array of String and String finder
             * return the index if found else return -1
             */
            public static int arrayFinder(String[] arr, String find) {
                for (int index = 0; index < arr.length;index++){
                    if (arr[index] == find){
                        return index;
                    }
                }
                return -1;
            }
            /*Make a function addToArray
             * that takes array of int, int value
             * loop array of int and add the value to each element
             * returns array of int of new value
             * eg.[ 1,2,3,4] ,10
             * Returns[11,12,13,14]
             */
    
             public static int[] addToArray (int[] arr, int value) {
                int[]newArray = new int[arr.length];
                for(int index = 0; index < arr.length; index ++){
                    newArray[index] = arr[index]+ value;
    
                }
                return newArray;
    
               
             }
    
             /*Make a function reverseArray
              * takes array of int
              return new array of reversed index
              Eg[1,2,3,4]
              returns[4,3,2,1]
              */
    
        public static void main(String[] args) {
            /*3 ways to create array */
            int[] arrayOne;
            arrayOne = new int[2]; // -> [0,0]
            int[] arraySecond = new int[2]; // -> [0,0]
            int[] arrayTwo = {1,2,3,4,5,10}; // -> [1,2,4,5,10]
    
            System.out.println(arrayTwo[3]);
            arrayTwo[1]= 200;
    
            /*Looping an array */
            int arrayTwoLength= arrayTwo.length;
            for(int index = 0; index< arrayTwoLength; index ++){
                System.out.println("Index: " + index +  "Value: " + arrayTwo[index]);
    
            }
            /*Or loop from 0 <= arrayTwoLength - 1 */
    
            String[] names = {"Ram","John","Shyam","Doe"};
            String finder = "Shyam";
            /*Loop names and find the index of shyam */
            for(int index = 0; index < names.length; index ++){
                if (names [index] == finder){
                    System.out.println("Index found" + index);
                    break;
    
                }
            }
           
    
        }
    }

