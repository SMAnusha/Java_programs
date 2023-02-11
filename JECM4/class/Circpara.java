class Circ
{
static void area(float r)
{
final double pi=3.142;
double result=pi*r*r;
System.out.println(result);
}
}
class Circpara
{
public static void main(String[]args)
{
Circ.area(98.86f);
}
}