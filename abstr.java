/*program to demonstrate abstract class */

 class Super
{
public Super()
{
    System.out.println("super constrcuctor");
}
public void meth1()
{
    System.out.println("meth1 of super");
}
public void meth2(){}
}
class sub extends Super
{
    public void meth2()
    {
        System.out.println("meth3 of sub");
    }
}
public class abstr {
   public static void main(String[] args) {
    sub s1=new sub();
    s1.meth1();
    s1.meth2();
   /* compiler knows here one to call as we mentioned s1 means sub class if we use dynamic dispatch the 
    * compiler dont know as it holds sub class object with super class reference so at runtime depending 
    on objects class it will decide

    */
   } 
}
