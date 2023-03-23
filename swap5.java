import java.util.Scanner;
class swap5
{
int a,b;
public static void main(String[]args)
{
System.out.print("Enter the value of a and b :");
Scanner sc=new Scanner(System.in);
swap3 obj=new swap3();
obj.a=sc.nextInt();
obj.b=sc.nextInt();
obj.a=obj.a+obj.b;
obj.b=obj.a-obj.b;
obj.a=obj.a-obj.b;
System.out.print("Value after swapping :");
System.out.print("a="+obj.a+"     " +"b="+obj.b);
}
}