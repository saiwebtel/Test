package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> st = new ArrayList<String>();
		st.add("Vinay");
		st.add("ajay");
		st.add("pankaj");
		Collections.reverse(st);
		System.out.println(st);
	}

}
