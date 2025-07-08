/* program to print matrix multiplication */
package student_challenge1.student_challenge2;
import java.util.*;
public class matrixmulti {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt();
    int a[][]={{2,1},{1,4}};
    int b[][]={{1,3,3},{2,1,2}};
    int c[][]=new int[2][3];
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<3;j++)
        {
            for(int k=0;k<2;k++)
            {
             c[i][j]=c[i][j]+a[i][k]*b[k][j];
             
            }
            System.out.print(c[i][j]+"  ");
        }
        System.out.println(" ");
    }
   } 
}
