package Week10;
public class InterfaceClass {
    public static void main(String[] args) {
       
    }
}

// make interface similar to class with "interface" keyword
// interface is automatically abstract
interface AnimalInterface{
    // function inside the interface is automatically abstract
    // function hidden or no body
    public void eat();
    public void sleep();

}

// interface can extend interface
interface MammalInterface extends AnimalInterface {
    public int legs();
}
// can nest on mutilevel
interface DogInterface extends MammalInterface{
    public String barks();
}
interface DomesticInterface{
    public void pet();
}

// class can implement multiple interface
// when so both of interface function should be Overriden
class Husky implements DogInterface,DomesticInterface {
    // if the interface is built/extended on the top of another interface
    // all the function on the top of the interface should be Overriden

    @Override
    public void pet(){
        System.out.println("Huskey likes pet");
    }

    @Override
    public void eat(){
        System.out.println("Huskey eats fish");
    }
    @Override
    public void sleep(){
        System.out.println("Husky sleeps at dusk");
    }
    @Override
    public int legs(){
        return 4;
    }

    @Override
    public String barks(){
        return "woof woof";
    }
}
// to use interface use "implements" keyword
class Bulldog implements AnimalInterface{
    // using interface, we need to Override/make body of all the function of interface
    @Override
    public void eat(){
        System.out.println("Bulldog eats meat");
    }
   
    @Override
    public void sleep(){
        System.out.println("Bulldog sleeps at night");
    }
}

class Cow implements AnimalInterface{
    @Override
    public void eat(){
        System.out.println("cow eats meat");
    }
   
    @Override
    public void sleep(){
        System.out.println("cow sleeps at Morning");
    }
}