/*program to add two matrices */
package student_challenge1.student_challenge2;
public class addmatrix {
   public static void main(String[] args) {
    int a[][]={{3,4,3},{3,2,1}};
    int b[][]={{4,4,4},{5,4,3}};
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[0].length;j++)
        {
            System.out.print(a[i][j]+b[i][j]+" ");
        }
        System.out.println("");
    }
   } 
}
