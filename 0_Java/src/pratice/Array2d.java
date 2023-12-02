package pratice;

public class Array2d{
	public static void main(String [] args)
	{
//		Initialization of 2d-Array
		int array[][] = new int[2][3];
		
		System.out.println(array.length+" "+array[0].length);
		
//		For loop to iterate the 2d-ARRAY
		for(int i=0;i<array.length;i++) {
			for(int j=0; j<array[0].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		
//		For each loop to iterate the 2d-ARRAY
		for(int a[]: array)
		{
			for(int b:a)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}