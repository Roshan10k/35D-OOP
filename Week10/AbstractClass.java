package Week10;

public class AbstractClass {
    public static void main(String[] args) {

        Samsung smg = new Samsung();
        smg.call();
        smg.message();
        System.out.println(smg.text("Welcome"));

        Apple ap = new Apple();
        ap.call();
        ap.message();
        System.out.println(ap.text("Wleome"));
        
    }
}

//to make abstract class, use abstract keyword before "Class"
//if a class is abstract, it cannot be make object of
abstract class SmartPhone{
    //abstract function do not have body
    //abstract class may or may not contain abstract function
    //if there is at least one abstract function, class have to be abstract

    abstract public void call();
    abstract public void message();
    abstract public boolean text(String text);
}

//to use abstract class it has to be extended into sub/child class
class Samsung extends SmartPhone{
    //when abstract class is extended
    // aal the abstract function must be overridden/implemented
    @Override
    public void call(){
        System.out.println("Samsung calling");
    }

    @Override
    public void message(){
        System.out.println("Samsung message");
    }

    @Override
    public boolean text(String text){
        return true;

    }
}

//Task create a class Apple that extends SmartPhone
//override the functions
//Make an object of samsung and apple
//and call all the functions

class Apple extends SmartPhone{
    @Override
    public void call(){
        System.out.println("Apple is calling");
    }

    @Override
    public void message(){
        System.out.println("Apple is messaging");

    }

    @Override
    public  boolean text(String text){
        return true;

    }
}

