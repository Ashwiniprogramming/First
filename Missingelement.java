package Arrayassignment.xworkz.com;

public class Missingelement {
	
	public static int missingnumber(int a[],int n) {
		int i,res;
		res=(n+1)*(n+2)/2;
		for(i=0;i<n;i++)
		 res-=a[i];
		
		return res;
		
	}

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6,7,8,9,10};
		int miss=missingnumber(a,9);
		System.out.println(miss);
		
	}

	}


