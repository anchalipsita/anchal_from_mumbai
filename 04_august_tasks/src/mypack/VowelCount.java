package mypack;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class VowelCount {
	
	public static void highestVowel(String str) {
		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		String s[] = str.split(" ");
		Arrays.sort(s);
		for (int i=0; i<s.length; i++) {
			String vowels = "aeiouAEIOU";
			List<Character> list = new ArrayList<>();
			for (int j=0; j<s[i].length(); j++) {
				if(vowels.contains(Character.toString(s[i].charAt(j)))) {
					list.add(Character.toLowerCase(s[i].charAt(j)));
				}
			}
			
			int size = list.size();
			if(map.containsKey(size)) {
				String s1=map.get(size);
				StringBuilder sb = new StringBuilder(s[i]);
				s1=sb.toString()+" "+s1;
				map.put(size, s1);
			}else {
				map.put(size, s[i]);
			}
		}
		
		System.out.println(map);
		StringBuilder sb=new StringBuilder();
		for(String s1:map.values()) {
			sb.append(s1).append(" ");
		}
		System.out.println(sb.toString().trim());
	}

	public static void main(String[] args) {
		
//		String str = "eee hgee aeer";
		String str = "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";
		highestVowel(str);
	}
	 
}
