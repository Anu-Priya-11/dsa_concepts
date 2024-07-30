package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs {
    private LinkedList<Integer>adjancency[];

    public bfs(int v){
        adjancency=new LinkedList[v];

        for(int i =0;i<v;i++){
            adjancency[i]=new LinkedList<Integer>();
        }
    }

    public void insertedge(int s,int d){
        adjancency[s].add(d);
        adjancency[d].add(s);

    }
    public void bfs_code(int source){
        //declare v & p
        boolean visited_nodes[]=new boolean[adjancency.length];
        int parent_nodes[]=new int[adjancency.length];
        Queue<Integer> q=new LinkedList<>();

        //initialize v&p
        q.add(source);
        visited_nodes[source]=true;
        parent_nodes[source]=-1;
        while(!q.isEmpty()){
            int p=q.poll();
            System.out.print(p);

            //checking adjacency node
            for(int i:adjancency[p]){
                if(visited_nodes[i]!=true) {
                    visited_nodes[i] = true;
                    q.add(i);
                    //adding in parent node
                    parent_nodes[i] = p;
                }
            }
        }


    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of v & e: ");
        int v=sc.nextInt();
        int e=sc.nextInt();
        bfs g =new bfs(v);
        System.out.print("edges");
        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            g.insertedge(s,d);
        }
        System.out.print("enter source for bfs traversal.");
        int source=sc.nextInt();
        g.bfs_code(source);

    }
}
