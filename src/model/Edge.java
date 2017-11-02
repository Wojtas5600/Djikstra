package model;

public class Edge {

    private Vertex[] vertices = new Vertex[2];
    private final float value;

    Edge(Vertex first, Vertex second, float value) {
        if (first==second){
            throw new IllegalArgumentException("model.Edge must link different vertices");
        }
        this.value = value;
        this.vertices[0]=first;
        this.vertices[1]=second;
    }

    public Vertex[] getVertices() {
        return vertices;
    }

    public float getValue() {
        return value;
    }

    public Vertex other(Vertex other){
        if (other ==vertices[1])
            return vertices[0];
        else if (other==vertices[0])
            return vertices[0];
        else
            throw new IllegalArgumentException("Vertex must be linked");
    }
}
