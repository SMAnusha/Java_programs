class Employee
{
static String emp_id="SAE01";
int emp_sal=70000;
char emp_grade='A';
public static void main(String[]args)
{
System.out.println("Employee id is "+ emp_id);
Employee id1=new Employee();
System.out.println("Employee salary is "+ id1.emp_sal);
System.out.println("Employee grade will be "+ id1.emp_grade);
}
}