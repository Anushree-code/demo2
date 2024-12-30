public class Except
{
    public static void main(String[] args)
    {
        int a=7;
        int b=0;
        try
        {
            System.out.println(a/b);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
