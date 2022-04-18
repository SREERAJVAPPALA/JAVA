class product {
	int pcode,price;
	String pname;
	void getdata(int x,String y,int z) {
	pcode=x;
	pname=y;
	price=z;
	}
}

public class EX3{
	public static void main(String args[]) {
	 product p1 = new product();
	 product p2 = new product();
	 product p3 = new product();
	 p1.getdata(123,"LAYS",10);
	 p2.getdata(234,"BANANA",40);
	 p3.getdata(456,"NOODLES",12);
	 System.out.println("minimum price is:"+Math.min(p1.price,Math.min(p2.price,p3.price)));
	
	 }
}


						

