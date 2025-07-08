/*prograam for rectangle in oops concept */
package student_challenge1.student_challenge3;
import java.util.*;
class rectangle
{
    public int length;
    public int breadth;
    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
    public Boolean issquare()
    {
        return length==breadth;
    }
}
public class rectangleobj {
    public static void main(String[] args) {
       rectangle r=new rectangle();
       Scanner sc=new Scanner(System.in);
       r.length=sc.nextInt();
       r.breadth=sc.nextInt();
       System.out.println("area is "+r.area()); 
       System.out.println("area is "+r.perimeter()); 
       System.out.println("area is "+r.issquare()); 
    }
}
