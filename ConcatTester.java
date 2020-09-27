
public class ConcatTester {

	public static void main(String[] args) {
		String animal1 = "quick brown fox";
		String animal2 = "lazy dog";
		String article = "the";
		String action = "jumps over";
		
		
		String answer = article.concat(animal1).concat(action).concat(animal2);
		int num1 = answer.length();
		System.out.println(answer);
		System.out.print(num1);
	}
}
