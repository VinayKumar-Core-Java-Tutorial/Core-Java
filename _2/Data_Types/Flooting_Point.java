package _2.Data_Types;

public class Flooting_Point {
	/*
	 * 18. What is the basic aim of Decimal/Floating point category data types? 
	 * The basic aim of float category data types is to store real constant values π
	 * and etc in the main memory of the computer by allocating sufficient amount of
	 memory space. 
	 * 19. Explain about Decimal/float category data type?  Decimal
	 * category contains 2 types of data types they are given in the following table
	 * Data type Size (in bytes) Range          Number of Decimal places
	 * Float      4              +x to –(x+1)          7 
	 * Double     8              +y to –(y+1)          15
	 * In some books numbers of decimal places are
	 * given 8 and 16 for float and double which are including dot (.) but in the
	 * above table we are showing excluding the dot(.).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 20. Explain about Float data type with example? 
		 * The float data type is a single-precision 32-bit IEEE 754 floating point. 
		 * Its value range is unlimited. 
		 * It is recommended to use a float (instead of double) if you need
		 * to save memory in large arrays of floating point numbers. 
		 * The float data type should never be used for precise values, such as currency. 
		 * Its default value is 0.0F. 
		 * If we store any real constant values in a variable of float
		 * data type then such real constant value stored in the main memory in such a
		 * way that after the dot(.) It takes 7 decimal places. 
		 * And the real constant value must be followed by a letter ‘f’ otherwise we get compile time error. 
		 * The following calculations shows (IEEE 754: floating point calculation) how
		 * real constant values stored in the main memory in bit representation of float
		 * data type. Example: float f1 =3.4f;
		 */

		float f= 10.1f;
		System.out.println(f);
		
		/*
		 * 21. Explain about Double data type with example? 
		 * The double data type is a double-precision 64-bit IEEE 754 floating point. 
		 * Its value range is unlimited. 
		 * The double data type is generally used for decimal values just like float. 
		 * The double data type also should never be used for precise
		 * values, such as currency. Its default value is 0.0d. 
		 * If we store any real constant value in a variable of double data type then such real constant
		 * value store in the main memory in such a way that after the dot (.) it takes
		 * 15decimal places 
		 * And a real constant value may or may not be followed by a
		 * letter ‘d’. 
		 * In our Java program if we use any real constant value directly
		 * then such real constant value is by default treated as highest data type in
		 * float category that is double data type. Example: double d1 = 3.4d; (or)
		 * double d1 =3.4;
		 */

		double d = 12.0;
		System.out.println(f);
	}

}
