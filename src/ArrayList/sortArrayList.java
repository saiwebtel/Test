package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> st = new ArrayList<String>();
		st.add("z");
		st.add("b");
		st.add("c");
		st.add("a");
		st.add("d");
		Collections.sort(st);
		System.out.println(st);
		//Desending order
		Collections.sort(st, Collections.reverseOrder());
		System.out.println(st);
		 
	}

}
