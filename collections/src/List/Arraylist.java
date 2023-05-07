package List;
import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		//array list creation
		ArrayList<String> list=new ArrayList<>();
		//Adding elements using add()method
		list.add("raja");
		list.add("siva");
		list.add("easwar");
		list.add("bala");
		list.add("sabari");
        //printing list elements
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
