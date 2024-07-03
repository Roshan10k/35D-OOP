package Week6;
import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        /*To use ArrayList import at the top like Scanner from java.utils */
        ArrayList<String> animals = new ArrayList<>();
        /*Size is automatically allocated according to the element */
        /*To add data in animals */
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");
        System.out.println(animals);
        /*Can add element directly to index, it will shift rest to +1 of index */
        animals.add(1,"Tiger");
        System.out.println(animals);
        /*Notice how the previous 1 and rest are dhifted by 1 index */

        /*To remove use .remove(index) */
        animals.remove(2);
        System.out.println(animals);
        /*It will remove the item/element in 2nd index */

        //To update .set(index,value)
        animals.set(1,"Snake");
        System.out.println(animals);
        //to access cannot use [index] -> square bracket, use.get(index)
        System.out.println(animals.get(0));//get 0th indexed element


        /*Task
         * Make an ArrayList of int
         * [100,200,300,400,500]
         * remove the value 300
         * Add -100 at the first of Array List
         * change 200->210
         * change 400->420
         * Print the Array List
         */

         ArrayList<Integer> intArrayList = new ArrayList<>();
         intArrayList.add(100);
         intArrayList.add(200);
         intArrayList.add(300);
         intArrayList.add(400);
         intArrayList.add(500);

         intArrayList.remove(2);
         System.out.println(intArrayList);
         intArrayList.add(0, -100);
         System.out.println(intArrayList);
         intArrayList.set(2,210);
         System.out.println(intArrayList);
         intArrayList.set(3, 420);
         System.out.println(intArrayList);
         
    }
}
