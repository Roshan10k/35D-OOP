package Week6;
import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {
        /*Import ArrayList from java.util */
        ArrayList<String> names = new ArrayList<>();


        names.add("Aayam");
        names.add("Aadhar");
        names.add("Yausan");
        names.add("Niraj");
        names.add("Ayush");
        names.add("Rijan");

        /*To loop , find the length/element count, .size() */
        int namesLength= names.size();
        /* Loop same as array */
        for(int index = 0; index < namesLength; index++){
            //Get each element with .get(index)
            String singleName = names.get(index);
            System.out.println("Index : "+index +" Value "+ singleName);
        }

        /*Using foreach in java, iterate with element/actual value */
        for(String element: names){
            System.out.println(element);
        }

        /*Task 
         * Make an ArrayList animals
         * ["Cat","Tiger","Dog","Elephant"]
         * make two more ArrayList called wildanimal,domesticAnimal
         * loop the animals
         * If the element/Value is "Cat" ,"Dog" add in domesticAnimal
         * If the element/Value is "Tiger" ,"Elephant" add in wildAnimal
         * Print domesticAnimal, wildAnimal
         */

         ArrayList<String> animals = new ArrayList<>();
         ArrayList<String> domesticAnimals = new ArrayList<>();
         ArrayList<String> wildAnimals = new ArrayList<>();
         animals.add("Cat");
         animals.add("Tiger");
         animals.add("Dog");
         animals.add("Elephant");
         System.out.println(animals);
        
         for(String item: animals){
            if(item=="Cat" || item=="Dog"){
                domesticAnimals.add(item);


            }else{
                wildAnimals.add(item);
            }

         }

         System.out.println(domesticAnimals);
         System.out.println(wildAnimals);
    }
    
}
