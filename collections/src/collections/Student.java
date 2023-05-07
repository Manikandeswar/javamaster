package collections;
import java.util.*;
class Student{
	    
	  
	 public static void main(String args[]){  
		 ArrayList <Integer> no=new ArrayList <>(); 
		 ArrayList <String>na=new ArrayList<>();
		 
		 for(int i=0;i<=4;i++)
		 {
			 int roll;
			 String name;
		 Scanner s=new Scanner(System.in); 
	   
	  System.out.println("enter the rollno:");
	   roll=s.nextInt();
	   no.add(roll);
  Scanner s1=new Scanner (System.in);
	  System.out.println("enter the name:");
	  name=s1.nextLine();
	  na.add(name);
		 }
	  Iterator itr=no.iterator();
	  Iterator itr1=na.iterator();
	while(itr.hasNext())	
	{
	while(itr1.hasNext())	 
		{
		System.out.println("rollno:"+""+itr.next()+""+"name:"+""+itr1.next());
		}
		}
		}
		 
		 
	  }  