package Programs;



public class BubleSort {

	public static void sorting(int array[])
	{
		int n=array.length;
		int k;
		for (int m = n; m >= 0; m--)
		{
			for (int i = 0; i < n - 1; i++)
			{
				 k = i + 1;
				if (array[i]>array[k])
				{
					swapNumbers(i, k, array);
				}
			}
		}
	}
	private static void swapNumbers(int i, int j, int[] array) {
		  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
	private static void printNumbers(int[] input) 
	{
        
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 4, 2, 9, 6 };
		sorting(input);
		printNumbers(input);
	}

}
