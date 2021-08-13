package practice;

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
	
	
}
