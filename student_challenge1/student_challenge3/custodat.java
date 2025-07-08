/*program to write about customer using datahiding and construtor */
package student_challenge1.student_challenge3;
class customer{
    private String custid;
    private String name;
    private String address;
    private long phoneno;
    public customer(String custid,String name,String address,long phoneno)
    {
        this.custid=custid;
        this.name=name;
        this.address=address;
        this.phoneno=phoneno;
    }
    public customer(String custid,String name)
    {
        this.custid=custid;
        this.name=name;
    }
    public void setap(String address,long phoneno)
    {
  this.address=address;
  this.phoneno=phoneno;
    }
    public String toString()
    {
        return "custid is "+custid+"\n"+"name is "+name+"\n"+"address is "+address+"\n"+"phoneno is "+phoneno;
    }
}
public class custodat {
    public static void main(String[] args) {
        customer c=new customer("2322", "rani");
        c.setap("kanigiri",7738728788l);
        System.out.println(c);
    }
}
