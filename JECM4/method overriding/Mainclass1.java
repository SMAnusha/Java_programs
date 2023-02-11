class Ola_v1
{
void ride()
{
System.out.println("Ajay your ride is Here");
}
}
class Ola_v2 extends Ola_v1
{
void ride()
{
System.out.println("ride with cabs, auto, mini, sedan");
}
}
class Mainclass1
{
public static void main(String[]args)
{
Ola_v2 v2=new Ola_v2();
v2.ride();
}
}
