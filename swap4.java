class swap4
{
int a=2,b=3;
public static void main(String[]args)
{
System.out.print("value of a and b before swapping :");
swap3 obj=new swap3();
System.out.println("a="+obj.a+"    " +"b="+obj.b);
obj.a=obj.a+obj.b;
obj.b=obj.a-obj.b;
obj.a=obj.a-obj.b;
System.out.print("Value after swapping :");
System.out.print("a="+obj.a+"     " +"b="+obj.b);
}
}