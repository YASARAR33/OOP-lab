import java.util.*;
class Array
{
	public static void main(String args[])
	{
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("one");
		obj.add("Three");
		obj.add("Four");
		obj.add("Five");
		obj.add(1,"Two");
		System.out.println("\nArrayList after add operation:");
		for(String str:obj)
		System.out.println(str);
		obj.remove("Five");
		obj.remove(1);
		System.out.println("\nArrayList after remove operation:");
		for(String str:obj)
		System.out.println(str);
		System.out.println("\nFinal ArrayList");
		for(String str:obj)
		System.out.println(str);
		Collections.sort(obj);
		System.out.println("\nArrayList after Sorting:");
		for(String str:obj)
		System.out.println(str);
		System.out.println("\nObject at index2:"+obj.get(2));
		System.out.println("\nSix is in the ArrayList:"+obj.contains("Six"));
		System.out.println("\nTwo is in the ArrayList:"+obj.contains("Two"));
		System.out.println("\nSize of the ArrayList:"+obj.size());
		obj.clear();
		System.out.println("\nArrayList after clear method:"+obj);
	}
}
