package array;

import java.util.Scanner;

public class Main {

	private static Scanner scanner= new Scanner(System.in);
	
	public static void main (String[] args){
		//how to initialize an array of integers
//		int[] intarray= new int[10];
//		
//		intarray[5]=10;
//		
//		double[] doublearray = new double[10];
//		doublearray[5]=10;
//		
//		
//		int[] array={1,2,3,4,5,6,7,8,9,0};
//		System.out.println(intarray[5]);
//		System.out.println(doublearray[5]);
//		for ( int i =0;i<array.length;i++){
//			System.out.print(array[i]+" ");
//		}
		
		int[] array=getint(5);
		for(int j=0;j<array.length;j++){
			System.out.println(array[j]);
		}
		System.out.print(getavg(array));
		
		int[] newarray=getint(5);
		BubbleSort(newarray);
		for(int j=0;j<array.length;j++){
			System.out.println(newarray[j]);
		}	
	
	}
	
	public static void BubbleSort( int [ ] num )
	{
	     int j;
	     boolean flag = true;   // set flag to true to begin first pass
	     int temp;   //holding variable

	     while ( flag )
	     {
	            flag= false;    //set flag to false awaiting a possible swap
	            for( j=0;  j < num.length -1;  j++ )
	            {
	                   if ( num[ j ] < num[j+1] )   // change to > for ascending sort
	                   {
	                           temp = num[ j ];                //swap elements
	                           num[ j ] = num[ j+1 ];
	                           num[ j+1 ] = temp;
	                          flag = true;              //shows a swap occurred  
	                  } 
	            } 
	      } 
	} 
	
	//how do determine if u are returning an array use the int[] then give functiona a name
	//							parameters passed into function
	public static int[] getint(int n){
		int[] vals= new int[n];
		for(int i = 0;i<n;i++){
			System.out.print(" enter in a value: ");
			vals[i]=scanner.nextInt();
		}
		return vals;
	}
	
	public static double getavg(int[] array){
		 int add=0;
		 double total;
		 for(int i=0;i<array.length;i++){
			 add+=array[i];
			 
		 }
		  return total=add/array.length;
		
	}
}
