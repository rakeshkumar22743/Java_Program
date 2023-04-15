import java.util.Scanner;
class child1
{
Scanner sc=new Scanner(System.in);
int a[],n,i;
void input()
{
System.out.print("How many number you want :");
n=sc.nextInt();
a=new int [n];
System.out.print("Enter the number :");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
}
}
class child2 extends child1
{
int sum=0;
float av;
void avg()
{
for(i=0;i<n;i++)
{
sum=sum+a[i];
}
av=(float)sum/n;
}
}
class child3 extends child2
{
void show()
{
System.out.println("Average of the number is :"+av);
}
}
public class Average
{
public static void main(String[]args)
{
child3 obj=new child3();
obj.input();
obj.avg();
obj.show();
}
}