/*program to demonstrate copying of an array */
package student_challenge1.student_challenge2;
public class copyarray {
  public static void main(String[] args) {
    int a[]={3,4,3,2,2};
    int b[]=new int[a.length];
    for(int i=0;i<a.length;i++)
    {
        b[i]=a[i];
    }
    for(int x:b)
    {
        System.out.println(x);
    }
  }  
}
