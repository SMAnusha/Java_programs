class Demo
{
int x=10;
}
class PemoCha extends Demo
{
void ho()
{
System.out.println("sub class");
}
}
class CTC1
{
public static void main(String[]args)
{
System.out.println("***upcasting***");
Demo d1=new PemoCha();
System.out.println(d1.x);
System.out.println("***Downcasting***");
PemoCha p1=(PemoCha)d1;
System.out.println(p1.x);
p1.ho();
}
}