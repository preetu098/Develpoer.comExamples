import java.util.*;
class SetDemo
{
  public static void main(String args[])
  {
    Set a=new LinkedHashSet();
	a.add("One");
	a.add("Two");
	a.add("Three");
	a.add("Four");
	a.add("One");
	a.add(null);
	a.add(null);
	System.out.println(a);
  }
}