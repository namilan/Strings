
public class Main {

	public static void main(String[] args) {
		// byte ( rare )
		// short ( rare )
		// int ( common )
		// long ( not as often )
		// float (rare)
		// double ( common )
		// char ( not as often )
		// boolean ( common )
		
		String myString = "This is a string";
		System.out.println("myString is equal to " + myString);
		myString = myString + ", and this is more.";
		System.out.println("myString is equal to " + myString);
		myString = myString + " \u00A9 2019";
		System.out.println("myString is equal to " + myString);
		String numberString = "250.55";
		numberString = numberString + " 49.95";
		System.out.println(numberString);
		

	}

}
