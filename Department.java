import java.util.*;
class Department
{
   public static void main(String args[])
   {
     Map m=new HashMap();
	 m.put(101,"IT");
	 m.put(102,"EC");
	 m.put(103,"CS");
	 m.put(104,"CA");
	 
	 System.out.println(m.keySet());
	  System.out.println(m.values());
	  System.out.println(m.entrySet());
	  
	  Map e=new TreeMap(m);
	  e.put(101,"Java");
	  e.put(102,"Php");
	  System.out.println(e);
	  System.out.println(e.get(101));
	  
	  
	  
   }
}