package if_statements;

public class If_statements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x=10,y=20,z=30;
     //if statement
     if (x<y)
     {
    	 System.out.println(x);
     }
     // if else statement
     if (x==z)
     {
    	 System.out.println(true);
     }
     else
     {
    	 System.out.println(false);
     }
    	
    //if else if ladder statement
     
     
     if (x>z)
    	{
    		System.out.println(x);
    	}
    	else if (x==z)
    	{
    		System.out.println(z);
    	}
    	else if (y<x)
    	{
    		System.out.println(false);
    		
    	}
    	else if (x!=y)
    	{
    		System.out.println(true);
    		
    	}
    	else
    	{
    		System.out.println(false);
    	}
     
     // nested if statement
     
     if (x<z)
     {
    	 if(y==z) {
    		 System.out.println("the statement is true");
    	 }
     else 
     {
    	 System.out.println("the statement is false");
     }
     }
     else
     {
    	 System.out.println("write the statement correctly");
     }
	}
	

}
