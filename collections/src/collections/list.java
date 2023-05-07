package collections;
import java.util.*;

class ArrayListEg {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("C");
		list.add("java");
		list.add("java");
		list.add(null);
		list.add(10);
		list.add(10.0);
		System.out.println(list);
		Object o=list.get(1);
		ArrayList list1=new ArrayList(list);
		System.out.println(list1);
		list.add(1,"C++");//adding one index
		list1.add(0,"fortran");
		list1.addAll(1,list);
		System.out.println(list);
		
		System.out.println(list1);
		
	    

	}

}
