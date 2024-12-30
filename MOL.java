class demo
{
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public void add(int a, int b,int c)
    {
        System.out.println(a+b);
    }
}
public class MOL {
    public static void main(String[] args)
    {
        demo obj=new demo();
        obj.add(2,3);
        obj.add(4,6,7);
    }
}
