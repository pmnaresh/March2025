package com.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConcurrencyofString {

	public static void main(String[] args) {
		
		
		String s= "BathalaNaveenKumNar";
		
		//String s2 = s.toLowerCase();
		Map<Object, Long> map=s.chars().mapToObj( c -> (char)c).collect(Collectors.groupingBy(ch -> ch ,Collectors.counting()));
		System.out.println(map);
		
		//map.entrySet().stream().filter(f -> f.getValue() > 2).forEach( d ->System.out.println(d));
         
		
		Map<Character, Long> map1=s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(f->f , Collectors.counting()));
		
		StringBuffer sb = new StringBuffer();
		ArrayList< String> pl =new ArrayList<String>();
		
		for(Map.Entry<Object,Long > kl : map.entrySet())
		{
			sb.append(kl.getKey()).append(kl.getValue());
		}
		
		pl.add(sb.toString());
		System.out.println(pl+"["+"]");
		
		
		String b ="Naveen";
		String c = "naeenl";
		
		boolean status = true;
		
		if(b.length() != c.length())
		{
			status = false;
		}
		else
		{
			char[] ch=b.toLowerCase().toCharArray();
			char [] ch1 = c.toLowerCase().toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			status =Arrays.equals(ch, ch1);
			
			if(status== true)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("No");
			}
		}
	}

}
