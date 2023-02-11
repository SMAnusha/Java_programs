class Demo
{
void area(int r)
{
int res=r*r;
System.out.println(res);

}
}
class Sample
{
public static void main (String[]args)
{
Demo s1 = new Demo();
s1.area(7);
System.out.println(s1);
}
}