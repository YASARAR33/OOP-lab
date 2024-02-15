class Product
{
	    int pcode;
	    String pname;
	    double price;
	    double lowest;
	    void data(int c, String n, double p){
	        pcode=c;
	        pname=n;
	        price=p;
	    }
	    void display(){
	        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
	        
	    }  
	    static void findLowest(double price1,double price2, double price3){
	    if(price1<=price2 && price1<=price3){
	        System.out.println("\nChair is of the lowest price!");
	        
	    }
	    else if(price2<=price1 && price2<=price3){
	        System.out.println("\nMonitor is of the lowest price!");
	        
	    }
	    else{
	        System.out.println("\nLaptop is of the lowest price!");
	        
	    }
	    
	   }
	  public static void main(String[] args){
	        Product obj1 = new Product();
	        Product obj2 = new Product();
	        Product obj3 = new Product();
	        obj1.data(101,"Chair",100.0);
	        obj2.data(102,"Monitor",128.40);
	        obj3.data(103,"Laptop",790.00);
	        System.out.println("Product Information:\n Product_Code\tProduct_Name\tProduct_Price");
	        obj1.display();
	        obj2.display();
	        obj3.display();
	        findLowest(obj1.price,obj2.price,obj3.price);    
	        
	    }
	}
