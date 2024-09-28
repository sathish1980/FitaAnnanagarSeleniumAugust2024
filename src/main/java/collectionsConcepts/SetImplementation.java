package collectionsConcepts;

import java.util.*;

public class SetImplementation {
	
	public void setlogic()
	{
		//HashSet<Integer> h = new HashSet();
		//LinkedHashSet<Integer> h =  new LinkedHashSet();
	TreeSet<Object> h =  new TreeSet();
		ArrayList<Integer> a = new ArrayList();
		HashSet<Integer> h1= new HashSet();
		System.out.println(h);
		h.add(6);
		h.add(6);
		h.add(16);
		h.add(1);
		//h.add("Idly");
		System.out.println(h);
		//a.addAll(h);
		System.out.println(a);
		a.removeFirst();
		h.clear();
		h.addAll(a);
		System.out.println(h);
		
	/*	for(Integer eachvalue : h)
		{
			System.out.println(eachvalue);
		}*/
		
		Iterator i = h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		h.remove(1);
		h.add(6);
		System.out.println(h);
		Collections.sort(a,Collections.reverseOrder());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetImplementation s = new SetImplementation();
		s.setlogic();
	}

}
