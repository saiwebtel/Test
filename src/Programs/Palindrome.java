package Programs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
        String A="madam";
        /* Enter your code here. Print output to STDOUT. */
       char[] ch=A.toCharArray(); 
        for(int i=0; i<=ch.length-1; i++)
        {
            for(int j=ch.length-1; j>=0; j--)
             {
            	// System.out.print(ch[i]) ;
                //System.exit(0);
            	 if(ch[i]!=ch[j])
                 {
                    System.out.println("NOT");
                    
                 }
            
             }
        }
      
           System.out.println("YES") ;
      
	}

}
