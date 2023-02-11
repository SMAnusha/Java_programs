class Sample1
{
void method()
{
System.out.println("Method overriding super class");
}
}
class Demo1 extends Sample1
{
void disp()
{
System.out.println("method overriding");
}
}
class Sample3
{
public static void main(String[]args)
{
Demo1 s1=new Demo1();
s1.disp();}
}