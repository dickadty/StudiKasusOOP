package SalesmenTraveling;
class Path {
    Edge edge1;
    Edge edge2;
    Edge[] edges;

    public Path(Edge edge1, Edge edge2) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edges = new Edge[]{edge1, edge2};
    }

    public double jarakPath() {
        double jarakPath = 0.0;
        for (int i = 0; i < edges.length; i++) {
            jarakPath += edges[i].euclidean();
        }
        return jarakPath;
    }
}