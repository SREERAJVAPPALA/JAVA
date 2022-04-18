import java.util.Scanner;
public class ArrayofObjects
{
public static void main(String args[])
{
int em;
int emp;
int i;
Scanner sc = new Scanner(System.in);
Employee[] obj = new Employee[4];
obj[0] = new Employee(100,"ASHHAD",20000);
obj[1] = new Employee(101,"SACHIN",25000);
obj[2] = new Employee(102,"ABHINAND",30000);
obj[3] = new Employee(103,"VISHNU",35000);

System.out.println("enter the employee number:");
em = sc.nextInt();
for(i=0;i<=3;i++)
{
if (obj[i].eno == em)
{
System.out.println("the employee details:");
obj[i].showData();
}
}
}
}


class Employee
{
int eno;
String ename;
int salary;
Employee(int e,String n,int s)
{
eno = e;
ename = n;
salary = s;
}

public void showData()
{
System.out.print("EmpNo = "+eno + "  " + " Employee Name = "+ename + " " + " Salary = " +salary);
System.out.println();
}
}


