package listandarraylist;

import java.util.Scanner;

public class Main {

//	private static Scanner scan = new Scanner(System.in);
	
	private static Scanner scan= new Scanner(System.in);
	
	private static Grocerylist list= new Grocerylist();
//	public static int[] basedata= new int[10];
	//initlaize publicly a static list called basedata and make it to 10 elements
	public static void main(String[] args){
//		System.out.println("enter in 10 integers");
//		getinput();
//		printarray(basedata);
//		resizearray();
//		System.out.println("enter in 12 integers!");
//		getinput();
//		printarray(basedata);
		boolean quit=false;
		int choice = 0;
		printinstructions();
		while(!quit){
			System.out.println("enter in an option");
			choice=scan.nextInt();
			scan.nextLine();
			
			switch(choice){
			case 0:
				quit=true;
				break;
			case 1:
				list.printto();
				break;
			case 2:
				System.out.println("enter in a String to ad to list: ");
				String add=scan.next();
				list.addto(add);
				break;
			case 3:
				System.out.println("enter in a String to find it");
				String find=scan.next();
				System.out.print(list.finditem(find));
				break;
			case 4:
				int remove=scan.nextInt();
				list.removeto(remove);
				break;
			default:
				printinstructions();
				break;
				
			
				
			}
		}
		
		
		
		
		
	}
	public static void printinstructions(){
		System.out.println("enter in 0 to quit");
		System.out.println("enter in 1 to print list");
		System.out.println("enter in 2 to add to list");
		System.out.println("enter in 3 to find");
		System.out.println("enter in 4 to remove");
}
//	private static void getinput(){
//		for(int i=0;i<basedata.length;i++){
//			basedata[i]=scan.nextInt();
//		}
//	}
//	private static void printarray(int[] array){
//		for(int i=0;i<array.length;i++){
//			System.out.println(array[i]);
//		}
//	}
//	
//	public static void resizearray(){
//		int[] original=basedata;
//		basedata= new int[12];
//		for(int i =0;i<original.length;i++){
//			basedata[i]=original[i];
//		}
//	}
	
	
	
}
