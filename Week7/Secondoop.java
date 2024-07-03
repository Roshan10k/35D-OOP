package Week7;

public class Secondoop {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.name = "Ram";
        p.age = 20;

        p.personInfo();

        Person1 p2= new Person1();
        p2.name = "shyam";
        p2.age = 21;

        p2.personInfo();
       // p2.phNumber ="9090"; //you cannot do this
       p2.setphNumer();
        p2.setNewphNumber("90000");
        String getNum = p2.getphNumber();
        System.out.println(getNum);

    football f1 = new football();
    f1.homeTeam = "England";
    f1.awayTeam= "Spain";
    f1.Time= 90;
    f1.setgoalScore(3);
    f1.setWinner("England");
    f1.detail();

        
    }
}

class Person1{
    String name;
    int age;

    //access modifier, it is "default" if not specified
    private String phNumber;
    public int salary;

    void personInfo(){
        System.out.println(name);
    }

    void setphNumer(){
        this.phNumber ="9090";
    }

    void setNewphNumber(String num){
        this.phNumber = num;
    }
    String getphNumber(){
        return phNumber;
    }

    void setThisNumber(String phNumber){
        this.phNumber= phNumber;
    }

    
}

//Task 
// create a class football
//make two attribute
//string homeTeam and awayTeam
//make another attribute time
//make private attribute goal
//make a setter for goal
//make a getter for goal
//make private attribute winner as string
//make only setter for winner
//make function detail()-> print winner name, time and total goal
//make object of football and fill all the attribute

class football{
    String homeTeam;
    String awayTeam;
    int Time;
    private int Goal;
    private String winner;


    void setgoalScore(int Goal){
        this.Goal= Goal;
    }
    int getgoalScore(){
        return this.Goal;
        
     }

    void setWinner(String winner){
        this.winner = winner;
    }

    void detail(){
        System.out.println("Winner:"+winner+" Time:"+Time+" Goals:" +Goal);
    }


}