package practice;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		String str = "abacbdac";
		char[] ch = str.toCharArray();
		Map<Character,Integer> strmap = new HashMap<>();
		for(char c : ch){
			strmap.put(c, strmap.containsKey(c) ? strmap.get(c)+1 : 1 );
		}
		System.out.println("character count in word");
		for(Map.Entry<Character, Integer> res : strmap.entrySet()){
			System.out.println(res.getKey()+" = "+ res.getValue() );
		}
		System.out.println("duplicate values");
		for(Map.Entry<Character, Integer> res : strmap.entrySet()){
			
			if(res.getValue()>1){
				System.out.println(res.getKey());
			}
			
		}
		System.out.println("non duplicate values");
		for(Map.Entry<Character, Integer> res : strmap.entrySet()){
			
			if(res.getValue() == 1){
				System.out.println(res.getKey());
			}
			
		}

	}

}
