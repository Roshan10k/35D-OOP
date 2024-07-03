package Week9;

public class InheritanceExample {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.lifeSpan = 18;
        labrador.legs = 4;
        labrador.Diet ="Masu Bhaat";
        labrador.speaks();
        labrador.fur();
        labrador.barks();

        Reptile snake = new Reptile();
        snake.lifeSpan = 6;
        snake.speaks();
        snake.eggs = 2;
        snake.shed();



        
    }
}

class Animal{
    int lifeSpan;

    void speaks(){
        System.out.println("I live for "+lifeSpan +" years");
    }



}

class Mammal extends Animal{
    int legs;

    void fur(){
        System.out.println("I have sexy "+legs +" legs.");

    }
}

class Dog extends Mammal{
    String Diet;

    void barks(){
        System.out.println("I have "+Diet+" to bark as loud as I can.");
    }
}

class Reptile extends Animal{
    int eggs;

    void shed(){
        System.out.println("I shed"+ eggs+" eggs a day");
    }
}
