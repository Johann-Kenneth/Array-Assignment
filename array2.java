package com.practise;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr= {"aba","bcd","aaaa","cbc"};
		String x="a";
		boolean found=false;
		for(int i=0;i<arr.length;i++) { {
				if(arr[i].contains((x))) {
					if(found) {
						System.out.print(", ");
					}
					System.out.print(i);
					found=true;
					
				}
			}
			if(!found) {
				System.out.println("no words");
			}
		}

	}

}
