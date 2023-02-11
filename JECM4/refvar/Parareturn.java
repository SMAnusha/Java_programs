class Parareturn
{
double area()
{
float b=67.6f, h=78.6f;
double c=b*h;
return c;
}
public static void main(String[]args)
{
Parareturn l=new Parareturn();
double m=l.area();
System.out.println(m);
}
}