/* program for method overriding */
package student_challeneg_4;
class tv
{
    public void switchon()
    {
        System.out.println("tv is on");
    }
}
class smart extends tv{
    public void switchon()
    {
        System.out.println("smart is on");
    } 
    public void browse()
    {
        System.out.println("browse");
    }
}
public class metov {
  public static void main(String[] args) {
    smart s=new smart();
    s.switchon();
   tv s1=new smart();
  
  }  
}
