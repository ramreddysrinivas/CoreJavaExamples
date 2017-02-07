package logicalprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramExample {
	
	// if 2 strings have same characters(order is not necessary), then both Strings are Anagrams. 
	public static void main(String[] args) {
		String s1 = "ababab";
		String s2 = "bababa";
		if(s1.length()!= s2.length()){
			System.out.println("not a anagram");
		}else{
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
		//	usingHashMap(c1, c2);
			usingArrays(c1,c2);
			
		}
		
		
		
		
	}

	private static void usingArrays(char[] c1, char[] c2) {
		Arrays.sort(c1);
		Arrays.sort(c2);
	boolean b = Arrays.equals(c1, c2);
	if(b==true){
		System.out.println(" it is anagram");
	}else{
		System.out.println(" not a anagram");
	}
	}

	private static void usingHashMap(char[] c1, char[] c2) {
		Map<Character,Integer> c1map = new HashMap<Character,Integer>();
		
		for(char c:c1){
			if(c1map.containsKey(c)){
				int count= c1map.get(c);
				count=count+1;
				c1map.put(c, count);
			}else{
				c1map.put(c, 1);
			}
		}
		Map<Character,Integer> c2map = new HashMap<Character,Integer>();
		for(char c:c2){
			if(c2map.containsKey(c)){
				int count= c2map.get(c);
				count=count+1;
				c2map.put(c, count);
			}else{
				c2map.put(c, 1);
			}
		}
		boolean flag=false;
		for(Character ch : c1map.keySet()){
			
			if(!c2map.containsKey(ch)){
				System.out.println("not a anagram");
				break;
			}else{
				if(c1map.get(ch)==c2map.get(ch)){
					flag=true;
				}else{
					System.out.println("not a anagram");
					break;
				}
			}
			
		}
		if(flag==true)
		System.out.println("both Strings are Anagrams");
	}

}
