class Nonstatic
{
void mul()
{
double b=76.8;
float h=87.6f;
double res=b*h;
System.out.println(res);
}
}
class Static6
{
public static void main(String[]args)
{
Nonstatic t=new Nonstatic();
t.mul();
}
}