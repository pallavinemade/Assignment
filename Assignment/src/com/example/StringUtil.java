package com.example;

import java.util.HashMap;
import java.util.stream.Collectors;

public class StringUtil {
	
	/*
	 * Question 2
	 * Accepts any string and returns reverse string
	 * Assumptions
	 * 1. If Null string comes Null is returned
	 * 
	 * 
	 */
	public static String reverseString(String input) {
		if(input==null)
				return null;
		
		char [] inputCharacter = input.toCharArray();
		int inputLength = inputCharacter.length;
		
		for(int i=0; i<inputLength/2 ;i++){
			char temp = inputCharacter[i];
			inputCharacter[i] = inputCharacter[inputLength-1-i];
			inputCharacter[inputLength-1-i] = temp;
		}
		return new String(inputCharacter);
	}
	
	/*
	 * 
	 * Question 3
	 * Accepts input string and returns number of times each word is repeated
	 * Assumptions
	 * 1. If Null or empty string is send as input output will be "[]";
	 * 2. String is split by space, comma and @ character hence for example Walmart and 
	 * 	  @Walmart are considered as same and count is 2.
	 * 3. singular and plural are considered as a different tokens.
	 * 4. JSON string is not created , Normal string is printed in same format.
	 * 
	 *  
	 */
	public static String countWordsOccurences(String input) {
		
		if(input==null || input.length()==0)
			return "[]";
		
		String inputTokens[] = input.split(" |,|@");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(String token: inputTokens){
			if(token.length()>0) {
				if(map.containsKey(token)) {
					map.put(token, map.get(token)+1);
				}else {
					map.put(token,1);
				}
			}
		}
		
		String output = map.entrySet().stream()
		    .map(e -> "{\"" + e.getKey() + "\":" + e.getValue()+"}")
		    .collect(Collectors.joining(","));
		
		return "["+output+"]";
	}

}
