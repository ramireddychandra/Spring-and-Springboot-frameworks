package pratice;

public class JaggedArray {
	public static void main(String[] args)
	{
		// Jagged Array - we know the rows and dont know the columns;
		int array[][] = new int[4][];
		array[0] = new int[5];
		array[1] = new int[4];
		array[2] = new int[5];
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=0; j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
//		Output
//		0 0 0 0 0 
//		0 0 0 0 
//		0 0 0 0 0 
		
	}
}
