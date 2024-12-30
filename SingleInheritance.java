class Car {
    public void details1() {
        System.out.println("Price:120000, Fuel type:Petrol");
    }
}

class BMW extends Car
{
    public void details2()
    {
        System.out.println("Model:12, Color:Red");
    }
}
public class SingleInheritance {
    public static void main(String[] args)
    {
        BMW obj=new BMW();
        obj.details2();
        obj.details1();
    }
}
