package cpm.senthil.java8;

public class SimpleJava {
	


	public static void main(String[] args) {
	
		
	/*	int a =10;
		int b =20;
			
			if (a==b)
			 System.out.println("True");
		     System.out.println("false"); */
		     
		     
		 //    lambdainter demo = () ->  System.out.println("Hi Hello ");
		     
		     
		 //   lambdainter demo = (c,b) -> c+b;
		     
		  //  System.out.println( demo.add(4,5));   
               
	//	lamDisplay((c,b) -> c+b);
		
		lamDisplay((c,b) -> c+b);

	} 
	
	
	
	public static void lamDisplay (lambdainter l) {
		
		System.out.println("Demo Display =" + l.add(4, 5));
	}
	
	interface lambdainter{
		
		
		int add(int a, int b);
		
	}
	

}
