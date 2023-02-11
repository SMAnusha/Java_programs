class Mobile
{
int mob_cost;
String mob_color;
static String mob_name="Red Mi";
public static void main(String[]args)
{
System.out.println("mob_name is " + mob_name);
Mobile mob_cost1=new Mobile();
mob_cost1.mob_cost=15000;
System.out.println(mob_cost1.mob_cost);

mob_cost1.mob_color="Pink";
System.out.println(mob_cost1.mob_color);


}
}