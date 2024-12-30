class Hai extends Thread {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Hai");
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}
class Hello extends  Thread
{
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Hello");
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}
public class Ex
{
    public static void main(String[] args) {
        Hai obj1 = new Hai();
        Hello obj2 = new Hello();
        obj1.start();
        obj2.start();
    }
}
