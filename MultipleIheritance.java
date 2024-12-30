class Animal
{
    public void d1()
    {
        System.out.println("Color:Black,Food:Pedigre");
    }
}
class dog extends Animal
{
    public void d2()
    {
        System.out.println("Color:Black,breed:pug,name:ac");
    }
}
class babydog extends dog
{
    public void d3()
    {
        System.out.println("Color:Black,breed:pug,name:ac,gender:f");
    }
}
public class MultipleIheritance {
    public static void main(String[] args) {
        babydog obj = new babydog();
        obj.d1();
        obj.d2();
        obj.d3();
    }
}
