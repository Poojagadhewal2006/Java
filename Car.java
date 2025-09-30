class Hello1{
    String  brand = "BMW";
    int model = 2025;
    double price = 100000;

    public void Print1(){
        System.out.println("Brand :" + brand);
        System.out.println("Model: " + model);
        System.out.println("Price : " + price);
    }
}
public class Car {
   public static void main(String[] args) {
    Hello1 obj = new Hello1();
   obj.Print1();
   } 
}
