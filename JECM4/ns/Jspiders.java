class Jspiders
{
int java_mock;
static String in_name="Jspiders";
public static void main(String[]args)
{
System.out.println("Institute name is "+ in_name);
Jspiders Std1=new Jspiders();
Std1.java_mock=1;
System.out.println(Std1.java_mock);
Jspiders Std2=new Jspiders();
Std2.java_mock=2;
System.out.println(Std2.java_mock);
Std2.java_mock=1;
System.out.println(Std2.java_mock);
}
}


