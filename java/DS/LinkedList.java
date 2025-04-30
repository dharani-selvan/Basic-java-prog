//----------------------------------------------------


class Node{         //creating node class to reference the data and next in a node
    int data;      
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
//------------------------------------------------------------
 class Linked {
    Node head;    

    Linked()
    {
        this.head=null;
    }
    //---------------------------------------------------------------------
    public  void add(int data)
    {
        Node val=new Node(data);
        if(head==null)                  //adding node
        {
            head=val;
        }
        else
        {
            Node current =head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=val;
        }
    }
    //------------------------------------------------------------------
    public  void addfirst(int data)
    {
        Node val=new Node(data);
        val.next=head;                  //adding at first
        head=val;
    }
    //------------------------------------------------------------
    public void display()
    {
        Node current=head;
        if(current==null)
        {   
            System.out.println("empty");
        }                                              //display data
        else
        {
            while(current!=null)
            {
                System.out.print(current.data+"->");
                current=current.next;
            }
            System.out.println("null");
        }
    }

//-------------------------------------------------------------------------

public void delete(int data)
{
    
        if(head!=null && head.data==data){
            head=head.next;   
            return ;
        }
        Node current=head.next;
        Node previous=null;
        while(current.next!=null && current.data!=data)         //deleting data
        {
            previous=current;
            current=current.next;
        }
        if(current.next==null)
        {
            System.out.println("not found");
        }
        else{
            System.out.println(data+"deleted");
            previous.next=current.next;
        }
       
}
//---------------------------------------------------------------------------------------
 }
public class LinkedList {
    public static void main(String[] args) {
        Linked LL=new Linked();
        LL.add(1);
        LL.add(2);
        LL.add(3);
        LL.add(4);
        LL.addfirst(0);
        
        LL.display();
        LL.delete(2);
        LL.display();
    }   
}