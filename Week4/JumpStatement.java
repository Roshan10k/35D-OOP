package Week4;

public class JumpStatement {
    public static void main(String[] args) {
        /*break and continue are jump statement in java */
        /*break will terminate the loop */
        for(int index = 0; index < 5; index++){
            if(index ==3){
                break; //this line will break the loop scope
            }
            System.out.println("Index "+index);
        }
        /*can be used in any loop */
        int count = 0;
        while(count <= 10){
            if(count == 1){
                break;
            }
            System.out.println("count "+count);
            count++;
        }
        /*continue statement will skip the loops */
        for(int index = 0; index < 5; index++){
            if(index ==3){
                continue;
            }
            System.out.println("continue index" +index); 
        }
        
        /*Task WAP to run for loop from -5 to 5
         * break the loop if the index is positive
         */

         /*Task2
          * Loop from 1-20 using any loop
          only print the value if it is even
          Use continue to do this task
          */

        //Task1
        for(int index = -5; index <= 5; index++){
            if(index > 0){
                break;
            }
            System.out.println(index);
        }
        //Task2
        for(int i=1; i<=20;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }


    }   
    
}
