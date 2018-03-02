public class Palindrome {
    public static void main(String args[]) {
      int i =121;
     System.out.println(reverseNum(i));
     System.out.println(i);
     if(i==reverseNum(i)){
         System.out.println("given number is palindrome"+i);
     }
    }
    static int reverseNum(int i){
        int res = 0;
        
        while(i>0){
            res =res * 10 + i%10;
            i=i/10;
        }
        return res;
        
    }
}
