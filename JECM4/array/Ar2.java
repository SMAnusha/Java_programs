class Ar2
{
public static void main(String[]args)
{
short[] arr=new short[3];
arr[0]=5;
arr[1]=500;
arr[2]=1000;

System.out.println("index \t values");
for(int i=0;i<arr.length;i++)
{
System.out.println(i+"\t"+arr[i]);
}
}
}