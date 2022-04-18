import java.util.Scanner;
class AddMatrix
{
public static void main(String args[])
{
int row,col,i,j;
Scanner in = new Scanner(System.in);

System.out.println("enter the no of row:");
row = in.nextInt();

System.out.println("enter the no of column:");
col = in.nextInt();

int mat1[][] = new int[row][col];
int mat2[][] = new int[row][col];
int res[][] = new int[row][col];

System.out.println("enter the elements of first matrix:");

for(i=0;i<row;i++)
{
for(j=0;j<col;j++)

mat1[i][j] = in.nextInt();
System.out.println();
}

System.out.println("enter the elements of second matrix:");

for(i=0;i<row;i++)
{
for(j=0;j<col;j++)

mat2[i][j] = in.nextInt();
System.out.println();
}


for(i=0;i<row;i++)
for(j=0;j<col;j++)

res[i][j] = mat1[i][j] + mat2[i][j];

System.out.println("Sum of two matrix::");

for(i=0;i<row;i++)
{
for(j=0;j<col;j++)

System.out.println(res[i][j]+"\t");

System.out.println();
}
}
}




 
