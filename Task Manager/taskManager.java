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
    static String  stack ;
    //push()
    static void push(String data)
    {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;


    }
    //pop()
    static String pop()
    {
        if(top == null)
        {
            System.out.println("Nothing to remove!");
            return null;
        } 
        else
        {
            String data = top.data;
            top = top.next;
            return data;
        }
    } 

    public static void main(String[] args) {
        
    }
}