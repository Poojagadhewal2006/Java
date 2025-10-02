class Circle{
    int r=5;
    double area;
    double c;
    void circle()
    {
      area=3.14*r*r;
      System.out.println(area);
      c=2*3.14*r;
      System.out.println(c);
    }
   
}
public class CircleCircumference {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.circle();
    }
}
