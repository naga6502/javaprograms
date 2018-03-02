public class RevervseNum {
    public static void main(String args[]) {
      int i =1231;
     System.out.println(reverseNum(i));
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
