package _4.Operators;

public class Pre_Post_Incre1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x = 10; // declared and assigned variable x = 10
       int y = 20; //declared and assigned variable y = 20
       int z = 30;  // declared and assigned variable z = 30
       int x1 = ++x; // pre increment ++x i.e x= x+1 ,x = 10+1,i.e 11 since pre inc x value is 
                     // returned as x1 
       int x2 = x++; // post increment x++ i.e initially x =10 and the initial value is 
                    // assigned to x2 and x= x+1 ,x = 10+1,i.e x=11 since post inc the initial value of x is 
                     // returned as x2
       System.out.println("x1="+x1); // o/p = x1= 11
       System.out.println("x2="+x2); // o/p = x2= 10
       int x3 = --z;  // pre decrement --z i.e z= z-1 ,z = 30-1,i.e z =29 since pre inc z value is 
                      // returned as x3
       int x4 = z--;
       System.out.println(z);// post decrement z-- i.e initially z =30 and the initial value is 
                    // assigned to x4 and z=z-1 ,z = 30-1,i.e z=29 since post decrement the initial value of z is 
                     // returned as x4
       System.out.println("x3="+x3); // o/p = x3 = 29
       System.out.println("x4="+x4);  // o/p = x4= 30
       int x5 = x1++ + x3;           // x1 = 11 since x1++, x1 will still be 11 and x3 = 29 so 11+29 = 40
                                
       System.out.println("x5="+x5);//o/p  x5 = 40
       int x6 = ++x3 - x4++;  // x3 = 29 since ++x3 = 30 and x4 = 30 sice post inc x4++ = 30 so 30-30
       System.out.println("x6="+x6);//o/p x6 = 0
       float f = 10.0f; //declared and assigned variable f = 10.0f
       float f1= 20.0f; //declared and assigned variable f1 = 20.0f 
       float f3 = f++ + x6 + ++f1; // (10.0 + 0 + (20.0+1=21.0))=31.0
       System.out.println("f3="+f3); //o/p = f3=31.0
       
       
       
       
       
	}

}
