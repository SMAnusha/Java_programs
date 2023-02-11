class Circle
{
void area(int r)
{
final double pi=3.142;
double res=pi*r*r;
System.out.println(res);
}
public static void main(String[]args)
{
Circle t1=new Circle();
t1.area(7);

}
}