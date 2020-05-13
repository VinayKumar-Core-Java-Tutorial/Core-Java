package _7_4.Arrays_Programs;//Java Program to Display Upper/Lower Triangle of a Matrix
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Program_62 {
	static void displayProgram_62(int[][] matrix){
        int order = matrix.length;
        int i,j;
        for(i=0; i<order; i++){
            for(j=0; j<order;j++){
                if((i+j) <order)
                    System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        for(i=0; i<order; i++){
            for(j=0; j<order;j++){
                if((i+j) >=order)
                    System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int order;
        System.out.println("Enter the order of the matrix");
        try{
            order = Integer.parseInt(br.readLine());
        }
        catch(Exception e){
            System.out.println("An error occurred");
            return;
        }
        int[][] matrix = new int[order][order];
        System.out.println("Enter matrix elements");
        int i,j;
        for(i=0; i<order; i++){
            for(j=0; j<order; j++){
                try{
                    matrix[i][j] = Integer.parseInt(br.readLine());
                }
                catch(Exception e){
                    System.out.println("An error occurred");
                    return;
                }
            }
        }
        System.out.println("Tha matrix is");
        for(i=0; i<order; i++){
            for(j=0; j<order; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("The upper and lower triangle is");
        displayProgram_62(matrix);
	}

}
