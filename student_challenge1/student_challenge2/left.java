/*program to find left rotation of an array */
package student_challenge1.student_challenge2;
public class left {
    public static void main(String[] args) {
        int a[]={6,5,43,3};
        int temp=a[0];
        for(int i=0;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }
        a[a.length-1]=temp;
        for(int x:a)
        {
            System.out.println(x);
        }
    }
}
