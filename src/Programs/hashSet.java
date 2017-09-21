package Programs;

import java.util.*;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		Integer ls=r.nextInt();
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(ls);
		hs.add(2);
		hs.add(1);
		hs.add(4);
		hs.add(1);
		hs.add(6);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		for (Integer s:hs)
		{
			System.out.println(s);
		}
		hs.remove(4);
		System.out.println(hs);
	}

}
