package Day3;

public class LinkedList {
    public static void main(String args []){
        Node newnode1=new Node();
        Node newnode2=new Node();
        Node newnode3=new Node();
        Node newnode4=new Node();
        newnode1.data=1;
        newnode1.name="Ravi";
        newnode1.hobby="Music";
        newnode2.data=2;
        newnode2.name="madhu";
        newnode2.hobby="Dance";
        newnode3.data=3;
        newnode3.name="srikar";
        newnode3.hobby="games";
        newnode4.data=4;
        newnode4.name="laxmi";
        newnode4.hobby="gardening";

        newnode1.next=newnode2;
        newnode2.next=newnode3;
        newnode3.next=newnode4;
        newnode4.next=null;

        for(int i=0;i<4;i++){
            System.out.println("Node data "+ i +" is "+ newnode1.data);
            System.out.println("Node data "+ i +" is "+ newnode1.name);
            System.out.println("Node data "+ i +" is "+ newnode1.hobby);
            newnode1=newnode1.next;
//            newnode1=newnode1.next;
        }

    }
    public static class Node{
        int data;
        String name;
        String hobby;
        Node next;
    }
}
