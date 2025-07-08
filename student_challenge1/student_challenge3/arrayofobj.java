package student_challenge1.student_challenge3;

import student_challenge1.student_challenge2.primenum;

public class arrayofobj {
    private String subid;
    private String subname;
    private int marksobtain;
    private int maxmarks;
    private String rollno;
    private String name;
    private String deptname;
    public arrayofobj(String subid,String subname,int maxmarks,String rollno,String name,String deptname)
    {
        this.subid=subid;
        this.subname=subname;
        this.maxmarks=maxmarks;
        this.rollno=rollno;
        this.name=name;
        this.deptname=deptname;
    }
public void setmarksobtain(int marks)
{
 marksobtain=marks;
}
public String toString()
{
    return "student name "+name+"\n"+"student rollno "+rollno+"\n"+"deptname "+deptname+"\n"+"subject id "+subid+"\n"
    +"subname "+subname+"\n"+"maxmarks "+maxmarks+"\n"+"marks obtain "+marksobtain+"\n";
}
}
class subid{
    public static void main(String[] args) {
        arrayofobj ar[]=new arrayofobj[2];
        ar[0]=new arrayofobj("01", "d.s", 100, "517", "rani", "c.s.e");
        ar[1]=new arrayofobj("02", "o.s", 100, "517", "rani", "c.s.e");
        for(arrayofobj s:ar)
        System.out.println(s);
    }
}
