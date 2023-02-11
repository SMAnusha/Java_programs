class TV
{
int tv_cost;
String tv_type;
static String tv_brand="MI";
public static void main(String[]args)
{
System.out.println("TV brand name is "+ tv_brand);
TV tv1=new TV();
tv1.tv_cost=70000;
System.out.println(tv1.tv_cost);
tv1.tv_type="LED";
System.out.println(tv1.tv_type);
}
}
