class Node {
String data ;
Node next;
Node(String data)
{
    this.data = data;
    this.next = null;
}
    
}
public class taskManager{
    static Node top = null;
    //push()
    static void push(String data)
    {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;


    }

    public static void main(String[] args) {
        
    }
}