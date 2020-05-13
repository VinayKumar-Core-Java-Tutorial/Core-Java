package _7_1.Arrays_Programs;

public class GetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[3]; 
        byte byteArray[] = new byte[3]; 
        short shortsArray[] = new short[3]; 
          
        // array of Strings 
        String[] strArray = new String[3]; 
          
        System.out.println(intArray.getClass().getName()); 
        System.out.println(intArray.getClass().getSuperclass().getName()); 
        System.out.println(byteArray.getClass().getName()); 
        System.out.println(shortsArray.getClass().getName()); 
        System.out.println(strArray.getClass().getName()); 

	}

}
