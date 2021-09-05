package handling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shandling {

	public static void main(String[] args) {
		Shandling obj = new Shandling();
		// creating string literal
		String abc = "abc";
		// creating string object
		String xyz = new String("xyz");
		
		//obj.getChar(0);
		//obj.compare();
		//obj.equality();
		//obj.rplc();
		//obj.slicing();
		//obj.sformat();
		//obj.removeVowel();
		//obj.formatAddress();
		//obj.shuffleString();
		//obj.checkComparison();
		obj.addFix();
	}
	
	// Get character of a string at given index
	public void getChar(int i) {
		String sample = "Java Exercises!";
		// method : charAt()
		System.out.println("Character at "+ i +" is "+ sample.charAt(i));
	}
	
	public void compare() {
		String a = "This is a string literal";
		String b = "This is a string literal 2";
		
		String c = new String("this is it");
		String d = new String("this is it");
		
		// Compares based on the ascii or unicode value of the string
		System.out.println(a.compareTo(b));
		System.out.println(c.compareTo(d));
	}
	
	public void equality() {
		String a = new String("a");
		String b = new String("a");
		
		//if (a.equals(b)) {
		if(a == b) {
			System.out.println("equal");
		}else {
			System.out.println("nein");
		}
	}
	
	// replaceAll replaces a string, replace() replaces a character
	public void rplc() {
		String a = "This is home";
		String b = a.replaceAll("home", "not home");
		
		System.out.println(b);
		
		String c = a.replace('h', 't');
		
		System.out.println(c);
	}
	
	// works similar to python, just use substring() method with same concpet of indices
	public void slicing() {
		String pc = "Substring practice";
		
		String a = pc.substring(0,8);
		System.out.println(a);
		
		String b = pc.substring(pc.length()-4);
		System.out.println(b);
		
		// single index specifies starting point to the end
		String c = pc.substring(2);
		System.out.println(c);
	}
	
	// add values to a string 
	public void sformat() {
		String b = "input";
		
		/* Use format specifiers like %s for string
		 * %f for float
		 * %x for integer etc
		 * */
		String d = String.format("Hello, this is the %s", 3);
		
		System.out.println(d);
	}
	
	// remove vowels from a string
	public void removeVowel() {
		String input = "This is a string";
		
		ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));
		
		ArrayList<Character> result = new ArrayList<Character>();
		
		for (char i : input.toCharArray()) {
			if (!vowels.contains(i)) {
				result.add(i);
			}
		}
		
		System.out.println(result.toString());
	}
	
	// change . to [.] of a ipv4 address
	public void formatAddress() {
		String address = "1.1.1.1";
		
		String result = address.replace(".", "[.]");
		System.out.println(result);
	}
	
	// for the given sequence of indices, change the string sequence
	public void shuffleString() {
		String input = "codeleet";
		int[] indices = {4,5,6,7,0,1,2,3};
		
		char[] result = new char[input.length()];
		
		if (input.length() == indices.length) {
			for (int i=0; i<indices.length; i++) {
				result[indices[i]] = input.toCharArray()[i];
			}
		}
		
		System.out.println(String.valueOf(result));
	}
	
	// compare string
	public void checkComparison() {
		String jewels = "aA";
		String stones = "aAAbbbb";
		
		int counter = 0;
		
		for (char x : stones.toCharArray()) {
			if (jewels.indexOf(x) >= 0 ) {
				counter++;
			}
		}
		
		System.out.println(counter);
	}
	
	// postfix and prefix
	public void addFix() {
		int a = 0;
		int b = 0;
		
		for (int i = 0; i<3; i++) {
			System.out.println("a " + a++); // adds 1 to a and returns old value
			System.out.println("b " + ++b); // adds 1 to b and returns the added value
		}
	}
	
	// unable to eat lunch
}
