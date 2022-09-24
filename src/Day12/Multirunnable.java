package Day12;

public class Multirunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("thread is running in runnable");

    }

    public static void main(String[] args) {
        Multirunnable r1 = new Multirunnable();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
