package practice;

public class PrintNumWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumer(1);
	}
	
	public static void printNumer(int n){
		
		if(n<=10){
			System.out.println(n);
			printNumer(n+1);
		}
		
	}

}
