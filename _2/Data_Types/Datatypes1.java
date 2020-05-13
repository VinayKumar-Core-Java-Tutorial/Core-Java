package _2.Data_Types;

public class Datatypes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int ab='a';
   System.out.println(ab);
		byte b = 4;   // declared variable  b as type byte and assigned a value 4
    int x = 10;    //declared variable  x as type int and assigned a value 10
    long l = 10;    //declared variable l as type long and assigned a value 10l
                // default type is always int so we should explicitly mention 'l/L' after the value
    long l1 = (long)10;// we can also mention the type as(datatype)(literal/expression)              
    float f = 10.0f; //  declared variable  f as type float and assigned a value 10.0f
                   // default type is double so we should mention 'f/F' after the value
                   //or float f = (float)10.0;
    double d = 234.508; //declared variable  d as type double and assigned a value 234.508
    char ch = 'a';   //  declared variable  ch as type char and assigned a value 'a'
                     // always assign a single char within '' and default value is '\u0000'
                   //e.g char ch = '\uabcd';
     String s = "hello"; //declared variable s as type String and assigned a value "hello"
                         // string value is always mentioned within "" e.g any text 
     char ch1 = 97+67; //declared variable ch1 as type char and assigned a value 97+67
                       // converts them into ascii and returns the equivalent value 
     float f1 = 010;
    // boolean z1 = null; declared variable z1 as type boolean and assigned a value null
     // but gives error as boolean only accepts true/false values where default value is false
     Boolean z2 = null; // accepts null because it is declared as a user defined function
     byte b1 = 4+4;  
     byte b2 = 10+10;
     b2 =(byte) (b+b1);// (int + byte)of type byte =int,
     short c = 5;
     short b3 = (short)(b+c);// (int + short)of type short = int 
     long e = 6;
     long b4 = (long)(b+e);// (int + long) of type long = int
     boolean z = true;//declared variable  z as type boolean and assigned  value true
    System.out.println(b+"\n"+x+"\n"+l+"\n"+l1+"\n"+f+"\n"+d+"\n"+ch+"\n"+s+"\n"+ch1+"\n"+f1+"\n"+
     z2+"\n"+b2+"\n"+b3+"\n"+b4+"\n"+z);
   
    
    
   
    
	}

}
