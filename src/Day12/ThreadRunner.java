package Day12;

public class ThreadRunner  extends Thread{
    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println("Hello :"+i);
        }
    }
}

class Application{
    public static void main(String[] args) {
        ThreadRunner r1 = new ThreadRunner();
        r1.start();

        ThreadRunner r2 = new ThreadRunner();
        r2.start();
    }
}