class Sec
{
void area(float r, int t)
{
double res=0.5*r*r*t;
System.out.println(res);
}
}
class Secstatic
{
public static void main(String[]args)
{
Sec n=new Sec();
n.area(78.f, 98);
}
}