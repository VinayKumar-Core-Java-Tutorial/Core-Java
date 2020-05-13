package _4.Operators;

public class Arithemetic_operators1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int n = 2;
		byte b = 2;          //difference between b++ & b=b+1
		byte c = b++;// b=b+1, (byte)(b)here internally it converts when used increment or decrement
		byte d = (byte)( b+1); // here it is a integer value so we should explicitly mention the type
       n += 3;
      System.out.println(c +" " + d +" "+n);
	}

}
