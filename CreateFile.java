
import java.io.File;


public class CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("new.txt");
            if(file.createNewFile())
            {
                System.out.println("File created : " + file.getName());
            }
            else 
            {
                System.out.println("File already exist..");
            }
        } catch (Exception e) {
            System.out.println("an error occured..");
            e.printStackTrace();
        }
    }
}
/*import java.io.FileWriter;
public class WriteToFile
{
  public static void main(String[] args) 
  {
    try {
        FileWriter writer = new FileWriter("new.txt");
        writer.write("Hello , this is a test message written to the file..");
        writer.close();
        System.out.println("Successfully wrote to the file..");
    } catch (Exception e) {
        System.out.println("An error occurred..");
        e.printStackTrace();
    }
  }
}*/

/*import java.io.File;
import java.util.Scanner;

public class ReadFromFile
{
    public static void main(String args[])
    {
        try {
            File file = new File("new.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine())
            {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred..");
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}*/

/*import java.io.File;

public class DeleteFile
{
    public static void main(String[] args) {
        File file = new File("new.txt");
        if(file.delete())
        {
            System.out.println("Deleted the file : "+ file);
        }
        else 
        {
            System.out.println("Failed to delete the file..");
        }
    }
}*/

