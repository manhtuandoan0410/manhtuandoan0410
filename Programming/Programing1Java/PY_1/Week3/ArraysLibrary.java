package Week3;

public class ArraysLibrary {

		// max value
	public static int max(int[] arr) {
		int maximum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maximum) {
				maximum = arr[i];
			}
		}

		return maximum;
	}

	// min value
	public static int min(int[] arr) {
		int minimum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minimum) {
				minimum = arr[i];
			}
		}

		return minimum;

	}

	// mean value, average value
	public static double mean(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (double) sum / arr.length;
	}

	// median value, middle value after sorting arrays
	public static double median(int[] arr) {
		
		//create a clone array to do the sort without affecting the original
		int[] sorted = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sorted[i] = arr[i];
		}
		
		//selection sort the clone
		for (int i = 0; i < sorted.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < sorted.length; j++) {
				if (sorted[j] < sorted[minIndex]) {
					minIndex = j;
				}
			}
			
			// swap min to position i
			int temp = sorted[minIndex];
			sorted[minIndex] = sorted[i];
			sorted[i] = temp;
		}
			
			
		//middle value
		int n = sorted.length;
		if (n % 2 == 0) {
			return (sorted[n/ 2 - 1] + sorted[n/2]) /2.0;
		} else {
			return sorted [ n/2];
		}
		
	}
	
	// returns standard deviation
	public static double standardDeviation(int[] arr) {
		double meanVal = mean(arr);
		double sumSquaredDiff = 0;
		for (int i = 0; i < arr.length; i++) {
			sumSquaredDiff += Math.pow(arr[i] - meanVal, 2);
		}
		
		//sample stad dev: divide by (n-1)
		double variance = sumSquaredDiff / (arr.length - 1);
		return Math.sqrt(variance);
	}

}
