package student_challeneg_4;
interface test{
    void meth1();
}
class in{
    void display()
    {
        new test() {
           public void meth1()
            {
                System.out.println("hi");
            }
        
        }.meth1();
        
    }
}
public class anonymous {
    public static void main(String[] args) {
        in i=new in();
        i.display();
        
    }
}
