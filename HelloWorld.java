
public class HelloWorld {
	public static boolean isHelloWorld( String in )   {
		String check = in.toLowerCase();
		if (check.equals("Hello World")) { //<- Fault here
			return true;
		}
		return false;
	}
	


	public static void main(String args[]){
		if (isHelloWorld("hello WORLD")) {
			System.out.print("Hello World!");
		}
	}
}