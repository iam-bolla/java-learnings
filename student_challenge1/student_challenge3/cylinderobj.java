/*program for cylinder in oops */
package student_challenge1.student_challenge3;
import java.util.*;
class cylinder
{
    private int radius;
    private int height;
    public cylinder(int r,int h)
    {
      radius=r;
      height=h;
    }
    public void setrh(int ra,int he)
    {
        radius=ra;
        height=he;
    }
    public double lidarea()
    {
        return circumference()*(radius+height);
    }
    public double tsa()
    {
        return circumference()*radius;
    }
    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
    public double  circumference()
    {
        return 2*Math.PI*radius;
    }
}
public class cylinderobj {
    public static void main(String[] args) {
      cylinder c=new cylinder(3,4);
      Scanner sc=new Scanner(System.in);
      c.setrh(3, 2);
      System.out.println(c.circumference());
      System.out.println(c.lidarea());
      System.out.println(c.volume());
      System.out.println(c.tsa());
    }
}
