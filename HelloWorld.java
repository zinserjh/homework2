
public class HelloWorld {
	public static boolean isHelloWorld( String in )   {
		String check = in.toLowerCase();
		if (check.equals("hello world")) {
			return true;
		}
		return false;
	}
	
}