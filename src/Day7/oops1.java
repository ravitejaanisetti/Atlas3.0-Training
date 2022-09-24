package Day7;

public class oops1 {
    public static void printer(int x,int i){
        System.out.println("10 * "+i+" = "+x);
    }
    public static void main(String[] args) {
        System.out.println("Hello world");

        for(int i=1; i<=10; i++){
            printer(10*i,i);
            //System.out.println("10 * "+i+" = "+10*i);
        }
    }
}
