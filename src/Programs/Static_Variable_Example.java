package Programs;


public class Static_Variable_Example {
	int roll_no;
	String name;
	static String college_name="BSAITM";
	
	Static_Variable_Example(int r,String n)
	{
		roll_no=r;
	    name=n;
	}
	void display()
	{
		System.out.println(roll_no + "="+name+ "="+college_name);
	}
public static void main (String args[])
{
	Static_Variable_Example sve=new Static_Variable_Example(101,"Sultan");
	Static_Variable_Example sve1=new Static_Variable_Example(102,"Rathore");
	sve.display();
	sve1.display();
	
}
}
