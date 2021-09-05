package practice;

import java.util.LinkedList;

public class DataHandling {
	int gb;
	String bc;
	short tz;
	
	public static void main(String[] args) {
		int a = 10;
		int b = a;
		
		Integer c = 39;
		
			
		//System.out.println(b);
		a = 20;
		
		//System.out.println(b);
		
		String x = "hi";
		String y = x;
		
		x = c.toString();
//		System.out.println(y);
//		System.out.println(x);
		
		LinkedList<Integer> abc = new LinkedList<>();
		
		abc.offer(c);
		
		//System.out.println(abc.pollLast());
		
		new DataHandling(1, "name?", (short)1).copyPrinter();
		
	}
	
	DataHandling(int gb, String bc, short tz){
		this.gb = gb;
		this.bc = bc;
		this.tz = tz;
	}
	public void copyPrinter() {
		printer();
	}
	
	public void printer() {
		System.out.println("printer method" + gb + bc + tz);
	}
}
