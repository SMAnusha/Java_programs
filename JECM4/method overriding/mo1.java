class Amazonprime_v1
{
void movies()
{
System.out.println("Free Movies");
}
}
class Amazonprime_v2 extends Amazonprime_v1
{
void movies()
{
System.out.println("movies with subscription");
}
}
class mo1
{
public static void main(String[]args)
{
Amazonprime_v2 v2=new Amazonprime_v2();
v2.movies();
}
}
