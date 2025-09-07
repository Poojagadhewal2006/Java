abstract class Animal
{
    abstract void sound();
    void sum()
    {
        System.out.println("Done...");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Eating");
    }
}
class Cat extends Animal
{
    void sound()
    {
        System.out.println("Milk");
    }
}
public class Abstract1 {
    public static void main(String[] args) {
       Animal obj = new Dog();
       obj.sound();
       obj.sum();
       Animal obj1 = new Cat();
       obj1.sound();
       obj1.sum(); 
    }
}
