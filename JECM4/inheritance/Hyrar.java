class Tester
{
int a=40;
}
class Demo3 extends Tester
{
void add()
{
System.out.println("one boys pg");
}
}
class Sample3 extends Tester
{
void disp()
{
System.out.println("one girls pg");
}
}
class Hyrar
{
public static void main(String[]args)
{
Demo3 d3=new Demo3();
d3.add();
System.out.println(d3.a);
Sample3 s3=new Sample3();
s3.disp();
System.out.println(s3.a);
}
}