class Tri
{
void area(double b, int h)
{
double res=0.5*b*h;
System.out.println(res);
}
}
class Tristatic
{
public static void main(String[]args)
{
Tri x=new Tri();
x.area(78.6, 50);
}
}