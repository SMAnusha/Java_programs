class phonepe_v1
{
void pay()
{
System.out.println("pay with number");
}
}
class phonepe_v2 extends phonepe_v1
{
void pay()
{
System.out.println("pay with scan");
super.pay();
}
}
class Super
{
public static void main(String[]args)
{
phonepe_v2 v2=new phonepe_v2();
v2.pay();
}
}