package listandarraylist;

import java.util.ArrayList;

public class Grocerylist {
		private ArrayList<String> list= new ArrayList<String>();
		
		public void addto(String item){
			list.add(item);
		}
		
		public void printto(){
			System.out.println("you have this many items in ur list: "+list.size());
			for(int i = 0 ; i<list.size();i++){
				System.out.println(list.get(i));
			}
		}
		public void removeto(int index){
			String deletethis=list.get(index);
			list.remove(index);
			System.out.print(" the item removed was: "+deletethis);
		}
		
		public String finditem(String searchitem){
			boolean exists=list.contains(searchitem);
			int position=list.indexOf(searchitem);
			if(position==-1){
				return null;
			}
			else{
				return list.get(position);
			}
		}
}
