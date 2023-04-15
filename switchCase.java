import java.util.Scanner;
class switchCase
{
public static void main(String[]args)
{
System.out.print("Enter the single charcter :");
Scanner sc=new Scanner(System.in);
char ch; 
ch=sc.next().charAt(0);
switch(ch)
{
case 'M':
case 'm':
{
System.out.print("MAIL");
break;
}
case 'F':
case 'f':
{
System.out.print("FEMAIL");
break;
}
default:
{
System.out.print("Sorry you press the wrong key");
break;
}
}
}
}