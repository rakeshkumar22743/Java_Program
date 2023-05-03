import java.util.Scanner;

class ExceptionHandling

{

public static void main(String[]args)

{

int a=5,b=0,i;

int c[]={1,2,3,4,5};
Scanner sc=new Scanner(System.in); 
System.out.println("Press 1 for Airthmetic Exception ");
System.out.println("Press 2 for Array Exception ");
System.out.println("Press 3 for Strings Exception ");   

System.out.print("Enter the number for your choices :");

int x=sc.nextInt();

switch(x)

{

case 1:

{

try

{

System.out.print(a/b);

}

catch(Exception e)

{

System.out.print("Airthmetic Exception Occurs");

break;

}

}

case 2:

{

try

{

for(i=0;i<=c.length;i++)

{

System.out.println(c[i]);    

}

}

catch(Exception e)

{

System.out.print("End of the program"); 

break;

}        

}
case 3:

{

String str=null;

try

{

System.out.print(str.toUpperCase());    

}

catch (Exception e)

{

System.out.print(e);
break;    

}
}
default :
{
System.out.print("Invalid Input");
break;




}

}

}
}