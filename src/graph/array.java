package graph;
import java.util.Scanner;
class array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n]; //declare and initialise

        //for insertion in arr taking new arr
        int b[]=new int[n+1];

        //taking input from user
        System.out.print("Enter values:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.print("Index:");
        int m=sc.nextInt();
        //insertion of arr
        System.out.print("new value:");
        int p=sc.nextInt();
        for(int i=0;i<n+1;i++){
            if(i<m){
                b[i]=a[i];
            }
            else if(i==m){
                b[i]=p;
            }
            else{
                b[i]=a[i-1];
            }
        }
        System.out.print("elements r: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.print("after insertion: ");
        for(int i=0;i<n+1;i++) {
            System.out.print(b[i]);
        }
    }
}
