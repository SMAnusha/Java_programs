class Postoffice
{
void letter()
{
System.out.println("Pass by reference");
}
}
class Postman
{
public static void main(String[]args)
{
Postoffice p1=new Postoffice();
Customer1.needletter(p1);
}
}
class Customer1
{
static void needletter(Postoffice p2)
{
p2.letter();
}
}