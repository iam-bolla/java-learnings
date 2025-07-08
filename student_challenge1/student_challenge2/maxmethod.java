/*program to find maximum from array */
package student_challenge1.student_challenge2;
public class maxmethod {
    static int maxArr(int a[])
    {   int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max) max=a[i];
        }
        return max;
    }
   public static void main(String[] args) {
    int a[]={2,3,2,4,5};
    System.out.println(maxArr(a));
   } 
}
