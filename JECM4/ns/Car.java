class Car
{
int car_cost;
String car_type;
static String model_name="BMW";
public static void main(String[]args)
{
System.out.println("Car model name is " + model_name);
Car car1=new Car();
car1.car_cost=100000;
System.out.println(car1.car_cost);
car1.car_type="X5";
System.out.println(car1.car_type);
Car car2=new Car();
car2.car_cost=300000;
System.out.println(car2.car_cost);
car2.car_type="5 Series";
System.out.println(car2.car_type);
}
}