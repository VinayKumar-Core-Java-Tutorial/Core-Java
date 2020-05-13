package _7_1.Arrays_Programs;

public class Threedifor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][][] test = {
     {
         {1, -2, 3}, 
         {2, 3, 4}
       }, 
       { 
           {-4, -5, 6, 9}, 
              {1}, 
           {2, 3}
        } 
        };
for(int i = 0;i<test.length;i++){
for(int j=0;j<test[i].length;j++){
for(int k=0;k<test[i][j].length;k++){
System.out.println(test[i][j][k]);
}
}
}
	}

}
