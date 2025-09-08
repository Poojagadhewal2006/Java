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
        int r=2;
        //int area ;
       double  area=3.14*r*r;
        System.out.println("area of circle: " +area);
    }
}
class Rectangle extends Shape
{
    void Area()
    {
        int l=3;
        int d=4;
        int rectangle;
        rectangle=l*d;
        System.out.println("area of rectangle: " +rectangle);
    }
}
public class Abstract2 {
    public static void main(String[] args) {
    Shape obj = new Circle();
    obj.Area();
    obj.sum();
    Shape obj1 = new Rectangle();
    obj1.Area();
    obj1.sum();
    }
}

