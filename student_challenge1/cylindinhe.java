package student_challenge1;
class circle 
{
    public int radius;
    public double area()
    {
        return 2*Math.PI*radius*radius;    }
}
class cylinder extends circle
{
    public int height;
    public double volume()
    {
        return area()*height;
    }
}
public class cylindinhe {
    public static void main(String[] args) {
    cylinder c=new cylinder();
    c.radius=9;
    c.height=7;
    System.out.printf("volume is %4.2f",c.area());
}
}
