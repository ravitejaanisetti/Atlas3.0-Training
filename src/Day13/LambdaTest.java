package Day13;

import java.util.ArrayList;

public class LambdaTest {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(4);
        num.add(3);
        num.add(2);
        num.add(1);
        num.forEach((n)-> System.out.println((n)));


    }
}
 