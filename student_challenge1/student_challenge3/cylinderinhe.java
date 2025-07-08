/*program to demonstrate inheritance of a cylinder */
package student_challenge1.student_challenge3;
import java.lang.*;;
class circle
{
    public int radius;
    public  double area()
    {
        return 2*Math.PI*radius*radius;
    }
}
class cylinder extends circle{

public double height;
   public double volume()
   {
    return area()*height;
   }
}
 class cylinderinhe {

    public static void main(String[] args) {
        cylinder c=new cylinder();
        c.radius=7;
        c.height=5;
        System.out.println("volume is"+c.area());
    }
}
