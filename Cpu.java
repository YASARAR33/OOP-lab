public class Cpu
{
	int price;
	class Processor
	{
	        int cores;
	        String producer;
	        Processor(int noC, String manu)
		{
	            cores=noC;
	            producer=manu;
	        }
	        void display()
		{
	       	 	System.out.println("\nProcessor info");
	        	System.out.println("No. of Cores = "+cores);
	        	System.out.println("Manufacturer = "+producer+"\n");
	   	}
	}
	static class Ram
	{
	        int mem;
	        String manuf;
	        Ram(int memory,String producer )
		{
	            mem=memory;
	            manuf=producer;
	        }
	        void display()
		{
	       		System.out.println("\nRAM info");
	        	System.out.println("Memory = "+mem+" GB");
	        	System.out.println("Manufacturer = "+manuf+"\n");
	    }
	}
	public static void main(String[] args) 
	{
	         Cpu.Ram obj1= new Cpu.Ram(8,"Intel");
	         Cpu obj2 = new Cpu();
	         Cpu.Processor obj3 = obj2.new Processor(8,"Samsung");
	         obj1.display();
	         obj3.display();
	

	    }
	}
