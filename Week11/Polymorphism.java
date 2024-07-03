package Week11;

public class Polymorphism {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println(mo.add(10, 20));
        System.out.println(mo.add(1, 2, 3));
        mo.add();

        //method overriding
        //Polymorphism
        //hold child class Object

        Document d1 = new Document();
        d1.print("Dell XPS");
        Document d2 = new MsWord();
        d2.print("Xeroz");
        //when doing so, though we are creating
        //from Childclass MsWord() we can
        //only function/attribute from Document

        Document d3 = new Office365();
        d3.print("Xeroz");
        //cannot access d3.internet
    }
    
}

//method overLoading
//same function with difference in parameter 

class MathOperation{
    int add(int num1, int num2){
        return num1 + num2;
    }


//1.Method overloading with change in number of parameter
int add(int num1, int num2, int num3){
    return num1 + num2 + num3;
}

//2.Method overloading with change in data type
double add(double num1, double num2){
    return num1 + num2;
}

//Note:the change in return type doesnot determine overloading
//method overloading only determine with change in parameter
//Also, changing the variable name is also not allowed 
//Eg: int add(int a, int b) -> not allowed
//as function with 2 int is already made

void add(){
    System.out.println("Invalid Operation");
}


}

//Method Overriding
//When Childclass has the same function as Parent class
class Document{
    public void print(String printer){
        System.out.println("Document Printing");
    }
}

//Method Overriding can only be done in child class
class MsWord extends Document{
    @Override
    public void print(String printer){
        System.out.println("Ms word prints");
    }
}

class Office365 extends MsWord{
    boolean internet = true;
    //overriding can be done in multi layer inheritance
    @Override
    public void print(String printer){
        System.out.println("Online Printer");
    }
}


