public class ComplexNumber{
double real,image;

ComplexNumber(double r,double i){
this.real=r;
this.image=i;
}

public static ComplexNumber sum(ComplexNumber a,ComplexNumber b){
ComplexNumber temp = new ComplexNumber(0,0);

temp.real=a.real + b.real;
temp.image=a.image + b.image;

return temp;
}

public static void main(String args[]){

ComplexNumber a = new ComplexNumber(5.5,4);
ComplexNumber b = new ComplexNumber(1.2,3.5);
ComplexNumber temp = sum(a,b);

System.out.println("Sum is:"+temp.real+"+"+temp.image+"i");
}
}



