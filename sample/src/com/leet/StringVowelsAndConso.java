package com.leet;

public class StringVowelsAndConso {

	public static void main(String[] args) {
		
		 String str = "Bathala Naveen Kumar".toLowerCase();
		 
		 int v =0; int c=0;
		 for(char ch :str.toCharArray())
		 {
			 if(Character.isLetter(ch))
			 {
				 if("aeiou".indexOf(ch)!= -1)
				 {
					 v++;
				 }
				 else
				 {
					
					 c++;
				 }
			 }
			
		 }
		 System.out.println(v);
		 System.out.println(c);

	}

}
