import java.io.FileInputStream;
import java.io.IOException;

public class Const
{
    public static void main(String[] args)
    {
        String fileName="ex3";
        try(FileInputStream fis=new FileInputStream(fileName))
        {
            int byteValue;
            while ((byteValue=fis.read())!=-1)
            {
                System.out.println((char) byteValue);
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
