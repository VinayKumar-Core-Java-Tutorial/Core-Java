package _4.Operators;

public class Assign_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x = 10;  // declared and assigned a variable x of type int = 10
     int  y = 20 ;  //declared and assigned a variable y of type int = 20
        x += y ;  //arithemetic operation + where x=x+y and returns value 30 
    int  w = 40;  // declared and assigned a variable w of type int = 30
    int z = 30;  // declared and assigned a variable z of type int = 40
     z -= w;    // arithemetic operration - where z= z-w and returns a value -10
     Double d = 10.0; //assiging value to object
     byte a,b; // declared variables a and b as type byte
     a = 4;   // assigned value 4
     b = 6;   // assigned value 6 
     a *= b;  // arithemetic operation * where a=a*b and returns value 24
     float c = 3.5f; //declared and assigned a variable c of type float  = 3.5f
     float e = 2.0f; // declared and assigned a variable e of type float = 2.0f
      c /= e;    // arithemetic expression / where c=c/e and returns a value 1.75
     short g = 20; // declared and assigned a variable g of type short = 20
     int  h = 10+10; // declared and assigned a variable h of type int = 10
      g %= h ; // aithemetic operation % where g=g%h and returns a value 0
     
     String s1 = "\"hello";  
     String s2 = "\tworld\"";
     String s3 = s1+s2;    //concatenation on string and char can be done by using + operator
      System.out.println(x+"\n"+z+"\n"+d+"\n"+a+"\n"+c+"\n"+g);
      System.out.println("s3="+s3);
     
      
     
      
	}

}
