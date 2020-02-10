package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityScanner;

public class OrderedList {

	public static void main(String[] args) throws IOException 
	{   
		String path="/home/bridgelabz/eclipse-workspace/BridgeLabz7/java9/src/main/java/com/bridgelabz/datastructureprograms/numbers.txt";
		String string=" ";
		FileReader str=new FileReader(path); 
		BufferedReader  br=new BufferedReader(str);
	     string=br.readLine();
	     String []array=string.split(" ");
	     int count=0;
	    for(int i=0;i<array.length;i++)
	     {
	    	count++;
	     }
	    int [] intarray=new int[count];
	    for(int i=0;i<count;i++)
	    {
	    	intarray[i]=Integer.parseInt(array[i]);
	    }
	    Arrays.sort(intarray);
	    for(int i=0;i<count;i++)
	    {
	    	Utility.integerinsert(intarray[i]);
	    }
	    System.out.println("Enter the string which you want to enter or wanted to find:");
	    int number=UtilityScanner.integerInput();
	    Utility.integersearch(number);
	   String read=Utility.integershow();
	write(read,path);
	     br.close();
	}
	


	public static void write(String string,String br)throws IOException
	{
		FileWriter fw=new FileWriter(br);
		fw.write(string);
		fw.close();
	}

}
