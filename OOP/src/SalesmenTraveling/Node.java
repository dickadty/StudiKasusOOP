package SalesmenTraveling;

class Node
{
    private String n;
    private int x;
    private int y;
    public Node()
    {
    }
    public Node(String nama,int koordinatx,int koordinaty)
    {
        n=nama;
        x=koordinatx;
        y=koordinaty;
    }
    public void setKoordinat(String nama,int koordinatx,int koordinaty)
    {
        n = nama;
        x = koordinatx;
        y = koordinaty;
    }
    public void setNama(String nama)
    {
        n = nama;
    }
    public String getNama()
    {
        return n;
    }
    public void setX(int koordinatx)
    {
        x = koordinatx;
    }
    public int getX()
    {
        return x;
    }
    public void setY(int koordinaty)
    {
        y = koordinaty;
    }
    public int getY()
    {
        return y;
    }
}