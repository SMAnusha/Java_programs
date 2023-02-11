class Cir
{
void area(int r)
{
final double pi=3.142;
double res=pi*r*r;
System.out.println(res);
}
}
class Cirstatic
{
public static void main(String[]args)
{
Cir m = new Cir();
m.area(90);
}
}