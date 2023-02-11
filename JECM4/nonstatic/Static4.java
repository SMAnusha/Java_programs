class Nonstatic
{
void area()
{
final double pi=3.142;
float a=89.9f, b=68.8f;
double c=pi*a*b;
System.out.println(c);
}
}
class Static4
{
public static void main(String[]args)
{
Nonstatic y=new Nonstatic();
y.area();
}
}