package Week6;

public class MultiDimArray {
    public static void main(String[] args) {
        /*create N-dimension array add number of square bracket */
        /*1D Array */
        int[] oneDArray;
        /*2D Array */
        int[][] twoDArray;
        /*3D Array */
        int[][][] threeDArray;

        /* Allocating memory/size */
        twoDArray = new int[3][5];
        /*First size 3 represent how many inner array */
        /*Second size 5 represent how many value in inner array */
        /*[
            [0,0,0,0,0],
            [0,0,0,0,0],
            [0,0,0,0,0]
        ]
         */

         /*To take the first inner array use index */
         //twoDArray[0];
         /* To take the value in first inner array use internal index */
         twoDArray[0][0]= 10;
         twoDArray[0][1] = 20;
         twoDArray[1][2] = 100;
         twoDArray[2][4] = 200;

         /* Fill the Array like the following 
          * [
            [10,20,30,40,50],-> 0
            [80,90,100,110,120], -> 1
            [150,160,170,180,200], ->2
          ]
         */
         twoDArray[0][2]= 30;
         twoDArray[0][3] = 40;
         twoDArray[0][4] = 50;
         
         twoDArray[1][0] = 80;
         twoDArray[1][1]= 90;
         twoDArray[1][3] = 110;
         twoDArray[1][4] = 120;
         
         
         twoDArray[2][0]= 150;
         twoDArray[2][1] = 160;
         twoDArray[2][2] = 170;
         twoDArray[2][3] = 180;
         
         /*Print
          * Array in 1th Index
          80
          90
          100
          110
          120
          Note:without using loop
          */

          System.out.println(twoDArray[1][0]);
          System.out.println(twoDArray[1][1]);
          System.out.println(twoDArray[1][2]);
          System.out.println(twoDArray[1][3]);
          System.out.println(twoDArray[1][4]);
         
          /*Multi Dim Array memory alloc and assignment */
          int[][] arrayTwo={
            {10,20,30},
            {20,30,40},
            {100,200,300}
          };


    }
}
