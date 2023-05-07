package set;
import java.util.*;
class one
{
	int id,roll;
	String name;
	public one(int id,int roll,String name)
	{
		
		this.id=id;
		this.roll=roll;
		this.name=name;
		
		
	}
}
public class exhasset {

	public static void main(String[] args) {
	HashSet<one> set=new HashSet<one>();
	one o=new one(01,1,"mani");
	one o2=new one(02,2,"raja");
	one o3=new one(03,3,"siva");
	set.add(o);
	set.add(o2);
	set.add(o3);
	for (one b:set)
	{
		System.out.println(b.id+"  "+b.roll+"  "+b.name); 
	}
	}

}
