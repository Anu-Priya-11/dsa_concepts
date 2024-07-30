package graph;
//using array
import java.util.Scanner;
class Queue{
    int f=-1,r=-1;
    int n=10;
    int q[] =new int[n];
    void enqueue(Scanner sc){
        if(r==(n-1)){
            System.out.print("overflow condition");
        }else{
            System.out.print("enter the data.");
            int i=sc.nextInt();
            if(f==-1 && r==-1){
                f=0;
                r=0;
                q[r]=i;
            }else{
                r=r+1;
                q[r]=i;
            }
        }
    }
    void dequeue(){
        if(f==-1 && r==-1){
            System.out.print("underflow.");
        }else{
            f=f+1;
        }

    }
    void display(){
        System.out.println("items are:");
        for(int i=f;i<=r;i++){
            System.out.print(q[i]);
        }
    }

}

public class Queue_main{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        Queue q = new Queue();

        int l;
        do{
            System.out.print("1 to enque\n");
            System.out.print("2 to deque \n");
            System.out.print("3 to display \n");
            System.out.print("enter choice \n");
            int d=sc.nextInt();
            switch(d){
                case 1:
                    q.enqueue(sc);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
            }System.out.print("enter 0 to go back the main menu");
            System.out.print("any key to exit");
            l=sc.nextInt();
        }while(l==0);
        System.out.print("Exit Sucessfully.");
    }
}
