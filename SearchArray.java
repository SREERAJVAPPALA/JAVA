import java.util.Scanner;

public class SearchArray
{
public static void main(String args[])
{
int n,x,flag=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of elements in the array");
n=sc.nextInt();
int a[] = new int[n];
System.out.println("enter the elements in the array");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter the element you want to find");
x=sc.nextInt();
for(i=0;i<n;i++)
{
  if (a[i] == x)
 {
    flag = 1;
    break;
 }
  
}

if (flag == 1)
{
	System.out.println("the element is found at position"+i);
}
else
{
	System.out.println("the element is not found");
}
}
}

