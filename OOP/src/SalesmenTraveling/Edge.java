package SalesmenTraveling;

class Edge
{
    Node n1;
    Node n2;
    Edge(Node node1,Node node2)
    {
        n1=node1;
        n2=node2;
    }
    public double euclidean()
    {
        double jarak=0.0;
        jarak=Math.sqrt(Math.pow(n2.getX()-n1.getX(),2)+Math.pow(n2.getY()-n1.getY(),2));
        return jarak;
    }
}