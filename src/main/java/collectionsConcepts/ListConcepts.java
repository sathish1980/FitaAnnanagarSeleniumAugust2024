package collectionsConcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListConcepts {
	// CRUD - Create Read Update Delete
	public void listimplementation()
	{
	//	ArrayList<String> al = new ArrayList();
		LinkedList<String> al = new LinkedList();
		List<String> al1 = new ArrayList();
		System.out.println(al);
		// add
		al.add("sathish");
		al.addLast("kumar");
		al.add("sathish");
		al.add(1, "FITA");
		al.addFirst("first");
		System.out.println(al);
		
		// get
		for(String eachvalue : al)
		{
			System.out.println(eachvalue);
		}
		
		for(int i=0;i<al.size();i++)
		{
		System.out.println( al.get(i));
		}
		
		// contains
		System.out.println(al.contains("sathish"));
		
		//update
		al.set(1, "SATHISH");
		System.out.println(al);
		
		// remove
		
		//al.remove(1);
		al.removeFirst();
		al.removeLast();
		System.out.println(al.reversed());
		System.out.println(al);
		
		Object al2 =al.clone();
		al.clear();
		System.out.println(al);
	}
	
	
	public void Stackimplementation()
	{
		Stack<String> s = new Stack();
		Stack<String> s1 = new Stack();
		s1.add("java");
		s1.add("python");
		s1.add("sql");
		System.out.println(s);
		s.push("sathish");
		s.add("kumar");
		s.push("sathish");
		s.push("FITA");
		s.addAll(s1);
		System.out.println(s);
		
		s.pop();
		s.pop();
		s.remove(0);
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListConcepts L = new ListConcepts();
		L.Stackimplementation();
	}

}
