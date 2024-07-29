package com.raj.jenkins;

public class Task5 {
	public static boolean fib(int n) {
		
		 int first = 0, second = 1,sum=0,c=0;
		 
	     for(int i=0;i<n*2;i++){
	         if (i <= 1) {
	              sum = i;
	              c++;
	          } 
	         else {
	             sum = first + second;
	             first = second;
	             second = sum;
	             c++;
	          }
	         if(c==n){
	            return true;
	         }
         }
		return false;
	}
}
