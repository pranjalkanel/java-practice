package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic {
	
	// print t for true, print f for false from a 2d array
	public void conditionalChecker(boolean[][] array) {
		for (boolean [] itemArray : array) {
			for (boolean item : itemArray ) {
				if (item) {
					System.out.println("t");
				}else {
					System.out.println('f');
				}
			}
		}
	}
	
	
	// check if first and second numbers are 0 and 1
	public void checkNumbers(int a, int b) {
		if (a == 0 && b == 1) {
			System.out.print("true");
		}else {
			System.out.print("false");
		}
	}
	
	// change rows and columns of a 2D array
	public void changeRows(int[][] inputArray) {
		int counter = 0 ;
		int[][] result = new int[inputArray[0].length][inputArray.length];
		
		while (counter < inputArray.length) {
			for (int i = 0; i < inputArray.length; i++) {
				for (int j = 0; j < inputArray[i].length; j++){
					result[j][i] = inputArray[i][j];
				}
			}
			counter++;
		}
		
		for (int a = 0; a < result.length;a++) {
			for (int b = 0; b < result[a].length; b++) {
				System.out.print(result[a][b]);
			}
			System.out.println("");
		}
	}
	
	// k largest numbers of an array 
//	public void largeArray(int[] array, int i, int j) {
//		int counter = i;
//		
//		while ()
//		
//	}
	
	public void replaceString() {
		String abc = "It is what it is";
		
		String newString = abc.replace("i","p");
		
		System.out.print(newString);
	}
	
	public void getCharList() {
		
		List<Character> newList = new ArrayList<>();
		
		String something = "Hi, my name is";
		for (char i : something.toCharArray()){
			newList.add(i);
		}
		
	}
	
	
	// Approach to add even number at even index and odd number at odd index
//	public void arrangeArray() {
//		int arr[] = {3, 6, 12, 1, 5, 8};
//		List<Integer> evenList = new ArrayList<>();
//		List<Integer> oddList = new ArrayList<>();
//		
//		for (int i : arr) {
//			if (i%2 != 0) {
//				oddList.add(i);
//			}else {
//				evenList.add(i);
//			}
//		}
//		
//		for (int j=-2; j < evenList.size();j = j+2) {
//			if (!evenList.isEmpty()) {
//				arr[j+2] = evenList.get(j+2);
//			}
//		}
//		
//		for (int z=-1; z<oddList.size(); z = z+2) {
//			if(!oddList.isEmpty()) {
//				arr[z+2] = oddList.get(z+2);
//			}
//		}
//		
//		System.out.print(Arrays.toString(arr));
//	}
	
	// Arrange even number at even index and vice versa
	public void arrangeArrayRecursion(int[] inputArray, int evenCounter, int oddCounter) {
		int evenIndexNumber = inputArray[evenCounter];
		int oddIndexNumber = inputArray[oddCounter];
		
		int arrayLength = inputArray.length;
		
		if (evenIndexNumber%2 != 0 && oddIndexNumber%2 == 0) {
			inputArray[evenCounter] = oddIndexNumber;
			inputArray[oddCounter] = evenIndexNumber;
			evenCounter += 2;
			oddCounter += 2;
		}
		if (evenIndexNumber%2 != 0 && oddIndexNumber%2 != 0) {
			oddCounter +=2;
		}
		if (evenIndexNumber%2 == 0 && oddIndexNumber%2 == 0) {
			evenCounter +=2;
		}
		if (evenIndexNumber%2 == 0 && oddIndexNumber%2 != 0) {
			evenCounter += 2;
			oddCounter += 2;
		}
		
		
		if (evenCounter > arrayLength || oddCounter > arrayLength) {
			System.out.println(Arrays.toString(inputArray));
		}else {
			arrangeArrayRecursion(inputArray, evenCounter, oddCounter);
		}
	}
}
	
	
