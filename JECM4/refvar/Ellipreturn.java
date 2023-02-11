class Ellipreturn
{
public static void main(String[]args)
{
Ellipreturn h=new Ellipreturn();
double i=h.area();
System.out.println(i);
}
double area()
{
final double pi=3.142;
int a=50, b=200;
double res= pi*a*b;
return res;
}
}