package model;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private final String name;
    private final List<Edge>edges = new ArrayList<>();

    public Vertex(String name){this.name=name;}

    public void link(Vertex other, float value){
        Edge edge = new Edge(this,other,value);
        this.edges.add(edge);
        other.edges.add(edge);

    }

}
