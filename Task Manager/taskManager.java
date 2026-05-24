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
    static Node redoTop = null;
    static String  stack ;
    //push() "Add Task"
    static void push(String data)
    {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;


    }
    //RedoPush() "Bring back last task"
    static void redoPush(String data)
    {
        Node newnNode = new Node(data);
        newnNode.next = redoTop;
        redoTop = newnNode;
    } 
    //redoPop() "Pop and push it to the main Stack "
    static String redoPop()
    {
        if(redoTop == null)
        {
            System.out.println("Nothing to redo!");
            return null;
        } 
        else
        {
            String value = redoTop.data;
           // push(value);
            redoTop = redoTop.next;
            return value;
        }
    }
    //pop()
    static String Undopop()
    {
        if(top == null)
        {
            System.out.println("Nothing to remove!");
            return null;
        } 
        else
        {
            String data = top.data;
            redoPush(data);
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
            System.out.println("2.Remove task");
            System.out.println("3.Display task");
            System.out.println("4.Redo task");
            System.out.println("5.Exit Task");
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
                String value = Undopop();
                System.out.println("The task " + value + " is removed successfully!"); 
                break;
                case 3:
                display();
                break;
                case 4:
                        String value2 = redoPop();
                        if(value2 != null)
                        {
                            push(value2);
                            System.out.println("Redo: " + value2);
                        }
                        break;
                case 5:
                System.out.println("Exiting the Menu!");
                break;        

                default:
                System.out.println("Invalid choice! ");
                break;
            }
        }while (choice != 5); 
            
        

        
    }
}