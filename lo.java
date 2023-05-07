import java.util.*;
class lo
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
System.out.println("enter the username:");

String sc=s.nextLine();

if(sc.matches(".*[A-Z].*"))
{
	Scanner s1=new Scanner(System.in);
System.out.println("enter the password:");
String pa=s1.nextLine();
if(pa.matches(".*[0-9a-z].*"))
{
	Scanner s2=new Scanner(System.in);
System.out.println("enter the mail.id:");
String ma=s2.nextLine();
if(ma.matches(".*[@].*"))
{
System.out.println("***your logged in***");
}
}
}
else 
{
System.out.println("check the username,password,mail id");

}

}
}