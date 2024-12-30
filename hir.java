class food
{
    public void m1()
    {
        System.out.println("Type:veg,name:pizza");
    }
}
class f1 extends food {
    public void m2() {
        System.out.println("Type:veg,prize:100,Quantity:1");
    }
}
class f2 extends food
{
    public void m3()
    {
        System.out.println("Type:veg,prize:100,Quantity:1");
    }

}
public class hir
{
    public static void main(String[] args) {
        f1 obj = new f1();
        f2 obj1 = new f2();
        obj.m1();
        obj.m2();
        obj1.m1();
        obj1.m3();
    }
}

