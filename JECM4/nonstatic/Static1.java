class Nonstatic
{
void area()
{
double b=76.83, h=87.6d;
double res=0.5*b*h;
System.out.println(res);
}
}
class Static1
{
public static void main(String[]args)
{
Nonstatic s1=new Nonstatic();
s1.area();
}
}