import java.util.Scanner;

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
    static Scanner sc = new Scanner(System.in);
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
    //display()
    static void display()
    {
        if(top == null)
        {
            System.out.println("No task available!");
            return;
        } 
        else
        {
            Node temp = top;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        int choice = 0;
        do 
        {
            System.out.println("**** TASK MANAGER ****");
            System.out.println("1.Add task");
            System.out.println("2.Undo task");
            System.out.println("3.Display task");
            System.out.println("4.Exit Task");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                System.out.print("Enter your task: ");
                String task = sc.nextLine();
                push(task);
                break;
                case 2: 
                String value = pop();
                System.out.println("The task " + value + " is removed successfully!"); 
                break;
                case 3:
                display();
                break;
                case 4:
                System.out.println("Exiting the Menu!");
                break;
                default:
                System.out.println("Invalid choice! ");
                break;
            }
        }while (choice != 4); 
            
        

        
    }
}