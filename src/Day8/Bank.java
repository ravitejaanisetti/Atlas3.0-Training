package Day8;

public class Bank {
    void ROI(){
        System.out.println("There is a fixed ROI for every bank");
    }
    public static void main(String[] args) {

    }
}
class ICICI extends Bank{

    @Override
    void ROI() {
        System.out.println("ROI is 9% per annum");
    }
}
class SBI extends Bank{

    @Override
    void ROI() {
        System.out.println("ROI is 9% per annum");
    }
}
class polyMain{
    public static void main(String[] args) {
        Bank ob1;
        ob1=new SBI();
        ob1.ROI();
        Bank ob2;
        ob2=new ICICI();
        ob2.ROI();
        Bank ob3;
        ob3=new Bank();
        ob3.ROI();
    }
}
