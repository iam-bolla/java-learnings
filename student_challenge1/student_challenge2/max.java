/* program to find maximum element */
package student_challenge1.student_challenge2;
public class max {
    public static void main(String[] args) {
        int a[]={2,4,3,5};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("maximum element:"+max);
    }
}
