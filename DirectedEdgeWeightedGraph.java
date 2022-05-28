package com.company;

import java.util.List;

public class DirectedEdgeWeightedGraph {
    private ForDirectedVertex[] vertices;


    public DirectedEdgeWeightedGraph(int numberOfVertices){
        vertices = new ForDirectedVertex[numberOfVertices];
        for (int i = 0; i < numberOfVertices; i++) {
            vertices[i] = new ForDirectedVertex(i);
        }
    }

    public void addEdge(int numberOfVertices, int w, double weight){
        ForDirectedEdge edge = new ForDirectedEdge(numberOfVertices,w,weight);
        vertices[numberOfVertices].addEdge(edge);
        vertices[w].addEdge(edge);
    }

    public List<ForDirectedEdge> getAdj(int numberOfVertices){
        return vertices[numberOfVertices].getAdj();
    }
}
