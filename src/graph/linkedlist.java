package graph;
import java.util.Scanner;

public class linkedlist {
    static class Node{
        //to declare a node
        int data;
        Node next;

        //constructor
        //by defalut value initialize
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null; //a pointer in ll

    public void creation() {
        int n;
        Scanner sc = new Scanner(System.in);
        //System.out.print("enter number of times");
        do {
            System.out.print("enter data:");
            int data = sc.nextInt();
            //object creation of node class
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node; //when ll not exist
            } else {
                //insertion operation
                System.out.print("click 1 to insert at begining,2 to insert at the end,3 to insert at any position");
                int m = sc.nextInt();
                switch (m) {
                    case 1: //beg
                        new_node.next = head;
                        head = new_node;
                        break;
                    case 2: //end
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;
                    case 3: //position
                        System.out.print("enter position to be inserted");
                        int p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (p - 1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                }
            }
                System.out.print("do you want to  add more data press 1");
                n=sc.nextInt();
            }
        while(n==1);
        }


    public void delection() {
        int n;
        Scanner sc = new Scanner(System.in);
        //System.out.print("enter number of times");
        do {

            if (head == null) {
                System.out.print("ll is empty.");
            } else {
                //insertion operation
                System.out.print("click 1 to delete at begining,2 to delete at the end,3 to delete at any position");
                int m = sc.nextInt();
                switch (m) {
                    case 1: //beg
                        Node temp=head;
                        temp=temp.next;
                        head=temp;
                        break;
                    case 2: //end
                        Node temp1= head;
                        Node ptr=temp1.next;
                        while(ptr.next != null) {
                            temp1 = ptr;
                            ptr=ptr.next;
                        }
                        temp1.next =null;
                        break;
                    case 3: //position
                        System.out.print("enter position to be inserted");
                        int p = sc.nextInt();
                        Node temp2= head;
                        Node ptr1=temp2.next;
                        for (int i = 0; i < p - 2; i++) {
                            temp2 = ptr1;
                            ptr1=ptr1.next;
                        }
                        temp2.next = ptr1.next;
                        break;
                }
            }
            System.out.print("do you want to  add more data press 1");
            n=sc.nextInt();
        }
        while(n==1);
    }

    public void  traverser(){
        System.out.print("traverse:"+" ");
        Node temp=head;
        if(head==null){
            System.out.print("ll not exist.");
        }else{
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next; //address
            }
        }
    }
    public static void main(String args[]){
        linkedlist ll =new linkedlist(); //object of class
        ll.creation();
        ll.delection();
        ll.traverser();

    }
}
