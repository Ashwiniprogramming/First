package Arrayassignment.xworkz.com;
import java.util.Arrays;

public class Removeduplicateelements {
	
public static int Removeduplicateelements(int arr[], int n ) {
		
		if(n==0 || n==1) {
			
			return n;
			
		}
		
		int[] temp=new int[n];
		
		int j=0;
		
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		
		}
		temp[j++]=arr[n-1];
		//changing original array
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
			
		}
		return j;
		
		}
		public static void main(String[] args) {
		
		int arr[]= {1,2,1,2,3,4,5};//unsorted array
		Arrays.parallelSort(arr);//sorted
		
		int length=arr.length;
		
		length=Removeduplicateelements(arr,length);
		
		for(int i=0;i<length;i++) 
			
			System.out.print(arr[i] +" ");
		}
		
	}
	

	