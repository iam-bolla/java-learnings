/*program to print reverse of a number inmethod overloading */
package student_challenge1.student_challenge2;
public class reversemethodoverload {
    static void reverse(int a)
    {
        int rev=0;
        while (a>0) {
            int r=a%10;
            rev=rev*10+r;
            a=a/10;
        }
        System.out.println("reverse is "+rev);
    }
    static void reverse(int a[])
    {
     int b[]=new int[a.length];
     for(int i=a.length-1,j=0;i>=0;i--,j++)
     {
      b[j]=a[i];
     }
     for(int x:b)
     {
        System.out.println(x);
     }
    }
   public static void main(String[] args) {
    int a[]={9,7,8,8,6};
    reverse(a);
   } 
}
