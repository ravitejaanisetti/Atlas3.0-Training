package Day7;

public class whatsApp {

    public String getuName() {
        return uName;
    }

    public String getNumber() {
        return number;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    String uName;
    String number;
    //constructor

    whatsApp() {
        System.out.println("hello Amazon");
    }

    whatsApp(String number){
        System.out.println("number is "+number);
    }

    whatsApp(String number,String name){
        this.number=number;
        uName=name;
        System.out.println("number is "+this.number);
        System.out.println("name is "+this.uName);
    }
    whatsApp(whatsApp wh)
    {
        System.out.println("copy constructor getting called");
        number=wh.number;
        uName=wh.uName;
    }

}

//11:05
class testing1{
    public static void main(String args[]){
        // whatsApp w1=new whatsApp();
        //parameterized constructor
        whatsApp[] w3=new whatsApp[3];
        w3[0]=new whatsApp();

        w3[1]=new whatsApp();
        w3[2]=new whatsApp();
        whatsApp w1=new whatsApp("9510468956","Anubhav");
        whatsApp w6= new whatsApp(w1);


        //whatsApp w2=new whatsApp("8780210680");

    }
}




