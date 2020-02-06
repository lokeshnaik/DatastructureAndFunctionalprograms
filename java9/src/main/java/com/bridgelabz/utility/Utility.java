package com.bridgelabz.utility;

//import com.bridgelabz.datastructureprograms.PrimeNumbers;
import com.bridgelabz.datastructureprograms.Node;
import com.bridgelabz.datastructureprograms.TwoDArray;

public class Utility
{
	 static Node top=null;
	/*public static void ArthimeticExpression(String string)
	{
		Node top=null;
		int length;
		length=string.length();
		char[] array=new char[length];
		for(int i=0;i<length;i++)
		{
			array[i]=string.charAt(i);
		}
		for(int i=0;i<length;i++)
		{
			push(array[i],top);
		}
	}*/
	
	public void isEmptyStack()
	{
		Node node=new Node();
		if(node==null)
		{
			System.out.println("Stack is empty:"); 
		}
		else
		{
			System.out.println("Stack is not empty:");
		}
	}
	public static void push(char data)
	{
		 Node temporary;
		 temporary =new Node();

		 if(temporary==null)
		 {
		 System.out.println("Stack is full");
		 }
		 else
		 {
			 temporary.data=data;
			temporary.next=top;
		      top=temporary;
		 }
		
	}
	public static char pop()
	{
		  Node temporary;
		 char x=(char) -1;

		 if(top==null)
		 System.out.println("Stack is Empty\n");
		 else
		 {
		 temporary=top;
		 top=top.next;
		 x=temporary.data;
		 }
		 return x;
	}
	public static int isBalanced(String string)
	{
		int i;
	// Node top=null;
		int length;
		length=string.length();
		char[] array=new char[length];
		for( i=0;i<length;i++)
		{
			array[i]=string.charAt(i);
		}

	 for(i=0;i<length;i++)
	 {
	 if(array[i]=='(')
	 push(array[i]);
	 else if(array[i]==')')
	 {
	 if(top==null)
	 return 0;
	 pop();
	 }
	 }
	 if(top==null)
	 {
	 return 1;
	 }
	 else
	 {
	 return 0;
	 }
	}
	
	
	
	
	  public static void primeNumbers()
	  {
		  int count=0,flag;
		  int i=1,j,number=1000;
		  while(i<=number)
		  {
			  j=1;
			  flag=0;
			  while(j<=i)
			  {
				  if(i%j==0)
				  {
					  flag++;
				  }
				  j++;
			  }
			  if(flag==2)
			  {
				  count++;
			  }
			  i++;
		  }
		  int[] primearray=new int[count];
		  int k=0;
		  i=1;
		  while(i<=number)
		  {
			  j=1;
			  flag=0;
			  while(j<=i)
			  {
				  if(i%j==0)
				  {
					  flag++;
				  }
				  j++;
			  }
			  if(flag==2)
			  {
				  primearray[k]=i;
				  k++;
			  }
			  i++;
		  }
		  TwoDArray.display(primearray,count);           //Returning primearray  array and length of the array to display in PrimeNumbers class
	  }
	

}
