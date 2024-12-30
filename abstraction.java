abstract class airth
        {
            abstract void add();
            abstract void sub();
            abstract void mul();
            abstract void div();
        }
class def extends airth
{
    void add() {
        int a=5;
        int b=6;
        System.out.println(a+b);
    }
    void sub() {
        int a=5;
        int b=6;
        System.out.println(a-b);
    }
    void mul() {
        int a=5;
        int b=6;
        System.out.println(a*b);
    }
    void div() {
        int a=5;
        int b=6;
        System.out.println(a/b);
    }
}
public class abstraction
{
    public static void main(String[] args)
    {
        def obj=new def();
        obj.add();
        obj.div();
        obj.mul();
        obj.sub();
    }
}
