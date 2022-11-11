package com.company;

public class Graph_01
{
    private int vetrices;
    private int Edges;
    String adjacencyMatrix[][];

    public Graph_01(int nodes){
        //a node contains vertices and edges;
        this.vetrices=nodes; //create as many vertices as the nodes passed..
        this.Edges=0;//initially we dont have
        this.adjacencyMatrix=new String[nodes][nodes];

    }
    public void addEdges(int u,int v){
        adjacencyMatrix[u][v]="yes";
        adjacencyMatrix[v][u]="yes";
        Edges++;
    }
    public void print(){
        for(int i=0;i<vetrices;i++){
            for(int j=0;j<vetrices;j++){
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Edges: " +Edges);
    }

    public static void main(String args[]){
        Graph_01 g=new Graph_01(4);
        g.addEdges(0,1);
        g.addEdges(1,2);
        g.addEdges(2,3);
        g.addEdges(3,0);
        g.print();


    }
}