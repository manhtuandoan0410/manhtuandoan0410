package Week5;

public class ObjectsWordPairsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WordPair[] pairs = new WordPair[3];
		
		pairs[0] = new WordPair("school", "koulu");
		pairs [1] = new WordPair("student", "opiskelija");
		pairs [2] = new WordPair("textbook", "oppikirja");
		
		for (int i = 0; i < pairs.length; i++) {
			System.out.println(pairs[i]);
		}

	}

}
