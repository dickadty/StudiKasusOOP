package SalesmenTraveling;

public class Main {
    public static void main(String[] args) {
        // Membuat simpul (nodes)
        Node node1 = new Node("A", 10, 20);
        Node node2 = new Node("B", 40, 60);
        Node node3 = new Node("C", 100, 100);

        Edge edge1 = new Edge(node1,node2);
        Edge edge2 = new Edge(node2, node3);

        Path path1 = new Path(edge1,edge2);

        path1.jarakPath();
        System.out.println(edge1.euclidean());
        System.out.println(edge2.euclidean());
        System.out.println(path1.jarakPath());

    }
}