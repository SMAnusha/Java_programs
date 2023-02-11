class Nonstatic
{
void mul()
{
int w=50, h=100;
int res=w*h;
System.out.println(res);
}
}
class Static2
{
public static void main(String[]args)
{
Nonstatic s2=new Nonstatic();
s2.mul();
}
}