class Triangle
{
double area()
{
int b=70, h=80;
double res=0.5*b*h;
return res;
}
}
class Trianglestatic
{
public static void main(String[]args)
{
Triangle s1=new Triangle();
double x=s1.area();
System.out.println(x);
}
}