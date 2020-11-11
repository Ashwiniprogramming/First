package com.xworkz.JaggedArrayConcept;

public class JaggedArray {

	public static void main(String[] args) {
		
		int arr[][] = new int [2][];//declaring 2-D array with 2 rows
		
		arr[0] = new int[3];//First row has 3 columns
		
		arr[1] = new int[2];//Second roe has 2 columns
		
	    int count= 0;
		for (int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=count++;
		
		System.out.println("Content of jagged array");
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
	}

}
}
