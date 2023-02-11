class Rectangle
{
int mul()
{
int w=70, h=100;
int res=w*h;
return res;
}
}
class Rectanglestatic
{
public static void main(String[]args)
{
Rectangle m1=new Rectangle();
int y=m1.mul();
System.out.println(y);
}
}