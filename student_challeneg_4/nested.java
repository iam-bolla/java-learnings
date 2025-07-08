/* program to demonstrate  nested in class */
package student_challeneg_4;
class outer
{
static int x=10;
class inner
{
    static int y=9;
    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }
}
inner i=new inner();
void display(){
i.display();
System.out.println(inner.y);
}
void dis(){
class inne{
void dis()
{
    System.out.println("hi");
}
}
inne i=new inne();
i.dis();
}
}
public class nested {
    public static void main(String[] args) {
     outer o=new outer();
    o.display();
    o.dis();
    outer.inner i=new outer().new inner();
    i.display();
    }
}
