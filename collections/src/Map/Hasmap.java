package Map;
import java.util.*;
public class Hasmap {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(100,"mani");
		map.put(101, "raja");
		map.put(104, "bala");
		map.put(103,"siva");
		map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey())  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);
		 for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		 

	}

}
