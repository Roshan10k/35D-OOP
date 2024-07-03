package Week8;

public class Encapsulation {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.setName("Apple M1");
        laptop1.setBrand("Apple");
        laptop1.setPrice(100000);
        laptop1.setYear(2003);

        System.out.println(laptop1.getName());
        System.out.println(laptop1.getBrand());
        System.out.println(laptop1.getPrice());
        System.out.println(laptop1.getYear());
    }
}
//bundle similar properties and function into class
class Laptop{

    //data hiding can be done using private access modifier
    private String name;
    private String brand;
    public double price;
    private int year;
    //make read only access using getter

    public String getName(){
        return this.name;

    }
    //make write-only access using setter
    public void setName(String name){
        this.name = name;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }
}

/*Task
 * make getter and setter for all attributes
 * make 2 object of Laptop
 * Output:
 * Name : Apple M1
 * Brand : Apple Price 100000
 * year : 2023
 */