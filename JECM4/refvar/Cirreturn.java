class Cirreturn
{
double area()
{
int r=7;
final double pi=3.142;
double res=pi*r*r;
return res;
}
public static void main(String[]args)
{
Cirreturn n1=new Cirreturn();
double x=n1.area();
System.out.println(x);
}
}