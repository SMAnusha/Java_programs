class School
{
String scl_name;
char scl_grade;
short scl_strength;
public static void main(String[]args)
{
School scl1=new School();
scl1.scl_name="St.Joseph";
System.out.println(scl1.scl_name);
scl1.scl_grade='A';
System.out.println(scl1.scl_grade);
scl1.scl_strength=1000;
System.out.println(scl1.scl_strength);

School scl2=new School();
scl2.scl_name="JNES";
System.out.println(scl2.scl_name);
scl2.scl_grade='B';
System.out.println(scl2.scl_grade);
scl2.scl_strength=500;
System.out.println(scl2.scl_strength);
}
}