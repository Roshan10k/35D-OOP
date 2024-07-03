package Week7;

public class ConstructorClass {
    public static void main(String[] args) {
        ConExample con1 = new ConExample();
        System.out.println("After object creation");
        ParameterizedConstructor pc1= new ParameterizedConstructor(10);
        System.out.println("From object: "+pc1.length);

        FruitBasket fb = new FruitBasket(10, 10, 10);
        System.out.println("total count is "+fb.totalFruits(10, 11, 12));
        
    }
    
}

//Task
//Make a class FruitBasket
//make private attribute, appleCount, cherryCount, grapeCount
//make constructor and set all attribute
//make a function  that returns total count of fruits
//make 2 objects
//print the total counts of all objects

class ConExample{
    ConExample(){
        System.out.println("Tbis is non parameterized constructor");
    }

}

class ParameterizedConstructor{
    int length;
    ParameterizedConstructor(int length){
        this.length = length;
        System.out.println(this.length);
    }
}

class FruitBasket{
    private int appleCount;
    private int cherryCount;
    private int grapeCount;
   
    FruitBasket(int appleCount, int cherryCount, int grapeCount){
        this.appleCount= appleCount;
        this.cherryCount = cherryCount;
        this. grapeCount = grapeCount;



    }

    int totalFruits(int appleCount,int cherryCount, int grapeCount){
       int totalFruitCount = appleCount + cherryCount + grapeCount;
       return totalFruitCount;
    }
}


