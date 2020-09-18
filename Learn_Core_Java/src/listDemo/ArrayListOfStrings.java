package listDemo;

import java.util.ArrayList;

public class ArrayListOfStrings {

	public static void main(String[] args) {
		
		//Initialize arraylist with arraylist reference
		ArrayList<String> arrlist = new ArrayList<String>();
		
		arrlist.add("D");
		
		arrlist.add("Selenium");
		
		arrlist.add("Appan");
		
		arrlist.add("Roy");
		
		for(String s:arrlist){
			
			System.out.println(s);
			
		}
		
		
	}

}
