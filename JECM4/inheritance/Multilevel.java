class Tester
{
int a=40;
}
class Demo1 extends Tester
{
void add()
{
System.out.println("2 buildings");
}
}
class Sample1 extends Demo1
{
void disp()
{
System.out.println("one boys pg");
}
}
class Multilevel
{
public static void main(String[]args)
{
Sample1 s2=new Sample1();
s2.disp();
s2.add();
System.out.println(s2.a);
}
}