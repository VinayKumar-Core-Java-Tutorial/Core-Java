package Data_Types_2;

/*1. Explanation about the data with example?
	*	Data is a collection of row facts which does not have a proper meaning.
		The main use of data is it will occupy less memory space and easy to maintain and we can do any operations on data.
			Example: Student data:
			Rno =23
			Avg = 97%

2.	What is an information with example?
	To providing a proper meaning to data is called information.
	Example: student 23 is passed with 97%.

3.	What is the purpose of data type?
	The main purpose of data type is to allocate a enough memory space for the input of the program in the main memory of the computer either by using static memory allocation (or) Dynamic memory allocation.
	And to represent type of variables as well to represent type of return types

4.	What are the different types of data types in java?
	In java the datatypes are class field into 2 types they are 
		1.	Primitive data types and
		2.	Non primitive datatypes
	The primitive data types include boolean, char, byte, short, int, long, float and double.
	The non-primitive data types include Classes, Interfaces, and Arrays.

5.	Explain about data types?
	In java every variable has a type, every expression has a type and all types are strictly defined. 
	All the assignments should be checked by the compiler for the type compatibility. 
	Hence java language considers as strongly typed language.
	Java is not considered as pure object-oriented programming language because several OOP features (like multiple inheritance, operator overloading) are not supported by java. 
	Even java contains non-object primitive datatypes.
	Except boolean and char all the remaining datatypes are signed datatypes i.e we can represent both +ve and –ve numbers. 
		Example:
		int a;
		a=10; //Valid
		a=10, 20, 30; //Not Valid

6.	Explanation about primitive data types?
	In Java language, primitive data types are the building blocks of data manipulation. 
	These are the most basic data types available in Java language.
	Java is a statically-typed programming language. 
	It means, all variables must be declared before its use. 
	That is why we need to declare variable's type and name.

7.	What are the problems in primitive data types?
	Primitive data types are those whose variables are allows us to store only single value.
	But they never allow us to store multiple values of the same data type or different data types.

8.	Write the list of primitive data types?
	There are 8 types of primitive data types: 
	o	boolean data type
	o	byte data type
	o	char data type
	o	short data type
	o	int data type
	o	long data type
	o	float data type
	o	double data type

9.	What are the different types of primitive data types?
	In java programming language we have 8 primitive data types which are classified into 4 categories they are
	1.	Integer category data types
	2.	Floating point category data types
	3.	Character category data types and 
	4.	Boolean category data types.

10.	What is the formula for calculating the range of the data type with example?
	The following formula will be used for calculating range of any data type.
		Example:
		Range of short data type = (2)16bits
					  =1to65536
					  = 0to 65535
					  = +32767.5 to -32767.5
				  =+32767 to -32768
*/
public class Data_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a  = 20;
		short b = 30;
		int c = 10;
		long d = 40l;
		float f = 1.2f;
		double e = 1.2;
		boolean g = true;
		char h = 'a';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}

}
