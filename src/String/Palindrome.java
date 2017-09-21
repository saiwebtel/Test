package String;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		 
		String str="MADAM";
		String revstring="";
		 
		for(int i=str.length()-1;i>=0;--i){
		revstring +=str.charAt(i);
		}
		 
		System.out.println(revstring);
		 
		if(revstring.equalsIgnoreCase(str)){
		System.out.println("The string is Palindrome");
		}
		else{
		System.out.println("Not Palindrome");
		}
		
		//Alternate way
		{
			 
			Scanner in = new Scanner(System.in);
			 
			 System.out.println("Enter a string");
			 String str1=in.nextLine();
			 
			StringBuffer strone=new StringBuffer(str1);
			 StringBuffer strtwo=new StringBuffer(strone);
			 
			  strone.reverse();
			 
			System.out.println("Orginal String ="+strtwo);
			System.out.println("After Reverse ="+strone);
			 
			if(String.valueOf(strone).compareTo(String.valueOf(strtwo))==0)
			   System.out.println("Result:Palindrome");
			   else
			    System.out.println("Result:Not Palindrome");
			 
			   }
	}

}
