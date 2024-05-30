package com.techlabs.loops;

public class PrimeNumbersFromOneToFifty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int array[]=new int[20];
		int h=0;
		for(int i=1;i<=50;i++) {
			count=0;
			for(int j=i;j>=1;j--) {
				
				if(i%j==0) 
					count++;
				
			}
			if(count==2) {
				
					array[h]=i;
					h++;
					System.out.println(i);
				}
				
			}
		String s=array.toString();
		int l=s.length();
		System.out.println(l);
		int length=String.valueOf(array).length();
		System.out.println(length);
		System.out.println(h);
		for(int i=0;i<=h;i++) {
			System.out.println(array[i]);
		}
		int p=0;
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(array[p]+" ");
				p++;
			}
			System.out.println();
			
		}
		
	}

}
