class Course
{
String cour_name;
static String unvir_name="VTU";
int ex_cost;
public static void main(String[]args)
{
System.out.println("University name is "+ unvir_name);
Course cou1=new Course();
cou1.cour_name="CSE";
System.out.println(cou1.cour_name);
cou1.ex_cost=90000;
System.out.println(cou1.ex_cost);
}
}
