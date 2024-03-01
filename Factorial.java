package com.javacore.qa;


public class Factorial {
	
public void facto() {
		
		int c = 15;
		long res = 1;
		
		for (int i=1; i<=c; i++) {
		res=res*i;
		}
		System.out.println(res);
		}

public static int primeNumber(int x) {
	
	//int a=10;
	//int b=50;
	 for(int i=2;i<=x;i++) {
		 if (x%i==0) {
			 return -1;
		 }
		 return 1; 
	 }
	return x;
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial fact = new Factorial();
		fact.facto();
		//fact.prime();
		//public void prime() {
			//int a=10;
			//int b=50;
			 for(int i=10;i<=50;i++) {
				 if(primeNumber(i)==1) {
					 System.out.println(i);
				 }
			 }
		//}
		
	}

}
