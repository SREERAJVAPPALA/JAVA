import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
class sortStringByWords{
	public static void main(String args[]) 
	{
	Scanner reader=new Scanner(System.in);
	System.out.println("enter the string to be to sorted ");
	String str=(reader.nextLine());
	String[] arr=str.split(" ");
	int n=arr.length;
	for(int i=0;i<n-1;i++)
		{
			for(int j=i;j<n;j++)
			{
				if((arr[j].compareTo(arr[i]))<0)
				{
					String temp=arr[i];
					
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	String s= String.join(",",arr);
	System.out.println("the sorted string is "+s);
}
}
