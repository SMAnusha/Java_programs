class Sector
{
static double area()
{
double r=68.97, t=76.8;
double res=1/2.0*r*r*t;
return res;
}
}
class Secreturn
{
public static void main(String[]args)
{
double n=Sector.area();
System.out.println(n);
}
}