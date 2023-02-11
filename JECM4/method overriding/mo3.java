class Youtube_y1
{
void advertisement()
{
System.out.println("Ads with 30 sec");
}
}
class Youtube_y2 extends Youtube_y1
{
void advertisement()
{
System.out.println("Ads about 2 min");
}
}
class mo3
{
public static void main(String[]args)
{
Youtube_y2 y6=new Youtube_y2();
y6.advertisement();
}
}
