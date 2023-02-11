class Nonstatic
{
void area()
{
final double pi=3.142;
int r=50;
double c=pi*r*r;
System.out.println(c);
}
}
class Static7
{
public static void main(String[]args)
{
Nonstatic u=new Nonstatic();
u.area();
}
}