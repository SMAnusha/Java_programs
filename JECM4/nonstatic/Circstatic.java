class Circ
{
double area()
{
final double pi=3.142;
int r=60;
double a=pi*r*r;
return a;
}
}
class Circstatic
{
public static void main(String[]args)
{
Circ h= new Circ();
double i=h.area();
System.out.println(i);
}
}