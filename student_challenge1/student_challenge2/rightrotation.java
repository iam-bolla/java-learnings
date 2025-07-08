/*program to find right rotation of an array */
package student_challenge1.student_challenge2;
public class rightrotation {
   public static void main(String[] args) {
    int a[]={7,6,5,4};
    int temp=a[a.length-1];
    for(int i=a.length-1;i>0;i--)
{
a[i]=a[i-1];
} 
a[0]=temp;
for(int x:a)
{
    System.out.println(x);
} 
 } 
}
