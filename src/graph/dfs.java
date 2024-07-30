package graph;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class dfs {
    //declare LL
    private LinkedList<Integer>adj[];
    public dfs(int v){
        //initials
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<Integer>();
        }

    }
    public void insertedge(int s, int d){
        adj[s].add(d);
        adj[d].add(s);
    }

    public void dfs_code(int source){
        boolean visited_node[]=new boolean[adj.length];
        int parent_node[]=new int[adj.length];
        Stack<Integer> q= new Stack<>();
        q.add(source);
        visited_node[source]=true;
        parent_node[source]=-1;
        while(!q.isEmpty()){
            int p=q.pop();
            System.out.print(p);
            for(int i: adj[p]){
                if(visited_node[i]!=true){
                    visited_node[i]=true;
                    q.add(i);
                    parent_node[i]=p;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter vertex & edges: ");
        int v =sc.nextInt();
        int e =sc.nextInt();
        dfs g=new dfs(v);
        System.out.print("edges");
        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            g.insertedge(s,d);
        }
        System.out.print("enter source for dfs traversal.");
        int source=sc.nextInt();
        g.dfs_code(source);

    }
}
