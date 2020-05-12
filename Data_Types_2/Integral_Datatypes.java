package Data_Types_2;

/*12.	What is the basic aim of integer category data types?
 		The basic aim of the integer category data types is to store integer data in the main memory of the computer by allocating sufficient amount of memory space.

13.	Explain about integer category data types with example?
	Integer category contains 4 data types and they are given in the following table.
		Sr/no	Data type	Size in byte	Range
		1	byte	1	+127 to -128
		2	short	2	+32767 to -32768
		3	int   	4	+x to-(x+1)
		4	long	8	+y to –(y+1)*/

public class Integral_Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 14. Explain about byte data type? 
		 * 	    The byte data type is an example of primitive data type. 
		 * 		It is an 8-bit signed two's complement integer. 
		 * 		Its value-range lies between -128 to 127 (inclusive). 
		 * 		Its minimum value is -128 and maximum value is 127.  Its default value is 0.
		 * 		The byte data type is used to save memory in large arrays where the memory savings is most required. 
		 * 		It saves space because a byte is 4 times smaller than an integer.
		 * 		It can also be used in place of "int" data type. 
		 * 		Example: byte a = 10, 
		 * 				 byte b = -20 
		 * 				 byte b = 130; (C.E: possible loss of precision) 
		 * 				 byte b = true; (C.E:Incompatible types found: Boolean required: byte)
		 *  	byte data type is best suitable if we are handling data either from file or form network.
		 * 
		 */		
		byte a  = 20;
		
		System.out.println(a);

		/*
		 * 15. Explain about short data type? 
		 * 		The short data type is a 16-bit signed two's complement integer. 
		 * 		Its value-range lies between -32,768 to 32,767(inclusive). 
		 * 		Its minimum value is -32,768 and maximum value is 32,767. 
		 * 		Its default value is 0. 
		 * 		The short data type can also be used to save memory just like byte data type. 
		 * 		A short data type is 2 times smaller than an integer. 
		 * 		Examples: short s = 10; 
		 * 				  short s = 32767; 
		 * 				  short s = 65535;(C.E:possible loss of precision) 
		 * 				  short s = true; (C.E: Incompatible types) 
		 * 		short is best suitable data type for 16-bit process. 
		 * 		But currently these are completely outdated and hence the corresponding data types also no one is using.
		 */
		short b = 30;
		
		System.out.println(b);
		/*
		 * 16. Explain about int data type? 
		 * 		The int data type is a 32-bit signed two's complement integer. 
		 * 		Its value-range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive). 
		 *		Its minimum value is - 2,147,483,648and maximum value is 2,147,483,647. 
		 * 		Its default value is 0. 
		 * 		The int data type is generally used as a default data type for integral
		 * 		values unless if there is no problem about memory. 
		 * 		Example: int a = 100000,
		 * 				 int b = -200000 
		 * 		The most commonly used datatype is int. 
		 * 		The size of int is always fixed irrespective of platform hence the chance of failing java
		 * 		program is very less if u r changing the platform hence the java is
		 * 		considered as Robust.
		 */
		int c = 10;
		
		System.out.println(c);
		/*
		 * 17. Explain about long data type? 
		 * 		The long data type is a 64-bit two's complement integer. 
		 * 		Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 
		 * 		9,223,372,036,854,775,807(2^63-1)(inclusive). 
		 * 		Its minimum value is - 9,223,372,036,854,775,808and maximum
		 * 		value is 9,223,372,036,854,775,807. 
		 * 		Its default value is 0.  The long data type is used when you need a range of values more than those provided by int.
		 * 		Example: long a = 100000L, 
		 * 				 long b = -200000L 
		 * 		The amount of distance traveled by light in 1000days can be represented by long datatype only and
		 * 		int is not enough.  If int is not enough to hold big values then we should
		 * 		go for long-datatype
		 */
		long d = 40l;
		
		System.out.println(d);

	}

}
