package logicalprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CharacterAndWordCount {
	public static void main(String[] args) {
		characterCount();
		wordCount();
	}

	private static void wordCount() {
		String s = "To declare an array of integers you start with To declare an array of integers ";
		StringTokenizer st = new StringTokenizer(s , " ");
		Map<String,Integer> map = new HashMap<String,Integer>();
		while(st.hasMoreTokens()){
		String key	= st.nextToken();
		if(map.containsKey(key)){
			Integer	 value = map.get(key);
			value=value+1;
			map.put(key, value);
			}else{// it executes if word comes for first time.
				map.put(key, 1);
				
			}
			
		}
		System.out.println("wordCount map = " + map);
		}
		
	

	private static void characterCount() {
		String s= "declare";
		char [] c= s.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character ch : c){
			if(map.containsKey(ch)){// it returns true if character is repeated.
			Integer	 value = map.get(ch);
			value=value+1;
			map.put(ch, value);
			}else{// it executes if character comes for first time.
				map.put(ch, 1);
				
			}
		}
		System.out.println("characterCount map = " + map);
	}

}
