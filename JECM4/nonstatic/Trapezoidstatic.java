class Trapezoid
{
double area()
{
float a=78.6f, b=97.68f;
double h=963.8;
double r=0.5*(a+b)*h;
return r;
}
}
class Trapezoidstatic
{
public static void main(String[]args)
{
Trapezoid z= new Trapezoid();
double x=z.area();
System.out.println(x);
}
}