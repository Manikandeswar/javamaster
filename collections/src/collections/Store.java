package collections;
import java.util.*;

class Sto
{
	int id,qt;
	String name;
	
public Sto(int id,int qt,String name)
{
	this.id=id;
	this.qt=qt;
	this.name=name;
}
}
public class Store {

	public static void main(String[] args)throws Exception  {
	List<Sto> st=new ArrayList<Sto>();
	List<Sto> sl=new ArrayList<Sto>();
	st.add(new Sto(00,2,"oil"));
	st.add(new Sto(01,3,"soap"));
	st.add(new Sto(02,1,"handwash"));
	
	System.out.println("product list is :" );
    
	
	for(Sto l:st)
	{
		System.out.println(+l.id+" "+l.name+" "+l.qt);
		
	    
		}
	Scanner i=new Scanner(System.in);
	System.out.println("enter the product id:");
	try
	{
    int c= i.nextInt();
  sl.add(st.get(c));
    
    for(Sto l1:sl)
    {
    	System.out.println("your ordered product is:");
    	System.out.println(+l1.id+" "+l1.name+""+l1.qt);
    }
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
	}
	
