package StringConcepts;

public class Stringclass {
	
	String name = " Sathish Kumar.R B.TEch sss ";
	
	public void display(String execptedItem)
	{
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.contains("Kumar"));
		System.out.println(name.equals("Sathish Kumar.R B.TEch"));
		System.out.println(name.equalsIgnoreCase("sathish kumar.R B.TEch"));
		System.out.println(name.compareTo("Sathish Kumar.R B.TEch"));
		System.out.println(name.startsWith("Sathish"));
		System.out.println(name.endsWith("Sathish"));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.indexOf('a'));
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.charAt(11));
		char[] change = name.toCharArray();
		int count=0;
		for(char eachvalue : change)
		{
			System.out.println(eachvalue);
			if(String.valueOf(eachvalue).equalsIgnoreCase("S"))
			{
				count=count+1;
			}
		}
		System.out.println("a present "+count+" times");
		
		String[] aftersplit = name.split("at");
		for(String eachvalue : aftersplit)
		{
			System.out.println(eachvalue);
		}
		
		String[] items= {"idly-25","poingal-10","poori-35"};
		for(String eachvalue :items)
		{
			String[] aftesplit = eachvalue.split("-");
			String itemName = aftesplit[0];
			String itemprice = aftesplit[1];
			if(itemName.equals(execptedItem))
				System.out.println("The price for "+execptedItem+" is "+itemprice);
		}
		
		System.out.println(name.replace("B.TEch ", "B.TECH"));
		String name1 =name.replace("B.TEch ", "B.TECH");
		System.out.println(name1);
		System.out.println(name);
		System.out.println(name.trim());
		System.out.println(name.substring(2,10));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringclass S = new Stringclass();
		S.display("Poori");
	}

}
