package com.bridgelabz.datastructureprograms;

import java.awt.List;
import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class BothPrimeAnagram 
{
  public static void main(String[] args)
  {
	  System.out.println("Number of Prime numbers in between 0 to 1000");
	  Utility.primeNumberAnagrams(); 
  }
  
  public static void display(ArrayList<String> list,ArrayList<String> values)
  {
	  System.out.println("Prime which are anagram:");
		for(String i:list)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Prime which are not anagram:");
		for(String j:values)
		{
			System.out.print(j+" ");
		}
  }
}
