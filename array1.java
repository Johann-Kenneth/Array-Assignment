package com.practise;

public class array1 {
	
	public static void main(String[] args) {
        String[] words = {"abc", "bcd", "aba", "cfg", "madam"};
        for(int i=0;i<words.length;i++) {
        	StringBuilder temp=new StringBuilder(words[i]);
        	String result= temp.reverse().toString();
        	if(words[i].equals(result)) {
        		System.out.println("first palindrome found is: "+result);
        		break;
        	}
        	
        }

	}
}
