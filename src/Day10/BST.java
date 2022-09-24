import java.util.Stack;
import java.util.function.BinaryOperator;



class Node6{
    int value;
    Node6 left;

    Node6 right;

    public Node6(int data) {
        this.value = data;

    }


    public Node6 root;

    public static void insert(Node6 node, int value) {

        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println("Inserted " + value + " to left " + node.value);
                node.left = new Node6(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("Inserted " + value + " to right " + node.value);
                node.right = new Node6(value);
            }
        }
    }
    public static void preOrder(Node6 root) {
        Stack<Node6> st = new Stack();
        st.push(root);
        System.out.println("Pre order value : ");
        while(!st.isEmpty()) {
            Node6 temp = st.pop();
            System.out.print(temp.value + "\t");
            if(temp.right != null)
                st.push(temp.right);
            if(temp.left != null)
                st.push(temp.left);
        }
        System.out.println();
    }
    public static void inOrder(Node6 root) {
        Stack<Node6> st = new Stack();
        Node6 temp = root;
        System.out.println("In order value : ");
        while (!st.isEmpty() || temp != null) {
            while(temp != null) {
                st.push(temp);
                temp = temp.left;
            }
            temp = st.pop();
            System.out.print(temp.value + "\t");
            temp = temp.right;
        }
        System.out.println();
    }

}

class App12{
    public static void main(String args[]){
        Node6 rootnode = new Node6(25);
        rootnode.insert(rootnode,11);
        rootnode.insert(rootnode,10);
        rootnode.insert(rootnode,30);
        rootnode.insert(rootnode,28);
        rootnode.insert(rootnode,20);
        rootnode.insert(rootnode,35);
        rootnode.preOrder(rootnode);
        rootnode.inOrder(rootnode);
    }
}