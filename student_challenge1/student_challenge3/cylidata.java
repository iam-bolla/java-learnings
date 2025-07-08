/*program to write all posible methods data hiding and constructors  */
package student_challenge1.student_challenge3;
class cyl
{
    private int radius;
    private int height;
    public cyl()
    {
        radius=height=1;
    }
    public cyl(int r,int h)
    {
        setrh(r,h);
    }
    public void setrh(int r,int h)
    {
      if(r>0&&h>0){
      radius=r;
      height=h;}
      else{
      radius=0;
      height=0;
      }
    }
    public double area()
    {
        return 2*Math.PI*radius*height;
    }
}
public class cylidata {
   public static void main(String[] args) {
    cyl c=new cyl(-1,-2);
    System.out.println(c.area());
   } 
}
