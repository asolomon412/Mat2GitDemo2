
public class MethodEx {
	static int age;

	public static void main(String[] args) {

		printStuff();
		//int newAge = calcAgeInDays();
		System.out.println(calcAgeInDays());
		System.out.println(printLName());

	}

	public static void printStuff() {
		System.out.println("Hi we are printing stuff using a method");

	}

	public static int calcAgeInDays() {
		age = 23;
		age = age * 365;
		return age;
	}
	
	public static int printLName(){
		//String name = "Solomon";
		//age = 23;
		return 23;
	}

}
