class Train
{
void search(int train_no)
{
System.out.println("your train number is "+ train_no);
}
static void search(String train_name)
{
System.out.println("your train name is "+ train_name);
}
void search(int train_no, String train_name)
{
System.out.println("your train name and number is "+ train_name +  train_no);
}
void search(String location, int train_no)
{
System.out.println("your train location is "+ location + "Number is " + train_no);
}
}
class where_is_my_train
{
public static void main(String[]args)
{
Train t = new Train();
t.search(7);
Train.search("Janshatabdi Express");
t.search(6, "Super Vasuki");
t.search("Banglore", 16525);
}
}
