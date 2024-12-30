class Haii implements Runnable {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Hai");
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}
class Helloo implements   Runnable
{
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Hello");
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}
public class THIN
{
    public static void main(String[] args) {
        Runnable obj1 = new Hai();
        Runnable obj2 = new Hello();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t2.start();
        t1.start();
    }
}

