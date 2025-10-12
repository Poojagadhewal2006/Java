public class CreateMethodWithNonstatic {
    void sum()
    {
        System.out.println("Hellooo");
    }
    public static void main(String[] args) {
        CreateMethodWithNonstatic obj = new CreateMethodWithNonstatic();
        obj.sum();
    }
}
