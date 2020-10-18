package methodpractice;

/*
 * package name : all lower case
 * class name: Starts with UpperCase and then goes as CamelCase
 * variable and methods name : starts with lower case and goes as CamelCase
 * Constructor name : same name as class name --> starts with Uppercase and then 
 */

public class TypeOfMethods {

	public static void main(String[] args) {
		
		MyName();
		String dataFromMethod =  getName();
		System.out.println(dataFromMethod);
		
		int MayasAge = getAge();
		System.out.println(MayasAge);
		
		TypeOfMethods typeOfMethod = new TypeOfMethods();
		
		typeOfMethod.MyAge ();
		
		
		System.out.println(isItSunny());
	}
	
	
	/*
	 * static & non static methods
	 * void methods and return type methods
	 */
	
	
	public static void MyName () {               // static method
		System.out.println("Mayas");
	}
	
	public  void MyAge () {                      // non static method
		System.out.println("2");
	}
	
	public static int getAge () {                /// static return method
		return 30; 
	}

	public static String getName () {            /// non static return method
		return "Yanis"; 
	}
	
	public static Boolean isItSunny () {
		return true;
	}

}
