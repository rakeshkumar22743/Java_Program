import java.util.Scanner;
class ternary
{
public static void main(String[]args)
{
int a,b,c;
System.out.printf("Enter the two number :");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=(a>b)?a:b;
System.out.print("Greatest number is :"+c);
}
}