package student_challeneg_4;
class outer{
static int x=3;
int y=5;
static class inner{
    void display()
    {
        System.out.println(x);
    }
}

}
public class static1 {
    public static void main(String[] args) {
        outer.inner i=new outer.inner();
        i.display();
    }
}
