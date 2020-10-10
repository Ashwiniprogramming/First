package Arrayassignment.xworkz.com;

import java.util.Arrays;


public class Intersectionoftwoarrays {
	
	public static void find(int[] arr1,int[]arr2) {
		
		Arrays.parallelSort(arr1);
		Arrays.parallelSort(arr2);
		

		int lengtharray1=arr1.length;
		int lengtharray2=arr1.length;
		int i=0,j=0;
		
		while(i<lengtharray1 && j<lengtharray2) {
			if(arr1[i]>arr2[j]) {
				j++;
			}
			else if(arr2[j]>arr1[i]) {
				i++;
			}
			else {
				
				System.out.print(arr1[i] + " ");
			     i++;
			     j++;
	
			}
		}
	}
			
		
	 public static void main(String[] args) {
		int[] arr1= {21,34,41,22,35};
		int[] arr2= {61,34,45,21,11};
		
		find(arr1,arr2);
		
	 }	

	}


