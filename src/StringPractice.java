
public class StringPractice {

	public static void main(String[] args) {
		//String h1 = "Hello";
		//System.out.println(h1.charAt(0));
		
		//System.out.println(h1.concat(" World"));

		String test = "Running";
		
		
		if (test.equalsIgnoreCase("running")) {
			System.out.println("This string is equal");
			System.out.println(test.length());
			System.out.println(test.replace('u', 'o'));
		} else {
			System.out.println("This string is not equal");
		}
	}
	

}
