package basicCalculations;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArray = {6, 8, 1, 4};

		for (int i = 1; i < myArray.length; i++) {
			int key = myArray[i];
			int j = i - 1;
			
			while (j >= 0 && myArray[j] < key) {
				myArray[j + 1] = myArray[j];
				j--;
			}
				myArray[j + 1] = key;
			}

		
	}

}
