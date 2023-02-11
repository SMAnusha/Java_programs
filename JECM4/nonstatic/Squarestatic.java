class Square
{
int area()
{
int a=66;
int d=a*a;
return d;
}
}
class Squarestatic
{
public static void main(String[]args)
{
Square b= new Square();
int c= b.area();
System.out.println(c);
}
}