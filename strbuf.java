import java.lang.StringBuffer;
import java.util.Scanner;
class Strbuf
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);

StringBuffer obj =new StringBuffer("");
obj=sc.nextLine();
obj.append("hi");
System.out.println(obj);
System.out.println(obj.capacity());
System.out.println(obj.reverse());
System.out.println(obj.insert(1,"java"));
}


}

