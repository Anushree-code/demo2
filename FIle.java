import java.io.FileOutputStream;
import java.io.IOException;
public class FIle
{
    public static void main(String[] args) {
        String fileName = "exp1.txt";
        String content = "Welcome HOME";
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] bytes = content.getBytes();
            fos.write((bytes));
            System.out.println("Content has been written ti file");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
