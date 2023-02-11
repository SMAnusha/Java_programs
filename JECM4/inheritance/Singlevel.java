class Demo
{
int a=40;
}
class Sample extends Demo
{
void add()
{
System.out.println(" one boys pg");
}
}
class Singlevel
{
public static void main(String[]args)
{
Sample s1=new Sample();
s1.add();
System.out.println(s1.a);
}
}
