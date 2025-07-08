/*program to demonstrate reverse copy of an array */
package student_challenge1.student_challenge2;
public class reversecopyarray {
  public static void main(String[] args) {
    int a[]={4,3,2,2};
    int b[]=new int[a.length];
    for(int i=0,j=a.length-1;i<a.length;i++,j--)
    {
        b[j]=a[i];
    }
    for(int x:b)
    {
        System.out.println(x);
    }
  }
}
