package HashMap;

import java.util.HashMap;
import java.util.Map;

public class iterateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap< Integer,String> hm=new HashMap<Integer, String>();
		hm.put(0,"Vijay" );
		hm.put(1,"ajay" );
		hm.put(3,"Don" );
		hm.put(null,null );

        for(Map.Entry me:hm.entrySet())
        {
        	System.out.println("Key is : "+me.getKey()+" and "+"Value is "+me.getValue());
        }
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        boolean flag = hm.containsKey(0);
        System.out.println(flag);
	}
	
}
