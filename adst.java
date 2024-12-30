abstract class abc
{
    abstract  void  officedetails();

}
class def2 extends abc
{
    @Override
    void officedetails() {
        System.out.println("Login hours:9, ID:123");
    }
    void personaldetails()
    {
        System.out.println("Reading:4hrs,Sleeing:7");
    }

}
public class adst {
    public static void main(String[] args)
    {
         def2 obj=new def2();
         obj.officedetails();
         obj.personaldetails();
    }

}
