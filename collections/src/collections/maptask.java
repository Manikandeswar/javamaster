package collections;
import java.util.*;
import java.util.Scanner;
public class maptask {

	public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap();
	hm.put(01, "java");
	hm.put(04, "c++");
	System.out.println(hm);
	Scanner op=new Scanner(System.in);
	System.out.println("enter the option 1 for Staff 2 for Student:");
	int opt=op.nextInt();
	if(opt==1)
	{
		Scanner op2=new Scanner(System.in);
	System.out.println("enter the userkey:");
		int user=op2.nextInt();
		if(user==1234)
	{
		{
		
		System.out.println("eneter the no of books should be  added:");
		int num=op.nextInt();
		for (int i=0;i<=num;i++)
		{
		System.out.println("enter the book id:");
		System.out.println("enter the book name:");
		hm.put(op.nextInt(),op.nextLine());
		
		
		}

		}
		
		
	}
	else 
	{
		System.out.println("invalid user name and password:");
	}
	}
	else
	{
	System.out.println(hm);
	}
}
}

