class Ell
{
void area(int a, int b)
{
final double pi=3.142;
double c=pi*a*b;
System.out.println(c);
}
}
class Ellstatic
{
public static void main(String[]args)
{
Ell x1=new Ell();
x1.area(90, 80);
}
}