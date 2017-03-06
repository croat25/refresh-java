package listandarraylist;

import java.util.ArrayList;

public class Phone {
		private ArrayList<String> list = new ArrayList<String>();
		
		public void add(String item){
			list.add(item);
			
		}
		public void print(){
			System.out.println("you have this many items in ur list: "+list.size());
			for(int i = 0 ; i<list.size();i++){
				System.out.println(list.get(i));
			}
		}
		public void modify(int index,String newitem){
			
			
			list.set(index,newitem);
			
		}
		public void remove( int index){
			String deletethis=list.get(index);
			list.remove(index);
			System.out.print(" the item removed was: "+deletethis);
		
		}
		public String search(String searchitem){
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
