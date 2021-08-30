package handling;

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
		obj.slicing();
		//obj.sformat();
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
}
