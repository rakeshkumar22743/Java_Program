import java.util.Scanner;
class swap2
{
public static void main(String[]args)
{
int a,b,temp;
System.out.print("Enter the value of a and b :");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
temp=a;
a=b;
b=temp;
System.out.print("Value after swapping :"); 
System.out.print("a="+a+"     " +"b="+b);
}
}