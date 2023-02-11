class Sect
{
double area()
{
double r=63.8, t=78.6d;
double u=0.5*r*r*t;
return u;
}
}
class Sectstatic
{
public static void main(String[]args)
{
Sect j=new Sect();
double k=j.area();
System.out.println(k);
}
}