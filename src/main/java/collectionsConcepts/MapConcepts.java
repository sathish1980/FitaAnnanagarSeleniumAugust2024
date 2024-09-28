package collectionsConcepts;

import java.util.ArrayList;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapConcepts {

	/*
	 * HashMap
	 * LinkedHashMap
	 * TreeMap
	 * 
	 * CRUD:
	 * C
	 * put
	 * putall
	 * putifabsent
	 * U
	 * replace
	 * replaceall
	 * D
	 * 
	 */
	
	ArrayList<String> AL = new ArrayList<>();
	
	public void Mapimplementation()
	{
		//HashMap<Integer,Object> hm = new HashMap<>();
		//LinkedHashMap<Integer,Object> hm = new LinkedHashMap<>();
		TreeMap<Integer,Object> hm = new TreeMap<>();
		Object hm1;
		AL.add("apple");
		AL.add("orange");
		AL.add("pineapple");
		
		System.out.println(hm);
		hm.put(2, "sathish");
		hm.put(3, "fita");
		hm.put(4, "R");
		hm.put(1, "Btech");
		hm.put(2, "fita");
		hm.put(7, AL);
		System.out.println(hm);
		hm.putIfAbsent(9, "annanagar");
		System.out.println(hm);
		hm.replace(9, "Annanagar - chennai");
		hm.replace(2, "fita", "FITA");
		System.out.println(hm);
		//hm.remove(3);
		hm.remove(3,"FITA");
		
		hm1 = hm.clone();
		//hm.clear();
		System.out.println(hm1);
		
		// get
		System.out.println(hm.get(9));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		for(Map.Entry M:hm.entrySet())
		{
			System.out.println(M);
			System.out.println(M.getKey());
			System.out.println(M.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapConcepts M = new MapConcepts();
		M.Mapimplementation();
	}

}
