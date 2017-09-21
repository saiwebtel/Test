package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> st=new ArrayList<String>();
		st.add("Vinay");
		st.add("ajay");
		st.add("pankaj");
		st.add("kamal");
		st.add("Vinay");
		st.add("ajay");
		st.add("ajay");
		st.add("Vinay");

		HashSet<String> set = new HashSet<String>();
		 
        for (String arrayElement : st)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
	
	}

}
