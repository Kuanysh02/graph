package com.company;

public class ForDirectedEdge {
   private int numberOfVertices, w;
   private double weight;

    public ForDirectedEdge(int v, int w, double weight) {
        this.numberOfVertices = v;
        this.w = w;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "v=" + numberOfVertices +
                ", w=" + w +
                ", weight=" + weight +
                '}';
    }
}
