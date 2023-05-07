import java.util.*;  
public class link{  
public static void main(String args[]){  
LinkedList<String> al=new LinkedList<String>();  
al.add("Ravi");  
al.add("Vijay");  
al.add("Ravi");  
al.add("Ajay");  
LinkedList<String> ll1=new LinkedList<>();
ll1.add("mani");
ll1.add("raja");
ll1.add("siva");
ll1.add("bala");
al.addAll(ll1);
LinkedList<String> l2=new LinkedList<>();
l2.add("saravanan");
l2.add("sabari");
al.addAll(1,l2);
Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
} 