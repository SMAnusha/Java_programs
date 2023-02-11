class Mobile
{
int mobcost;
String mobname;
String mobcol;
Mobile(int mobcost, String mobname, String mobcol)
{
this.mobcost=mobcost;
this.mobname=mobname;
this.mobcol=mobcol;
}
public boolean equals(Object obj)
{
Mobile m1=(Mobile)obj;
return this.mobname==m1.mobname;
}
public static void main(String[]args)
{
Mobile m2=new Mobile(20000,"MI","Red");
Mobile m3=new Mobile(50000,"Vivo", "Blue");
if(m2.equals(m3))
{
System.out.println("Mobile model name is same");
}
else
{
System.out.println("Mobile name is not same");
}
}
}
