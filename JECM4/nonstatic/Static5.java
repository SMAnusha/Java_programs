class Nonstatic
{
void area()
{
int a=60;
int b=a*a;
System.out.println(b);
}
}
class Static5
{
public static void main(String[]args)
{
Nonstatic z= new Nonstatic();
z.area();
}
}