class Sector
{
void area(int r, int t)
{
double res=0.5*r*r*t;
System.out.println(res);
}
public static void main(String[]args)
{
Sector u=new Sector();
u.area(60,70);
}
}