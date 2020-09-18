package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBasics {

	public static void main(String[] args) {
		
		ArrayList arrlist = new ArrayList();
		
		arrlist.add(8264738);
		
		arrlist.add("D");
		
		arrlist.add(34.67);
		
		arrlist.add("Appan");
		
		arrlist.add("Roy");
		
		int listSize = arrlist.size();
		
		//Retrieve list objects - Method 1
		for(int i = 0; i < listSize; i++){
			
			System.out.println("Values from array list is "+arrlist.get(i));
			
		}
		
		//Retrieve list objects - Method 2
		for(Object i:arrlist){
			
			System.out.println("Values from array list is "+i);
			
		}
		
		//Retrieve list objects - Method 3
		Iterator itr = arrlist.iterator();
		while(itr.hasNext()){
			
			Object value = itr.next();
			
			System.out.println("Values from array list is "+value);
			
		}


	}

}
