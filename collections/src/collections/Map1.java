package collections;
import java.util.*;
import java.util.Map.Entry;
public class Map1 {

	public static void main(String[] args) 
	{
		//non-generic method
		HashMap map=new HashMap(); 

map.put(1,"amit");
map.put(2,"mani");
map.put(3, "raja");
Set set=map.entrySet();
Iterator itr=set.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
//generic method

HashMap <Integer,String> map1=new HashMap<>();
map1.put(01, "mani");
map1.put(02, "mani");
map1.put(03, "naveen");
map1.put(01, "praveen");
for(Entry<Integer, String> m:map1.entrySet())
{  
		   System.out.println(m.getKey()+" "+m.getValue());
}
	}

}
