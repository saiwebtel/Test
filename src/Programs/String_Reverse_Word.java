package Programs;

public class String_Reverse_Word {
	public static void main(String[] args) {
		  String s="Hello how r You";
		  String a[]=s.split(" "); 
		  for(int i=a.length-1; i>=0; i--)
	        {
	        	System.out.print(" "+a[i]);
	        }
	}
	}

