package collections;
import java.util.*;
public class sort {

	public static void main(String[] args) {
		ArrayList <Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(56);
		list.add(123);
		list.add(520);
		Collections.sort(list);
		for(int num:list)
		{
			System.out.println(num);
		}

	}

}
