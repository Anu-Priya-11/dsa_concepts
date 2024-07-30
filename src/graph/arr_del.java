package graph;

import java.util.Scanner;

public class arr_del {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n]; //declare and initialise

        //for insertion in arr taking new arr
        int b[]=new int[n-1];

        //taking input from user
        System.out.print("Enter values:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.print("Index:");
        int m=sc.nextInt();

        //deleting in array
        for(int i=0;i<n;i++){
            if(i<m){
                b[i]=a[i];
            }
            else if(i==m){
                continue;
            }
            else{
                b[i-1]=a[i];
            }
        }

        System.out.print("elements r: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
        System.out.println();

        System.out.print("after deletion: ");
        for(int i=0;i<n-1;i++){
            System.out.print(b[i]);
        }
    }
}
