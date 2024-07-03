package Week7;



public class AcessModifier {
    public static void main(String[] args) {
        AccessExample ae1 = new AccessExample();
        //ae1.intValue = 100; yesto paidaina
        ae1.strValue = "Test";
        ae1.boolval = true;
        //ae1.doPrivate();
        ae1.setPrivate();

        Task1 info = new Task1();
        info.fillInfo("John Cena",18);
        info.address = "Koteshwor";
        info.fullInfo();

       
    }

   
}

class Task1{
    //create a private variable for Name age
    //create  public variable address
    //make a function to fill data for Name and Age
    //make a function to print Name, Age, and Address

    private String Name;
    private int age;
    public String address;
    void fillInfo(String Name, int age){
        this.Name = Name;
        this.age = age;
    }

    void fullInfo(){
        System.out.println("Name is "+this.Name+"Age is "+this.age+"Address is "+address);
    }
}

class ThisExample{
    private int length;//"this.length" in this class represent this length;
    private int breadth;
    void fillData(int length, int breadth){
        this.length = length; // this represent current class attribute
        this.breadth = breadth; //the breadth without this represent the args/parameter of function
    }
}

class AccessExample{
    private int intValue; // Can olny used inside class scope
    public String strValue;
    boolean boolval;  // automatically defult, can be used only inside a same package / folder
   
    // similarly can be used in function
    private void doPrivate(){
        System.out.println("I can be accessed only i this class");

    }
    public void doPublic(){
        System.out.println("I can be accessed from anywhere");

    }
    void doDefault(){
        System.out.println("I can be accessed from current package/folder");

    }

    // private can be used in class

    void setPrivate(){
        intValue = 100; // private can be accessed here
        doPrivate(); // same goes to private functions
    }
}