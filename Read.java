import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Read {
    
        public static void main(String[] args)
        {
            String fileName="ex3";
            try{
                List<String> lines= Files.readAllLines(Paths.get(fileName));g
                for(String line:lines);
                {
                    boolean line = false;
                    System.out.println(line);
                }
            }
            catch (IOException e)
            {
                System.out.println(e);
            }
        }
}
