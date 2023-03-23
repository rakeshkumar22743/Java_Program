import java.util.Scanner;
class swap6
{
int a,b,temp;
public static void main(String[]args)
{
System.out.print("Enter the value of a and b :");
Scanner sc=new Scanner(System.in);
swap3 obj=new swap3();
obj.a=sc.nextInt();
obj.b=sc.nextInt();
obj.temp=obj.a;
obj.a=obj.b;
obj.b=obj.temp;
System.out.print("Value after swapping :");
System.out.print("a="+obj.a+"     " +"b="+obj.b);
}
}