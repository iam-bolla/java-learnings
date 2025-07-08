package student_challenge1.student_challenge3;

import java.util.Arrays;

public class arrs {
    private String rollno;
    private String name;
    private String dept;
    private String[] sub;
    public arrs(String rollno,String name,String dept,String ...sub)
    {
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
        this.sub=sub;
    }
    public arrs(String rollno,String name,String dept)
    {
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;  
    }
    public void setsub(String ...sub)
    {
        this.sub=sub;
    }
    public String[] getsub()
    {
        return sub;
    }
    public String toString()
    {
    return "rollno "+rollno+"\n"+"name "+name+"\n"+"dept "+dept+"\n"+"sub "+Arrays.toString(sub);
    }
}
class sub{
    public static void main(String[] args) {
        arrs a[]=new arrs[2];
        a[0]=new arrs("1","rani","c.s.e","os","ds","physics");
      a[0].setsub("d.s","d.s");
        a[1]=new arrs("2", "lucky", "ece", "os","ds","pysics");
        for(arrs x:a)
        System.out.println(x);
       for(arrs s:a)//a is refernce holding addresses
       {
        System.out.println(Arrays.toString(s.getsub()));
       }
    }
}
