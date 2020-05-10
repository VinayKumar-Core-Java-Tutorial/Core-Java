package identifiers;

/*Introduction of an identifiers.
1.	Explain about an identifier?
	Any name in java programming language is called an identifiers
	It may be class name, method name, variable name and label name.
2.	What are the rules for an identifier?
	A java identifier is a sequence of characters, where each character may be a letter from a-z (or) 
	A-Z (or) 0-9 (or) “$” (currency symbol) (or) “–” (connecting punctuation) , if we are using any 
	other symbol we will get Compile time error “IllegalCharacter”. 
	Identifier should not be starts with digit. 
	There is no length limit for java identifiers, but it is not recommended to take more than 15 
	length. 
	Java Identifiers are case sensitive.
	Reserved words (or) keywords should not use as an identifier.
	Interfaces and classes are also should not use as an identifier.*/

public class Identifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			System.out.println("Vinay");
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("Hello");
		}catch(Exception e) {
			System.out.println("Hello");
		}
		

	}

}
