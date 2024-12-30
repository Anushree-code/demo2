import java.util.ArrayList;
import java.util.List;

public class AnonyInt
{
    public static void main(String[] args)
    {
        List number=new ArrayList();
        number.add("Anushree");
        number.add("S");
        number.add("BNR");
        number.add("Dploma");
        number.add("BE");
        number.add("1MJ20CS402");
        System.out.println(number);
        number.add(1,"Computer Science");
        System.out.println(number.get(1));
        number.remove(2);
        System.out.println(number.get(2));
        number.remove("BE");
        System.out.println(number.get(4));
    }
}
