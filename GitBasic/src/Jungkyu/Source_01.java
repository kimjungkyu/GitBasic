package Jungkyu;

public class Source_01 {
	
	public static void main(String[] args){
		int k = 0;
		int intArray[][] = new int[6][];
		intArray[0] = new int[4];
		intArray[1] = new int[1];
		intArray[2] = new int[1];
		intArray[3] = new int[1];
		intArray[4] = new int[1];
		intArray[5] = new int[4];
		
				for (int i=0; i < intArray[0].length; i++){
					intArray[0][i] = k++;
				}
				
				intArray[1][0] = k++;
				intArray[2][0] = k++;
				intArray[3][0] = k++;
				intArray[4][0] = k++;
				
				for (int i=0; i < intArray[5].length; i++){
					intArray[5][i] = k++;
				}
					
					for (int i=0; i < intArray.length; i++){
						for(int j=0; j < intArray[i].length; j++)
					System.out.print(intArray[i][j]+" ");
				System.out.println(" ");}
	}
}
