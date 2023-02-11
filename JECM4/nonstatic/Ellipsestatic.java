class Ellipse
{
double area()
{
final double pi=3.142;
int a=67, b=576;
double res=pi*a*b;
return res;
}
}
class Ellipsestatic
{
public static void main(String[]args)
{
Ellipse y=new Ellipse();
double x=y.area();
System.out.println(x);
}
}