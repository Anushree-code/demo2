class E
{
    int a;
    public void Perso()
    {
        System.out.println("Name:Anu,Age;");
    }

    class F
    {
        public void emp()
        {
            System.out.println("Id:1799,Name:Anu,Salary:2300");
        }

    }
}
public class Nested {
    public static void main(String[] args)
    {
        E obj=new E();
        E.F obj1=obj.new F() ;
        obj.Perso();
        obj1.emp();}

}
