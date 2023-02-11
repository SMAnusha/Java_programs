class Sect
{
static void area(float r, double t)
{
double result=0.5*r*r*t;
System.out.println(result);
}
}
class Sectpara
{
public static void main(String[]args)
{
Sect.area(2.39f, 56.637);
}
}