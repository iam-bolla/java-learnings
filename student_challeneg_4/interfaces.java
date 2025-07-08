/* program to demonstrate interfaces */
package student_challeneg_4;
interface test
{
    void meth1();
    void meth2();
}
class test1 implements test{
   public void meth1()
    {
     System.out.println("meth1");
    }
   public void meth2()
    {
     System.out.println("meth2");
    }
}
public class interfaces {
   public static void main(String[] args) {
    test  t=new test1();
    t.meth1();
    t.meth2();
   } 
}
