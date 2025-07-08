/*program to find maximum 2 element */
package student_challenge1.student_challenge2;
public class max2 {
  public static void main(String[] args) {
    int a[]={3,2,5,6};
    int max1,max2;
    max1=max2=a[0];
    for(int i=0;i<a.length;i++)
    {
        if(a[i]>max1)
        {
            max2=max1;
            max1=a[i];
        }
        else if(a[i]>max2)
        {
            max2=a[i];
        }
    }
    System.out.println("second largest element:"+max2);
  }  
}
