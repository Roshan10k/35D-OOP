package Week9;

public class InheritanceClass {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.lastname = "Test";
        cc.firstname = "ABC";
        cc.info();
        cc.greet();

        Grandchild gc = new Grandchild();
        gc.firstname = "John";
        gc.middlename ="bahadur";
        gc.lastname ="Cena";
        gc.info();
        gc.call();
        

    }
    
}

class ParentClass{
    String lastname;
    private int Salary;
    protected String address;

    void info(){
        System.out.println("lastname"+ lastname);
    }

}

//extends keyword used to create a child class
//single level, one parent has one child
class ChildClass extends ParentClass{
    String firstname;
    void greet(){
        System.out.println("Firstname: " + firstname + " Lastname: "+ lastname);
    }

}

//multi level
class Grandchild extends ChildClass{
    String middlename;
    void call(){
        System.out.println(firstname + " " +middlename + " " +lastname);
    }
}

//Tree
class UncleClass extends ParentClass{
    String job;
    void detail(){
        System.out.println(job + " "+lastname);
    }
}