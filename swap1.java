class swap1
{
public static void main(String[]args)
{
int a=2,b=3;
System.out.print("value of a and b before swapping :");
System.out.println("a="+a+"    " +"b="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.print("Value after swapping :");
System.out.print("a="+a+"     " +"b="+b);
}
}