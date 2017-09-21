package Programs;

import java.util.*;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<String>();
		str.add("B");
		str.add("A");
		str.add("C");
		str.add("Z");
		str.add("E");
		str.add("D");
		System.out.println(str);
		//str.remove(1);
		//System.out.println(str);
		//str.remove("Ram3");
		//System.out.println(str);
		//str.add(0, "NEW");
		//System.out.println(str);
		//Using For Loop
		//for (String st : str) 
		//{
			//System.out.println(st);
		//}
		//System.out.println(str.size());
		//Using Size
		//if (str.size() > 8)
		//{
			//System.out.println("Greater");
		//}
		//else
		//{
			//System.out.println("Smaller");
		//}
		//Remove Duplicate elements from araayList
		 //Set<String> primesWithoutDuplicates = new LinkedHashSet<String>(str);
		 //str.clear();
		 //str.addAll(primesWithoutDuplicates);
		 //System.out.println("list of primes without duplicates : " + str);
       Collections.reverse(str);
       System.out.println(str);
       Collections.sort(str);
       System.out.println(str);

	}

}
