package practice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		//reverse a string using string buffer
		String str= "hiiiiiii naga mohan";
		StringBuffer sb = new StringBuffer(str).reverse();
		System.out.println(sb);
		
		//reverse a string using string builder
		StringBuilder builder = new StringBuilder(str).reverse();
		System.out.println(builder);
		
		//using temporary variable
		String temp ="";
		for(int i=str.length()-1;i>=0;i--){
			temp = temp+str.charAt(i);
		}
		System.out.println(temp);
		
		System.out.println(StringReverse.rev(str));
	}
	public static String rev(String str){
		
		if(str ==  null || str.isEmpty()){
			return str;
		}
		return rev(str.substring(1))+str.charAt(0);
		
	}

}
