/*program is for method overriding and dynamic dispatch */
package student_challeneg_4;
class super1{
void display()
{
    System.out.println("hello");
}
}
class sub extends super1
{
    void display()
    {
        System.out.println("hello welcome");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        super1 su=new super1();
        su.display();
        sub s=new sub();
        s.display();
        super1 sup=new sub();
        sup.display();
    }
}
