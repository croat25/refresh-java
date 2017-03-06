package linkedlist;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	
//		public static void main(String[] args){
//			Customer customer= new Customer("bruno",56.50);
//			Customer anothercustomer;
//			
//			anothercustomer=customer;
//			anothercustomer.setBalance(19.28);
//			System.out.println(anothercustomer.getBalance());
//			
//			
//			ArrayList<Integer> inlist= new ArrayList<Integer>();
//			inlist.add(1);
//			inlist.add(2);
//			inlist.add(3);
//			inlist.add(4);
//		
//		for(int i=0;i<inlist.size();i++){
//				System.out.println(inlist.get(i));
//		}
//		}
	public static void main(String[] args){
		
		LinkedList<String> placetovisit = new LinkedList<String>();
		
		add( placetovisit ,"toronto");
		add( placetovisit ,"cambridge");
		add( placetovisit ,"oakville");
		add( placetovisit ,"waterloo");
		add( placetovisit ,"kitchener");;
		add( placetovisit ,"milton");
		add( placetovisit ,"burlington");
		
		printlist(placetovisit);
		
		placetovisit.remove(4);
		printlist(placetovisit);
		
		visit(placetovisit);
}


private static void printlist( LinkedList<String> list){
	
	//assign pointer
	Iterator<String> i= list.iterator();
	
	//while there is a next elemnt print it if not then end program
	while(i.hasNext()){
		System.out.println(i.next());
	}
	
	System.out.println("=====================================");
}
		
		
private static boolean add( LinkedList<String> list, String newcity){
	ListIterator<String> stringlist = list.listIterator();
	
	while(stringlist.hasNext()){
		
		int comp=stringlist.next().compareTo(newcity);
		if(comp ==0){
			//equal, do not add
			System.out.println("already added nweb");
			return false;
		}else if(comp>0){
			stringlist.previous();
			stringlist.add(newcity);
			return true;
			
		}else if(comp<0){
//			move to next city
		
		}
		
	}
	stringlist.add(newcity);
	return true;
}


private static void visit(LinkedList list){//linked list is passed in
	Scanner scanner = new Scanner(System.in);//setup scanner 
	boolean quit=false;//start flag
	boolean forward=true;
	ListIterator<String> listlit = list.listIterator();//initalize linkedlist pointer
	if(list.isEmpty()){ // check if empty if not print next value
	System.out.println("no cities in entry");
	}else{
		System.out.println(listlit.next());
		//move in 1 into the linked list^
		printmenu();
		
		
	}
	//start a looop inside this function to see the list 1 at a time!
	while(!quit){
		int action=scanner.nextInt();//set up scanner to take in ints
		scanner.nextLine();//scan next lin
		switch(action){//switch and case
		case 0:
			System.out.println("Holiday over");
			quit=true;
		case 1:
			if(!forward){
				if(listlit.hasNext()){
					listlit.next();
				}
				forward=true;
			}
			if(listlit.hasNext()){
			System.out.println("now visiting"+listlit.next());
			}else{
				System.out.println("reach the end of the list!");
			}
			break;
		case 2:
			if(forward){
				if(listlit.hasPrevious()){
					listlit.previous();
				}
				forward=false;
			}
			if(listlit.hasPrevious()){
				System.out.println("now visiting"+listlit.previous());
			}
			else{
				System.out.println("we are at start!");
			}
			
		}
		}
	
}
	
private static void printmenu(){
	System.out.println("avalable actions");
	System.out.println("Press");
	System.out.println("0-quit");
	System.out.println("1 to go forward");
	System.out.println("2 to go back");
}
}
