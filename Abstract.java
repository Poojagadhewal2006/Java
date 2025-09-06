abstract class Shape
{
    abstract void Area();
    void sum()
    {
        System.out.println("Complete....");
    }
}
class Circle extends Shape{
    void Area()
    {
        System.out.println("area of circle ");
    }
}
class Rectangle extends Shape
{
    void Area()
    {
        System.out.println("area of rectangle ");
    }
}
public class Abstract {
   public static void main(String[] args) {
    Shape obj = new Circle();
    obj.Area();
    obj.sum();
    Shape obj1 = new Rectangle();
    obj1.Area();
    obj1.sum();
   } 
}
