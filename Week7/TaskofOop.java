package Week7;

public class TaskofOop {
    public static void main(String[] args) {
        car car1 = new car();
        car1.name = "BMW";
        car1.color = "Black";
        car1.year = 2021;
        car1.start();
       

        car car2 = new car();
        car2.name = "Audi";
        car2.color = "Grey";
        car2.year = 2022;
        car2.start();
        

        car car3 = new car();
        car3.name = "Ferrari";
        car3.color = "Red";
        car3.year = 2023;
        car3.start();
        car1.stop();
        int expirycar2 = car2.expiry();
        System.out.println("Expiry of car is "+expirycar2);

        int expirycar3 = car3.expiry();
        System.out.println("Expiry of car is "+expirycar3);

        student myDetail = new student();
        myDetail.firstName = "Roshan";
        myDetail.lastName = "Khadka";
        myDetail.studentId=230482;
        myDetail.age = 21;
        
        String myFullname = myDetail.fullNameIs();
        System.out.println("Full name is : "+myFullname);
        myDetail.description();
        boolean over18 = myDetail.overEighteen();
        System.out.println("Are you over 18 "+over18);
        

        
       
    }
    
}

class car{
    String name;
    String color;
    int year;

    void start(){
        System.out.println(name+" is starting");

    }

    void stop(){
        System.out.println(name+" of "+color+" is stopping");
    }

    int expiry(){
        int expiryDate = year+100;
        return expiryDate;

    }

}

//Task 2
// Create a class student
// attribute
//-firstname
//-lastname
//-studentId
//-age
//functions
//-function()=> return firstname + lastname
//-description() => print fullname and studentId
//-overEighteen()=> return boolean of whether student is over 18
//Make object of your detail
//print your fullname
//call description
//print if you are overEighteen or not

class student{
    String firstName;
    String lastName;
    int studentId;
    int age;

    String fullNameIs(){
        String fullName =firstName +" "+ lastName;
        return fullName;


    }

    void description(){
        System.out.println("Fullname of a student is :"+fullNameIs()+" Student ID is "+studentId);
    }

    boolean overEighteen(){
        if(age>18){
            return true;

        }else{
            return false;
        }
    }
}
