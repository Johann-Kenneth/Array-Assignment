package com.practise;

public class array1 {

	public static String firstPalindrome(String[]words) {
		
		for(String word:words) {
			int left=0;
			int right=word.length()-1;
			Boolean palindrome=true;
			while(left<right) {
				if(word.charAt(left)!=word.charAt(right)) {
					 palindrome=false;
					 break;
				}
				left++;
				right --;
			}
			if( palindrome=true) {
				return word;
			}
			return null;
				
			}
	
	
	public static void main(String[] args) {
        String[] words = {"abc", "bcd", "aba", "cfg", "madam"};
        String firstPalindrome1 = firstPalindrome(words);
        if (firstPalindrome1 != null) {
            System.out.println("First palindrome string found: " + firstPalindrome1);
        } 
        else {
            System.out.println("No palindrome string found in the list.");
        }
    }

}
