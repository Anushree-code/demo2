class demo1
{
    demo1(int a, int b)
    {
        System.out.println(a+b);
    }
    demo1(int a, int b,int c)
    {
        System.out.println(a+b);
    }
}
public class CMOL {
    public static void main(String[] args)
    {
        demo1 obj=new demo1(1,5,6);
    }
}
