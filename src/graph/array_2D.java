package graph;

import java.util.Scanner;

public class array_2D {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter row & column:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.print("enter values:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
int a[][]={{1,3},{5,7},{8,9}};
for(int i=0;i<3;i++){
    for(int j=0;j<2;j++){
        System.out.print(a[i][j]+" ");
        }
    System.out.println();
}
 */
