package collectionPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class ArList {
	public static void main (String [] args) {
		
		// declaration
		ArrayList<Integer> myList = new ArrayList<>();
		
		// add values  -- adds to the end of the list if index not specified
		myList.add(1);
		myList.add(2);
		myList.add(1,4);
		
		
		
		// retrieve value
		System.out.println(myList.get(1));
		
		// remove value at given index
		myList.remove(0);
		// remove value using object type of the arraylist
		myList.remove(Integer.valueOf(4));
		
		System.out.println();
		
		// clear list
		// myList.clear();
		
		// check if element exists
		if(myList.contains(8)) {
			System.out.println("contains 4");
		}else
		{
			System.out.println("doesn't contain specified number");
		}
		
		ArrayList<Integer> secondList = new ArrayList<>();
		secondList.add(9);
		secondList.add(10);
		secondList.add(11);
		
		// Add an iterable to the list
		myList.addAll(secondList);
		
		new ArList().printList(myList);
		
		ArrayList<Object> objList = new ArrayList<>();
		objList.add(1);
		objList.add("string too?");
		
		myList.set(1, 1000);
		
		new ArList().printList(objList);
		new ArList().printList(myList);
		
		new ArList().printList1(objList);
		
		// update index of the arrayList
		
	}
	
	
	// method to print items of an arraylist using generic type for the parameter
	public void printList(ArrayList<?> inputList) {
		// for loop with size property
		for(int i = 0; i<inputList.size(); i++) {
			System.out.println(inputList.get(i));
		}
	}
	
	
	// usage of iterator
	public void printList1(ArrayList<?> inputList) {
		
		// Iterator is an interface used through iterate through a collection with additional properties
		Iterator<?> it = inputList.iterator();
		
		while(it.hasNext() ) { // it specifies the current value of the iterator
			System.out.println("yes");
			it.next(); // goes to the next value of the iterator
		}
	}
}
