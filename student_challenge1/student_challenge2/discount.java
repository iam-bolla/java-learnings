/*program to print discount */
package student_challenge1.student_challenge2;
public class discount {
    static double dis(double ...x)
    {
        int sum=0;
        for(int i=0;i<x.length;i++)
        {
            sum+=x[i];
        }
        if(sum>500) return sum*0.10;
        else if(sum>1000)return sum*0.15;
        else return sum*0.20;
    }
  public static void main(String[] args) {
    System.out.println(dis(1000,1232,4322));
  }  
}
