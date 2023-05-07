package collections;
import java.util.*;
import java.util.Map.Entry;

public class Map {

	public interface Entry<T1, T2> {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> h=new HashMap<>();
		
		String option;
		Scanner op=new Scanner(System.in);
		System.out.println("enter your option 1.staff 2.Student");
		int o=op.nextInt();
		
		Scanner en=new Scanner (System.in);		
	
		if(o==1) 
		{
			Scanner un=new Scanner(System.in);
			System.out.println("enter the username:");
			String us=un.nextLine();
			String us1=us;
			System.out.println("enter the password:");
			int pass=un.nextInt();
			
			int pa=1234;
		
			while (us==us1)
			{
				
				
				Scanner ad=new Scanner(System.in);
				int n;
				System.out.println("enter the no of book you should add:");
				n=ad.nextInt();
				for(int i=0;i<=n;i++)
				{
					System.out.println("enter thebook id:");
					System.out.println("enter the book name:");
					int id=ad.nextInt();
				String book=ad.nextLine();
			         h.put(id, book);
			System.out.println("books are added into library:");
			}
			}
		}
		else 
				{
			System.out.println("unable to update the books:");
				}
		if(o==2)
			for (java.util.Map.Entry<Integer, String> q: h.entrySet())
			{
				System.out.println(q.getKey()+""+q.getValue());
				Scanner b=new Scanner(System.in);
				b.nextInt(q.getKey());
				System.out.println("u  r selected "+b);
			}
		else
					{
			System.out.println("invalid option");			
				}
	}
}
			
			
			
			

