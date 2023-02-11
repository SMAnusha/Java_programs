class Tra
{
void area(float a, double b, int h)
{
double c=0.5*(a+b)*h;
System.out.println(c);
}
}
class Trastatic
{
public static void main(String[]args)
{
Tra z=new Tra();
z.area(78.6f, 96.8, 50);
}
}