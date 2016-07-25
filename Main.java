import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	public static void main(String[] args) {
		int i=0;
		String str = "pqr"; //ct
		String str1 = "pqr" + ""; //ct
		
		
		System.out.print(++i + " "); 
		System.out.println( str == str1); //rt
		System.out.print(++i + " ");  
		System.out.println( str.equals(str1)); //rt

		str = "abc"; //ct
		System.out.print(++i + " "); 
		System.out.println( str == str1); //rt
		
		str1 = new String("abc"); //rt
		
		
		
		System.out.print(++i + " "); 
		System.out.println( str == str1); //rt
		System.out.print(++i + " " ); 
		System.out.println(str.equals(str1) );//rt
		System.out.print(++i + " ");
		System.out.println( str == str1.intern());
		
		
		System.out.println("Concatenation of string literals and string objects");
		String str2 ="pqr"; // compile time
		String str3 = str2 + "" ; // runtime expression
		System.out.print(++i + " ");
		System.out.println(str2==str3);
		System.out.print(++i + " ");
		System.out.println(str2.equals(str3));
		
		String str4 = "p" +"qr";
		System.out.print(++i + " ");
		System.out.println(str2==str4);
		
		
	}

}
