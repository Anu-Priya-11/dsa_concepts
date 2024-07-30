package graph;
import  java.util.Scanner;

class Stack{
    int top=-1;
    int n=10;
    //creating array
    int a[] = new int[n];
    void push(Scanner sc){
        if(top==(n-1)){
            System.out.print("overflow");
        }
        else{
            //Scanner sc=new Scanner(System.in);
            int i=sc.nextInt();
            top=top=1;
            a[top]=i;
            System.out.print("item inserted.");
        }
    }
    void pop(){
        if(top==-1){
            System.out.print("overflow");
        }
        else{
            top=top-1;
            System.out.print("item deleted");
        }
    }
    void display(){
        System.out.print("item are:");
        for(int j=top;j>=0;j--){
            System.out.print(a[j]);
        }
    }
}

public class Stack_array{
    public static void main(String args[]) {

        Scanner sc= new Scanner(System.in);
        Stack s = new Stack();
        /*
        s.push();
        s.pop();
        s.display();
         */
        //using switch case
        int l;
        do{
            System.out.print("1 to push");
            System.out.print("2 to pop");
            System.out.print("3 to display");
            System.out.print("enter choice");
            int d=sc.nextInt();
            switch(d){
                case 1:
                    s.push(sc);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
            }System.out.print("enter 0 to go back the main menu");
         System.out.print("any key to exit");
         l=sc.nextInt();
        }while(l==0);
        System.out.print("Exit");
    }
}
