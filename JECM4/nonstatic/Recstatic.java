class Rec
{
void area(int w, int h)
{
int c=w*h;
System.out.println(c);
}
}
class Recstatic
{
public static void main(String[]args)
{
Rec y=new Rec();
y.area(50,100);
}
}
