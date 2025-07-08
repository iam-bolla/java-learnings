package student_challeneg_4;
interface test
{
    abstract public void meth1();
    public abstract void meth2();
    int x=10;
   default  void meth4(){ System.out.println("meth4");}
}
interface test2 extends test{
    public void meth3();
}
class test3 implements test2{
    public void meth1()
    {
        System.out.println("meth1");
    }
    public void meth2()
    {
        System.out.println("meth2"); 
    }
    public void meth3()
    {
        System.out.println("meth3");
    }
   
}
public class dos {
    public static void main(String[] args) {
       System.out.println(test.x); 
       test3 t=new test3();
       t.meth1();
       t.meth4();
    }
}
