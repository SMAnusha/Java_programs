class Trapreturn
{
double area()
{
int a=60, b=200, h=300;
double res=0.5*(a=b)*h;
return res;
}
public static void main(String[]args)
{
Trapreturn g=new Trapreturn();
double h=g.area();
System.out.println(h);
}
}