class Cirreturn2
{
static double area(float r)
{
final double pi=3.142;
double result = pi*r*r;
return result;
}
public static void main(String[]args)
{
double x=area(42.63f);
System.out.println(x);
}
}