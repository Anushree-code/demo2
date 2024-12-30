class parent
{
    public void mobile()
    {
        System.out.println("Samsung");
    }
}
class child
{
    public void mobile()
    {
        System.out.println("i phone");
    }
}
public class MOR {
    public static void main(String[] args)
    {
        child obj=new child();
        obj.mobile();
    }
}
