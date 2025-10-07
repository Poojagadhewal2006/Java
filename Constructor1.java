class Student
{
    String name = "rohit";
    int age = 19;
    Student(String name,int a)
    { 
         this.name =name;
         this.age =a;
        System.out.println("name" + this.name + " " + "age" + this.age);
    }
}
public class Constructor1 {
   public static void main(String[] args) {
    Student obj = new Student("rahul",15); 
   } 
}
