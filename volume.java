class Shape
{
    double getVolume()
    {
        return 0;
    }
}

class Cube extends Shape
{
    private int side;

    Cube(int side)
    {
        this.side = side;
    }

    double getVolume()
    {
        return side * side * side;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Cube c = new Cube(5);
        System.out.println("Volume: " + c.getVolume()); 
    }
}
shape size co
