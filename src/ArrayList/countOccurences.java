package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class countOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> st=new ArrayList<String>();
		st.add("Vinay");
		st.add("ajay");
		st.add("pankaj");
		st.add("kamal");
		st.add("Vinay");
		st.add("ajay");
		st.add("Vinay");
		Map<String, Integer> counts = new HashMap<String, Integer>();

		for (String str : st) {
		    if (counts.containsKey(str)) 
		    {
		   
		    	counts.put(str, counts.get(str) + 1);
		    } else {
		        counts.put(str, 1);
		    }
		}

		for (Map.Entry<String, Integer> entry : counts.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
