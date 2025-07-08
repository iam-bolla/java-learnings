abstract class shape1{
abstract public double area();
abstract public double perimeter();
}
class circle extends shape1{
    public int radius;
    public double area()
    {
        return 2*Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}
class rectangle extends shape1
{
    public int length;
    public int breadth;
    public double area()
    {
        return 2*(length+breadth);
    }
    public double perimeter()
    {
        return length*breadth;
    }
}
public class shape {
    public static void main(String[] args) {
        
            circle s = new circle();
            s.radius = 9;  // Set radius to a positive value
          
            rectangle r = new rectangle();
            r.length = 3;
            r.breadth = 4;  // Set breadth to a positive value
          
            shape1 s1 = new circle();
            shape1 s2 = new rectangle();
          
            System.out.println(s1.area());
          }
}
