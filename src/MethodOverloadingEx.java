import java.util.Scanner;

public class MethodOverloadingEx {

	public static int calcAgeInDays() {
		int age = 23;
		age = age * 365;
		return age;
	}

	public static int calcAgeInDays(String name, int age) {
		System.out.println(name + " " + age);
		age = age * 365;
		return age;
	}
	public static int calcAgeInDays(int age, String name) {
		System.out.println(name + " " + age);
		age = age * 365;
		return age;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		int userAge = scan.nextInt();

		System.out.println("This is my first calc method call " + calcAgeInDays());
		System.out.println("This is from the overloaded method " + calcAgeInDays("Antonella", userAge));
		System.out.println("This is from the overloaded method 2 " + calcAgeInDays(userAge, "Brian"));
		scan.close();
	}

}
