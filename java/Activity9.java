package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myList =new ArrayList<String>();
		myList.add("Sukanya");
		myList.add("Praveen");
		myList.add("Nitya");
		myList.add("Namish");
		myList.add("guest");
		
		for(String str :myList) {
			System.out.println(str);
		}
		
		System.out.println("Name Sukanya presence is "+myList.contains("Sukanya"));
		System.out.println("The number of elements in the list is "+myList.size());
		myList.remove("guest");
		System.out.println("The number of elements in the list is "+myList.size());
		

	}

}