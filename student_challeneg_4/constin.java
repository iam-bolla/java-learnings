/*program to demonstrate constructor in inheritance */
package student_challeneg_4;
class parent
{
    public parent()
    {
        System.out.println("parent class constructor");
    }
}
class child extends parent
{
    public  child()
    {
        System.out.println("child class constructor");
    }
}
public class constin {
    public static void main(String[] args) {
        child c=new child();
        parent p=new parent();
       
    }
}
