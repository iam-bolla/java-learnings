/*program to print variable arguments */
package student_challenge1.student_challenge2;
public class varagr {
staticint var(int ...x)
{   int max=x[0];
    if(x.length==0) return Integer.MIN_VALUE;
    for(int i=0;i<x.length;i++)
    {
      if(x[i]>max)
      max=x[i];
    }
   return max;
}
    static void sum1(int ...x){
        int sum=0;
        for(int i=0;i<x.length;i++)
        {
            sum+=x[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
    var(3,2,2,11,1);
   sum1(1,2,3,2,3,4,4);
  }  
}
