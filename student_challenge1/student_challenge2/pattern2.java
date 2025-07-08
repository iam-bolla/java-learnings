/* program to print loops */
package student_challenge1.student_challenge2;
public class pattern2 {
   public static void main(String[] args) {
    int count=1;
    for(int i=1;i<=5;i++)
    {
        for(int j=1;i+j<=6;j++)
        {
 // pattern1
//   System.out.print(j+" ");
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// pattern2
// System.out.print(count+++" ");
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// pattern3
//System.out.print(j+" ");
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1
        }
        System.out.println("");
    }
   } 
}
