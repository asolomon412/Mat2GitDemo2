
public class MethodExtraction {

	public static void main(String[] args) {
		calcAgeInDays();
		methodTest();
		
		
		
	}

	public static void methodTest() {
		int age = 23;
		System.out.println(age * 365);
	}

	public static int calcAgeInDays() {
		int age = 23;
		age = age * 365;
		return age;
	}

}
