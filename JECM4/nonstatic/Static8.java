class Nonstatic
{
void area()
{
double r=87.9, t=98.8d;
double res=0.5*r*r*t;
System.out.println(res);
}
}
class Static8
{
public static void main(String[]args)
{

Nonstatic v=new Nonstatic();
v.area();
}
}