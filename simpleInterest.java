import java.util.Scanner;
class simpleInterest
{
public static void main(String[]args)
{
float p,r,t;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the value of P :");
p=sc.nextFloat();
System.out.print("Enter the value of r :");
r=sc.nextFloat();
System.out.print("Enter the value of t :");
t=sc.nextFloat();
float SI=(p*r*t)/100;
System.out.print(SI);
}
}