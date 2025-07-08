package student_challenge1.student_challenge3;

public class rectdata {
    private int length;
    private int breadth;
    public rectdata()
    {
        length=1;
        breadth=1;
    }
    public rectdata(int le,int br)
    {
       setlenbre(le, br);
    }
    public void setlenbre(int l,int b)
    {   if(l>0&&b>0)
        length=l;
        breadth=b;
    }
    public int area()
    {
        return length*breadth;
    }
}
    class re{
    public static void main(String[] args) {
        rectdata r=new rectdata(5,3);
        r.setlenbre(4, 3);
        System.out.println(r.area());
    }
}
