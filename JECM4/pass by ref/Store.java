class Samsung
{
void product()
{
System.out.println("Products");
}
}
class Store
{
public static void main(String[]args)
{
Samsung s1=new Samsung();
Customer1.needproduct(s1);
}
}
class Customer1
{
static void needproduct(Samsung s2)
{
s2.product();
}
}