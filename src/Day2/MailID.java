package Day2;



public class MailID {
    public static void main(String[] args) {
        String[] name = {"Jessica Harris", "Sarah Tucker" ,"Tonya Evans","Christopher Hall","Leah Thompson","Mark Taylor" ,"Kara Reed", "Karen Sloan","Taylor Sanders","William Miller"};
        String mailId = "";

        for (int i = 0; i <= name.length; i++) {
         name[i]=name[i].toLowerCase().replace(" ",".")+"@amazon.com";
         mailId=name[i];
            System.out.println(mailId);
        }

    }
}
