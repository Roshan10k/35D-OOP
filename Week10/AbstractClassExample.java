/*You are building a shape hierarchy for a drawing application.
Design an abstract class named "Shape" with the following abstract methods:

calculateArea():
This method should calculate and return the area of the shape.

calculatePerimeter():
This method should calculate and return the perimeter of the shape.

Implement the abstract class and provide concrete implementations for
 the abstract methods. Create subclasses for different shapes such as "Circle,"
  "Rectangle," and "Triangle."
  Each subclass should provide specific implementations for
  calculating the area and perimeter of that shape.
  Create instances of each shape class and demonstrate
  how you can calculate their respective areas and perimeters.
 */


package Week10;

public class AbstractClassExample {
    public static void main(String[] args) {

        Circle c = new Circle();
        System.out.println(c.calculateArea());
        System.out.println(c.calculatePerimeter());
        Triangle t = new Triangle();
        System.out.println(t.calculateArea());
        System.out.println(t.calculatePerimeter());

        Rectangle rec = new Rectangle();
        System.out.println(rec.calculateArea());
        System.out.println(rec.calculatePerimeter());
        
    }
}
abstract class Shape{

    abstract double calculateArea();
    abstract  double calculatePerimeter();


}

class Circle extends Shape{
    double r = 14;

    @Override
    double calculateArea(){
 
        return 3.14*r*r;

    }

    @Override
    double calculatePerimeter(){
      
        return 2*3.14*r;
    }
}

class Triangle extends Shape{
    double l= 10;
    double b = 5;
    double a =6;
    double c= 7;


    @Override
    double calculateArea(){
        
        return 0.5*l*b;
    }

    @Override
    double calculatePerimeter(){
        return a+b+c;
        
    }
}

class Rectangle extends Shape{
    double len = 10;
    double bre = 20;
    
    @Override
    double calculateArea(){
        return len*bre;
    }

    @Override
    double calculatePerimeter(){
        return 2*(len+bre);
    }
}



