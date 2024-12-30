import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class OA
{

    public static void main(String[] args)
    {
        String filename="ex3.txt";
        try
        {
            Files.write(Paths.get(filename),"".getBytes());
            System.out.println("File created");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}