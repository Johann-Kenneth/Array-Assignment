package com.practise;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr= {"aba","bcd","aaaa","cbc"};
		String x="a";
		boolean present=false;
		for(int i=0;i<arr.length;i++) { {
				if(arr[i].contains((x))) {
					if(present) {
						System.out.print(", ");
					}
					System.out.print(i);
					present=true;
					
				}
			}
			if(!present) {
				System.out.println("does not contain the letter");
			}
		}

	}

}
