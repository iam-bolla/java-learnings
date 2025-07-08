package student_challeneg_4;
class rect
{
 int l;
 int b;
 public rect()
 {
    l=b=1;
 }
 public rect(int l,int b)
 {
    this.l=l;
    this.b=b;
 }
 public int volume()
 {
    return l*b;
 }
}
class cuboid extends rect{
    public int height;
    public cuboid()
    {
        height=1;
    }
    public cuboid(int l,int b,int h){
     super(l,b);
      height=h;  
    }
    public int volume()
 {
    return l*b*height;
 }
}
public class smar {
    public static void main(String[] args) {
        cuboid c=new cuboid(10,3,2);
        System.out.println(c.volume());
    }
}
