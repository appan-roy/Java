package listDemo;

import java.util.ArrayList;
import java.util.List;

public class ListOfStrings {

	public static void main(String[] args) {
		
		//Initialize list with arraylist reference. Arraylist implements lists.
		List<String> arrlist = new ArrayList<String>();
		
		arrlist.add("D");
		
		arrlist.add("Selenium");
		
		arrlist.add("Appan");
		
		arrlist.add("Roy");
		
		for(String s:arrlist){
			
			System.out.println(s);
			
		}
			
	}

}
