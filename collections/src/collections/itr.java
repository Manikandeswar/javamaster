//*sorting nos
package collections;
import java.util.*;
public class itr {

	public static void main(String[] args) {
		ArrayList <Integer> itr1=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value to find sort:");
		int no=s.nextInt();
		for(int i=0;i<=no;i++)
		{
			//System.out.println(i);
			itr1.add(i);
			ListIterator<Integer> list1=itr1.listIterator();
			while(list1.hasNext())
			{
				list1.next();
			}
		while(list1.hasPrevious())
			{
				
				System.out.println(list1.previous());
			}
			
			
			
			
		}
	}
			}

