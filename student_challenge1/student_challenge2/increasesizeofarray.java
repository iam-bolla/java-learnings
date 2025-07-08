package student_challenge1.student_challenge2;
public class increasesizeofarray {
    public static void main(String[] args) {
      int a[]={3,4,3,2,1};
      int b[]=new int[2*a.length];
      for(int i=0;i<a.length;i++)
      {
        b[i]=a[i];
      } 
      a=null;
      for(int x:b)
      {
        System.out.println(x);
      }
    }
}
