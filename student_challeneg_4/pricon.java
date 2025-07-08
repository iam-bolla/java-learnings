package student_challeneg_4;
class Str{
    int qty;
    static Str s=null;
    int water=9;
    private Str()
    {
        qty=8;
        water=6;
    }
    static public Str getin()
    { 
        for(int i=0;i<5;i++)
        {  if(s==null){
            s=new Str();}
            else{
                s=null;
            }
        }
        return s;
    }
}

public class pricon {
    public static void main(String[] args) {
        Str s1=Str.getin();
        Str s2=Str.getin();
        Str s3=Str.getin();
        Str s4=Str.getin();
        Str s5=Str.getin();
        Str s6=Str.getin();
        Str s7=Str.getin();
        System.out.println(s1==s4);
    }
}
