package graph;

import java.util.LinkedList;
import java .util.Scanner;

public class graph_imp {
    private LinkedList<Integer> adjacency[];

    public graph_imp(int v) {
        adjacency = new LinkedList[v];
        for (int i = 0; i < v; i++) { //vertex ka array create kr liye h
            adjacency[i] = new LinkedList<Integer>();
        }
    }

    public void insertedge(int s, int d) {
        adjacency[s].add(d);
        adjacency[d].add(s);
        System.out.print("source" + adjacency[d]);
        System.out.print( "connect to destination" + adjacency[s]);
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of v and e");
        int v = sc.nextInt();  //circle
        int e = sc.nextInt(); //line
        graph_imp g=new graph_imp(v);
        System.out.print("enter edges");
        for (int i = 0; i < e; i++) {
            int s = sc.nextInt(); //source
            int d = sc.nextInt(); //destination
            g.insertedge(s, d);
        }
    }
}
