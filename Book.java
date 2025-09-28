class book1{
    String title = "The World";
    String author = " Ravindra ";
    double price = 200;
    double discount = price-20;
    void Issue()
    {
      System.out.println("Book Title : " + title);
      System.out.println("Book Author :" + author);
      System.out.println("Book Price : " + price);
      System.out.println("Book Price After Discount : " + discount);
      System.out.println(" ");
    }
}
public class Book {
    public static void main(String[] args) {
        book1 obj8 = new book1();
        obj8.Issue();
    }
}
