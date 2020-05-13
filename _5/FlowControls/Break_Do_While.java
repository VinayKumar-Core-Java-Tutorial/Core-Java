package _5.FlowControls;

public class Break_Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int i=1;  
	    //do-while loop  
	    do{  
	        if(i==5){  
	           //using break statement  
	           i++;  
	           break;//it will break the loop  
	        }  
	        System.out.println(i);  
	        i++;  
	    }while(i<=10);  

	}

}
