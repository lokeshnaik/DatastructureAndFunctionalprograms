package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

import com.bridgelabz.utility.Utility;

public class UnOrderedList {

	public static void main(String[] args)
	{
		
		try
		{
			String str="";
			 
		       BufferedReader br=new BufferedReader(new FileReader("/home/bridgelabz/Desktop/sample7.txt"));
		      if((str=br.readLine())!=null)
		      {
		    	  
		    	  String parts[]=str.split(" ");
		      
		        int i;
		        for(i=0;i<parts.length;i++)
		        {
		        	Utility.insert(parts[i]);
		        }
		      }
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
			Utility.show();
		
	}

}
