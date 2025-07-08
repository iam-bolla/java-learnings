/*program to demonstrate account of savings and withdrawusing inheritance condept */
package student_challeneg_4;
class account
{
    protected double balance;
    private String name;
    private String address;
    private long phno;
    private String dob;
    public account(){}
    public account(double balance,String name,String dob)
    {
        this.balance=balance;
        this.name=name;
        this.phno=phno;
        this.address=address;
        this.dob=dob;
    }
     public double getbalance()
    {
       return balance;
    }
    public String getname()
    {
        return name;
    }
    public long getphno()
    {
        return phno;
    }
    public String getdob()
    {
        return dob;
    }
    public void setphno(long ph)
    {
        phno=ph;
    }
    public void setaddress(String add)
    {
        address=add;
    }
    public void close()
    {
        System.out.println("acc close");
    }
}
class savingsacc extends account
{ 
//  public savingsacc(double balance, String name, String dob) {
//         super(balance, name, dob);
//         //TODO Auto-generated constructor stub
//     }

public double deposit(double amt)
 {
    return  getbalance()+amt;
 }
 public double withdraw(double amt)
 {
    return balance-=amt;
 }
}
class loanacc extends account
{

    public loanacc(double balance, String name, String dob) {
        super(balance, name, dob);
        //TODO Auto-generated constructor stub
    }
    public double payemi(double amt)
    {
        return balance-=amt;
    }
}
public class acc {
    public static void main(String[] args) {
        savingsacc s=new savingsacc(98000, "rani", "3-02-2007");
        System.out.println(s.deposit(394994));
        System.out.println(s.withdraw(394994));
        loanacc l=new loanacc(0, null, null);
        System.out.println(l.payemi(4000));
    }
}
