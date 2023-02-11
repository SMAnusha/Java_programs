class Home
{
int home_cost;
String home_color;
static String hom_name="SLV";
public static void main(String[]args)
{
System.out.println("Home nmae is "+ hom_name);
Home hom1=new Home();
hom1.home_cost=100000;
System.out.println(hom1.home_cost);
hom1.home_color="Navyblue";
System.out.println(hom1.home_color);
}
}