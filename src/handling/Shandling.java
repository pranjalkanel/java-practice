package handling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		//obj.addFix();
		//obj.findPi();
		//obj.fibonacci();
		//obj.getLastLength();
		//obj.longContiguous();
		//obj.paranthesis();
		//obj.longSubString();
		//obj.arrangePos();
		//obj.reverseInt();
		//obj.twoSum();
		//obj.twoSumIndices();'
		//obj.maxSubArray();
		//System.out.println(Arrays.asList(obj.keyboardWord()) ); 
		//System.out.println(Arrays.asList(obj.favRestaurant1()));
//		obj.decodeMorseLaw();
		//obj.shortestToChar();
		obj.searchInsert();
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
	
	// reverse integer
	public void reverseInteger() {
		int a = 10;
		
		if (a< Integer.MAX_VALUE && a > Integer.MIN_VALUE ) {
			
			int remainder = 0;
			while(remainder != a) {
				
			}
		}else {
			System.out.println(0);
		}
	}
	
	// find pi to nth decimal
	public void findPi() {
		
		double n = 10.0;		
		double pi = 22.0/7;
		
//		System.out.println(pi);
//		System.out.println(Math.pow(10, n));
		
		int roundOff = (int) (pi * (Math.pow(10.0, n)));
		
		//System.out.println(roundOff);
		
		double result = (double) roundOff;
		//System.out.println(result);
		result = result / Math.pow(10.0, n);
		
		System.out.println(result);
	}
	
	//fibonacci sequence upto n
	public void fibonacci() {
		int n = 10;
		int[] result = new int[n];
		result[0] = 0;
		result[1] = 1;
		for (int i = 2; i<n;i++) {
			result[i] = result[i-1] + result[i-2];
		}
		
		System.out.println(Arrays.toString(result));
	}
	
	// get length of last word of a string separated by spaces
	public void getLastLength() {
		String abc = "   fly me   to   the moon  ";
		String[] process = abc.split(" ");
		
		String result = process[process.length-1].strip();
		
		System.out.println("The last word is "+ result +" with length of " + result.length());
	}
	
	//  longest contiguous segment
	public void longContiguous() {
		int onMax = 0;
		int offMax = 0;
		
		int onCounter = 0;
		int offCounter = 0;
		
		String binary = "100011111";
		char[] binaryArray = binary.toCharArray();
		
		for (int i =0; i<binaryArray.length;i++) {
			if(binaryArray[i] =='1') {
				offCounter = 0;
				onCounter++;
				onMax = Math.max(onMax, onCounter);
			}else {
				onCounter = 0;
				offCounter++;
				offMax = Math.max(offMax, offCounter);
			}
		}
		
		if (onMax > offMax) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	// longest substring without repitition
	public void longSubString() {
		HashSet<Character> result = new HashSet<Character>();
		HashSet<Character> tmp = new HashSet<Character>();
		
		String s = "fksdjflsdfpppsdfkjjf";
		char[] sarr = s.toCharArray();
		
		for (int i=0; i<sarr.length;i++) {
			int j = i;
			while (j < sarr.length) {
				if(!tmp.contains(Character.valueOf(sarr[j]))) {
					tmp.add(sarr[j]);
					j++;
				}else {
					break;
				}
				
			}
			if(result.size()<tmp.size()) {
				result = new HashSet<>(tmp);
			}
			tmp.clear();
		}
		
		System.out.println(result.size());
	}
	
	// arrange even number at even index and odd number at odd index
	public void arrangePos() {
		int[] inputArr = {10, 9, 7, 18, 13, 19, 4, 20, 21, 14};
		
		int oddIndex = 1;
		int evenIndex = 0;
		
		while(true) {
			while(evenIndex < inputArr.length && inputArr[evenIndex]%2 == 0) {
				evenIndex = evenIndex + 2;
			}
			while(oddIndex < inputArr.length && inputArr[oddIndex]%2 == 1  ) {
				oddIndex = oddIndex +2 ;
			}
			
			if(oddIndex < inputArr.length && evenIndex < inputArr.length ) {
				int tmp = inputArr[evenIndex];
				inputArr[evenIndex] = inputArr[oddIndex];
				inputArr[oddIndex] = tmp;
			}else {
				break;
			}
		}
		
		for(int x :inputArr ) {
			System.out.println(x);
		}
	}
	
	// add two numbers
//	public void addNodeNumber() {
//		List<Integer> l1 = new LinkedList<Integer>(Arrays.asList(2,4,3));
//		List<Integer> l2 = new LinkedList<Integer>(Arrays.asList(5,6,4));
//		
//		List<Integer> result = new LinkedList<Integer>();
//		
//		for(int i =0; i<l1.size()) {
//			
//		}
//	}
	
	// reverse an integer
	public void reverseInt() {
		int x = -426;
		long result = 0;
		
		while(x != 0) {
			result = (result * 10) + (x % 10);
			x = x/10;
		}
		
		System.out.println((int) result);
	}
	
	// Two sum leetcode (printing actual values present in list)
	public void twoSum() {
		int[] nums = {2,7,11,15};
		int target = 9;
		
		int[] result = new int[2];
		
		for(int a: nums ) {
			if(a <= target) {
				if(Arrays.stream(nums).anyMatch(i -> i == target-a)) {
					result[0] = a;
					result[1] = target - a;
					break;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(result));
	}	
	
	// Two sum leetcode (printing indices of the values present in list)
	public void twoSumIndices() {
		int[] nums = {-3,7,12,15};
		int target = 9;
		
		/*
		 * Check if target - current value is in hashmap or not
		 * if not, add the current value and its index to the hashmap*/
		
		
		Map<Integer,Integer> container = new HashMap<Integer,Integer>();
		
		int[] result = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			Integer val2 = container.get(target - nums[i]);
			
			if(val2 != null) {
				result[0] = val2;
				result[1] = i;
				break;
			}else {
				container.put(nums[i], i);
			}
		}
		
		System.out.println(Arrays.toString(result));
	}
	
	// maximum subarray; sub array of an int array should return the maximum possible sum
	public void maxSubArray() {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		if(nums.length == 1) {
			System.out.println(nums[0]);
		}else {
			int startPoint = 0;
			int endPoint = startPoint + 1;
			
		}
	}
	
	
	// Words that can be typed with the same row in keyboard
	public String[] keyboardWord() {
		
		String[] rows = {"qwertyuiop","asdfghjkl","zxcvbnm"};
		
		String[] words = {"Hello","Alaska","Dad","Peace"};
		
		ArrayList<String> result = new ArrayList<String>();
		
		int rowChecker = -1;
		boolean rowTrue = true;
		
		for (int j = 0; j<words.length;j++) {
			
			for(int i=0; i< rows.length; i++) {
				if(rows[i].indexOf(words[j].toLowerCase().charAt(0)) > -1 ) {
					rowChecker = i;
				}
			}
			
			for (char l: words[j].toLowerCase().toCharArray()) {
				if(rows[rowChecker].indexOf(l) < 0) {
					rowTrue = !rowTrue;
					break;
				}
				
			}
			
			if(rowTrue) {
				result.add(words[j]);
			}
			rowChecker = -1;
			rowTrue = true;
		}
			
		return result.toArray(new String[0]);
	}
	
	// Minimum Index Sum of Two Lists
	public String[] favRestaurant() {
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2 = {"KFC","Shogun","Burger King"};
		
		
		Set<String> compareSet;
		String[] compareArray;
		String[] biggerArray;
		
		Map<String, Integer> buffer = new HashMap<String, Integer>();
		
		ArrayList<String> result = new ArrayList<String>();
		
		
		
		if(list1.length <= list2.length) {
			compareArray = list1;
			biggerArray = list2;
			compareSet = new HashSet<String>(Arrays.asList(list2));
		}else {
			compareArray= list2;
			biggerArray = list1;
			compareSet =  new HashSet<String>(Arrays.asList(list1));
		}
		
		for(int i = 0; i< compareArray.length;i++) {
			if (compareSet.contains(compareArray[i])) {
				buffer.put(compareArray[i], i+ Arrays.asList(biggerArray).indexOf(compareArray[i]));
			}
		}
		
		int min = Collections.min(buffer.values());
		
		buffer.forEach((key, value) -> {
			if(value == min) {
				result.add(key);
			}
		});
		
		return result.toArray(new String[0]);
	}
	
	public String[] favRestaurant1() {
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2 = {"KFC","Shogun","Burger King"};
		
		
		Set<String> compareSet = new HashSet<String>(Arrays.asList(list2));
		
		
		Map<String, Integer> buffer = new HashMap<String, Integer>();
		
		List<String> result = new LinkedList<String>();
		
		
		for(int i = 0; i< list1.length;i++) {
			if (compareSet.contains(list1[i])) {
				buffer.put(list1[i], i+ Arrays.asList(list2).indexOf(list1[i]));
			}
		}
		
		int min = Collections.min(buffer.values());
		
		buffer.forEach((key, value) -> {
			if(value == min) {
				result.add(key);
			}
		});
		
		return result.toArray(new String[0]);
		
	}
	
	//decode morse code
	public void decodeMorseLaw() {
		String [] words = {"gin","zen","gig","msg"};
		
		String[] morseLetters = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		
		Set<String> result = new HashSet<String>();
		
		for(String word : words) {
			String transformation = "";
			for(char a : word.toCharArray()) {
				transformation = transformation.concat(morseLetters[alphabets.indexOf(a)]);
			}
			result.add(transformation);
			transformation = "";
		}
		
		System.out.println(result.size());
	}
	
	//closes occurence of character
	public void shortestToChar() {
		String s = "loveleetcode";
		char c = 'e';
		
		List<Integer> indexOfChar = new ArrayList<Integer>();
		int[] result = new int[s.length()];
		
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i) == c) {
				indexOfChar.add(i);
			}
		}
		System.out.println(indexOfChar);
		
		for (int i = 0; i < s.length();i++) {
			if(s.charAt(i) == c) {
				result[i] = 0;
			}else {
				int min = Integer.MAX_VALUE;
				for(Integer x: indexOfChar) {
					min = Math.min(Math.abs(x-i), min);
				}
				result[i] = min;
			}
		}
		
		Arrays.stream(result).forEach(System.out::print);
	}
	
	//unique email address
	public void validEmail() {
		
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		
		Set<String> normalized = new HashSet<>(); // used to save simplified email address, cost O(n) sapce.
        for (String email : emails) {
            String[] parts = email.split("@"); // split into local and domain parts.
            String[] local = parts[0].split("\\+"); // split local by '+'.
            normalized.add(local[0].replace(".", "") + "@" + parts[1]); // remove all '.', and concatenate '@' and domain.        
        }
        
        Arrays.stream(emails).forEach(System.out::println);
	}
	
	// search insert position
	public void searchInsert() {
		int[] nums = {1,3,5,6};
		int target = 5;
		
		int left = 0, right = nums.length-1; // implementation of binary search
		
		while(left <= right) {
			int mid = (left+right)/2;
			
			if(nums[mid] == target) System.out.println(mid); 
			else if (nums[mid] > target) right = mid -1;
			else left = mid +1;
		}
		
		System.out.println(left);
	}
}
