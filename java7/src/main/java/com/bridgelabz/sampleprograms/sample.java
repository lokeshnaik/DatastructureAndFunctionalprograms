package com.bridgelabz.sampleprograms;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//if(i==0||j==0||i==j||j==n-1||i==n-1||i==n/2||j==n/2||i-j==n/2||j-i==n/2||i+j==n+n/2-1||i+j==n-1||i+j==n/2)
				
				if((j==0&&i>=n/2)||(i-j==n/2)||(i+j==n+n/2-1||(j==n-1&&i>=n/2)))
				{
					System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//if(i==0||j==0||i==j||j==n-1||i==n-1||i==n/2||j==n/2||i-j==n/2||j-i==n/2||i+j==n+n/2-1||i+j==n-1||i+j==n/2)
				
				if((j==0&&i>=n/2)||(i-j==n/2)||(i+j==n+n/2-1||(j==n-1&&i>=n/2)))
				{
					System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//if(i==0||j==0||i==j||j==n-1||i==n-1||i==n/2||j==n/2||i-j==n/2||j-i==n/2||i+j==n+n/2-1||i+j==n-1||i+j==n/2)
				
				if((j==0&&i>=n/2)||(i-j==n/2)||(i+j==n+n/2-1||(j==n-1&&i>=n/2)))
				{
					System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			
			}
			System.out.println();
		}
	   
	}

}
