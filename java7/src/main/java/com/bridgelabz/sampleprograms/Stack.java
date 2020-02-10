package com.bridgelabz.sampleprograms;

import java.util.Scanner;

class Stackprogram
{
	Node top=null;
	public void push(int x)
	{
		Node node=new Node();
		if(node==null)
		{
			System.out.println("Stack is full:");
		}
		else
		{
			node.data=x;
			node.next=top;
			top=node;
		}
	}
	
	public int pop()
	{
		int y=-1;
		Node head;
		if(top==null)
		{
			System.out.println("Stack is empty:");
		}
		else
		{
			head=top;
			top=top.next;
			y=head.data;
		}
		return y;
	}
	
	public void display()
	{
		Node last=top;
		while(last!=null)
		{
			System.out.print(last.data+"->");
			last=last.next;
		}
	}
}

public class Stack {

	public static void main(String[] args)
	{
		Stackprogram stack=new Stackprogram();
	    int n;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    int [] array=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	array[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	       stack.push(array[i]);
	    }
	   stack.display();
	   System.out.println();
	   int value= stack.pop();
	   System.out.println("Value="+value);
	   stack.display();
		sc.close();

	}

}
