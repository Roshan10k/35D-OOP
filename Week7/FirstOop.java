package Week7;

public class FirstOop {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name ="John";
        person1.age=18;
        person1.gender='M';

        System.out.println(person1.name);
        person1.introduction();

        //Task create two object of person and call introduction function

        Person person2 = new Person();
        person2.name = "Bigshow";
        person2.age = 24;
        person2.gender = 'M';

        person2.introduction();

        Person person3 = new Person();
        person3.name = "undertaker";
        person3.age = 36;
        person3.gender = 'F';

        person3.introduction();

        Rectangle rec1 = new Rectangle();
        rec1.length = 23;
        rec1.breadth = 35;
        int areaRec1 = rec1.areaOfRectangle();
        System.out.println("Area of rec1 is "+areaRec1);

      

        
    }
}

class Rectangle{
    int length;
    int breadth;

    int areaOfRectangle(){
        int area = length * breadth;
        return area;
    }
}

class Person{
    String name;
    int age;
    char gender;

    void introduction(){
        System.out.println("Name : "+name+" Age : "+age+ " Gender : "+gender);
    }
}
