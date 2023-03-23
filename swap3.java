class swap3
{
int a=2,b=3,temp;
public static void main(String[]args)
{
System.out.print("value of a and b before swapping :");
swap3 obj=new swap3();
System.out.println("a="+obj.a+"    " +"b="+obj.b);
obj.temp=obj.a;
obj.a=obj.b;
obj.b=obj.temp;
System.out.print("Value after swapping :");
System.out.print("a="+obj.a+"     " +"b="+obj.b);
}
}