package collections;
import java.util.*;
 class Product implements Comparable<Product>
{
	int pid;
	int price;
	String pname;
	int qty;
	public int compareTo(Product p)
	{
		return this.price-p.price;
	}
	public Product(int pid,int price,String pname,int qty)
	{
	this.pid=pid;
	this.price=price;
	this.pname=pname;
	this.qty=qty;
}
	public int getid()
	{
		return pid;
	}
	public int getpr()
	{
		return price;
	}
	public int getqty()
	{
		return qty;
	}
	public String getnm() {
		// TODO Auto-generated method stub
		return pname;
	}
}

public class comaprable {

	public static void main(String[]args) {
	ArrayList <Product> list=new ArrayList<Product>();
	list.add(new Product(1, 10,"soap",10));
    list.add(new Product(3,25,"oil",5));
    list.add(new Product(4,54,"shampoo",3));
    list.add(new Product(2,30,"towel",2));

    Collections.sort(list);
    System.out.println("sorted lists are:");
    for (Product pr:list)
    {
    	System.out.println(pr.getid()+"  "+pr.getnm()+" "+pr.getqty()+" "+pr.getpr());
    }
	}

}
