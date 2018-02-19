package practice;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int num = sc.nextInt();
		int temp = num;
		int revnum = 0;
		while(num>0){
			revnum = revnum*10+num%10;
			num = num/10;
		}
		
		System.out.println(revnum);
		
		if(temp==revnum){
			System.out.println(temp +" is palindrome");
		}
	}

}
