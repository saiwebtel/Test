package Programs;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Hello how r You";
       
        //First WAY
         char[] ch=s.toCharArray(); 
        for(int i=ch.length-1; i>=0; i--)
        {
        	System.out.print(ch[i]);
        }
        
        //Second WAY
    	//System.out.println(s);

        /* StringBuilder sb=new StringBuilder(); 
        sb.append(s);
        sb=sb.reverse();
       System.out.println(sb); */
	}

}
