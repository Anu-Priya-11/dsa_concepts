package graph;
//import  stack1.Node;
import java.util.Scanner;
class Queue1
{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //two pointers
    Node f=null;
    Node r=null;


    public void enqueue(Scanner sc){
        System.out.print("enter data:");
        int data=sc.nextInt();
        Node new_node=new Node(data);
        if(f==null){
            f=new_node;
            r=new_node;
        }else{
            r.next=new_node;
            r=new_node;
        }

    }
    public void dequeue(){
        if(f==null){
            System.out.print("underflow.");
        }else{
            f=f.next;
        }

    }
    public void display(){
        Node temp=f;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class Queue_Main_using_LL {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Queue q= new Queue();
        int l;
        do{
            System.out.println("press 1 to enqueue.");
            System.out.println("press 2 to dequeue.");
            System.out.println("print 3 to display.");
            System.out.println("Enter your choice.");
            int d=sc.nextInt();
            switch(d){
                case 1:
                    q.enqueue(sc);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3 :
                    q.display();
                    break;
                default:
                System.out.print("enter 0 to back to main menu.");
            }
            System.out.println("enter any key to exit.");
        l=sc.nextInt();
        }while(l==0);
        System.out.print("Exit successfully.");
    }
}
