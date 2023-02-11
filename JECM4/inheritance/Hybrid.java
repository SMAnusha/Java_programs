class Tester
{
int a=30;
}
class Demo3 extends Tester
{
void add()
{
System.out.println("two buildings");
}
}
class Sample3 extends Demo3
{
void disp()
{
System.out.println("one girls pg");
}
}
class Sample4 extends Tester
{
void mul()
{
System.out.println("three acre");
}
}
class Hybrid
{
public static void main(String[]args)
{
Sample3 s3=new Sample3();
s3.disp();
s3.add();
System.out.println(s3.a);
Sample4 s4=new Sample4();
s4.mul();
System.out.println(s4.a);
}
}