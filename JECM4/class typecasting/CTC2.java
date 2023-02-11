class Sample
{
void disp()
{
System.out.println("Good afternoon");
}
}
class Ampules extends Sample
{
void tata()
{
System.out.println("Hi hello");
}
}
class CTC2
{
public static void main(String[]args)
{
System.out.println("Upcasting");
Sample s1=new Ampules();
s1.disp();
System.out.println("Downcasting");
Ampules a1=(Ampules)s1;
a1.tata();
a1.disp();
}
}

