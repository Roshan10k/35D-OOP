package Week4;

public class ForLoop {
    public static void main(String[] args) {
        /*USe for loop when condition is fixed */
        for(int index = 0; index < 5; index ++){
            System.out.println("Loop running" +index);
        }

        /*Decrement loop */
        for(int index = 10; index >=0; index--){
            System.out.println("Loop running" +index);
        }

        /*Task 
         * Make a multiplication table of 2
         * Note:initialize 1
         * condition <= 10 or <11
         * increment +=
         
        */
        for(int index = 1; index <= 10; index ++){
            System.out.println( "2 x "+index + "=" +index*2 );
        }

        /*Nested Loop */
        for(int outer = 0; outer < 3; outer ++){
            for(int inner = 2; inner >=0; inner --){
                System.out.println("Inner" +inner);
            }
            System.out.println("outer"+ outer);
        }
        /*Task use nested loop to do the following
         * Make multiplication table from 1-10
         */
        for(int outer =1; outer<= 10; outer++){
            System.out.println("Multiplication of "+outer);
            for(int inner=1; inner<=10; inner++){
                System.out.println(outer+" x "+inner+" = "+inner*outer);
                
            }
        }

    }
    
}

/*Working:
 *For loop table for increment
 * initialize-index 0
 * condition- index < 5
 * modify- index++
 * 
 * index counter           Condition             Statement            Modify
 *  0                        0 < 5              print(0)               0++=0+1=1
 * 1                        1 < 5              print(1)               1++=1+1=2
 * 2                        2 < 5              print(2)               2++=2+1=3
 * 3                       3 < 5              print(3)               3++=3+1=4
 * 4                        4 < 5              print(4)               4++=4+1=5
 * 5                        5 < 5(false) end
 */


 /*Working:
 *For loop table for decrement
 * initialize-index 10
 * condition- index >= 0
 * modify- index--
 * 
 * index counter           Condition             Statement            Modify
 * 10                       10 >=0             print(10)              10--=10-1=9
 * 9                       9 >=0             print(9)                  9--=9-1=8
 * 8                      8 >=0             print(8)                  8--=8-1=7
 * 7                       7 >=0             print(7)                  7--=7-1=6
 * 6                       6 >=0             print(6)                  6--=6-1=5
 * 5                       5 >=0             print(5)                  5--=5-1=4
 * 4                       4 >=0             print(4)                  4--=4-1=3
 * 3                       3 >=0             print(3)                  3--=3-1=2
 * 2                       2 >=0             print(2)                  2--=2-1=1
 * 1                       1 >=0             print(1)                  1--=1-1=0
 * 0                       0 >=0             print(0)                  0--=0-1=-1
 * -1                      -1 >= 0(False) End
 */