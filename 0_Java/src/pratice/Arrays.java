package pratice;

public class Arrays
{
	public static void main(String [] args) {
//		 Value 6 is size of array and its manditory;
//		initialixation of array
//		By default value will be "0" stored if we didnt assign
//		Method 1 when we know the array side
		
		
		int a[] = new int[6]; 
		
		
//		If you try to print an arrray it will give address of array :- [I@e580929
		System.out.println(a);  // [I@e580929
		
		a[0] =5;
		a[2] =10;
		
//		Iterating the Array
		for(int i : a)
		{
		System.out.println(i); // 5 0 10 0 0 0
		}
		
//		Method -2
		
		int b[] = {1,2,3,4};
		System.out.println(b);
		for(int i : b)
		{
		System.out.println(i); // 1 2 3 4
		}
		
//		Method-3
		int c[];
		c = new int[5];
		
//		Method-4
		int []d;
		d=new int[4];
		
		
	}
	
}