import java.util.*;
class MapDemo
{
   public static void main(String args[])
   {
   Map m=new LinkedHashMap();
   m.put(102,"B");
   m.put(101,"C");
   m.put(103,"A");
   m.put(null,"Radhika");
   m.put(104,null);
   m.put(105,null);
   m.put(null,"Aarya");
   System.out.println(m);
   m.remove(105);
   System.out.println(m);
   }
}