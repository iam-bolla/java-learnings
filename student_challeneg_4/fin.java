package student_challeneg_4;

public class fin {
    final int f;
    
    fin(){
        f=1;
    }
    fin(int f)
    {
     this.f=f;
    }
    public static void main(String[] args) {
        fin f1=new fin(7);
       System.out.println(f1.f);
    }
}
