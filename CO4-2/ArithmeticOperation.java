import java.util.Scanner;
import Arithmetic.*;

public class ArithmeticOperation {
    public static void main(String args[]){
        // Scanner sc=new Scanner();
        // Rectangle r1=new Rectangle(length,breadth);
        // Circle c1=new Circle(radius);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice");
        int choice=sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("enter the first number to add:");
                double no1=sc.nextDouble();
                System.out.println("enter the second number to add:");
                double no2=sc.nextDouble();
                MathOperation m1=new MathOperation(no1,no2);

                System.out.println("sum of numbers:"+m1.add());
                break;
            case 2:
                System.out.println("enter the first number to sub:");
                double num1=sc.nextDouble();
                System.out.println("enter the second number to sub:");
                double num2=sc.nextDouble();
                MathOperation m2=new MathOperation(num1,num2);

                System.out.println("difference of numbers:"+m2.sub());
              
                
                

                break;
        
            case 3:
                System.out.println("enter the first number to mul:");
                double numm1=sc.nextDouble();
                System.out.println("enter the second number to mul:");
                double numm2=sc.nextDouble();
                MathOperation m3=new MathOperation(numm1,numm2);

                System.out.println("multiplication of numbers:"+m3.mul());
                break;
                
            case 4:
                System.out.println("enter the first number to div:");
                double n1=sc.nextDouble();
                System.out.println("enter the second number to div:");
                double n2=sc.nextDouble();
                MathOperation m4=new MathOperation(n1,n2);

                System.out.println("division of numbers:"+m4.div());
                break; 
            default:
                System.out.println("wrong choice");
        // Scanner sc=new Scanner();
        // Rectangle r1=new Rectangle(length,breadth);
        // Circle c1=new Circle(radius);
        }

    }
}
 