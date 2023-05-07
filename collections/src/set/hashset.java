package set;
import java.util.*;

public class hashset {

	public static void main(String[] args) {
		HashSet<String> st=new HashSet<String>();
		st.add("mani");
		st.add("raja");
		st.add("siva");
		Iterator<String> it=st.iterator();
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
