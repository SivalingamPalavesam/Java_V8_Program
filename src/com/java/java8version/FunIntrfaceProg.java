package com.java.java8version;

@FunctionalInterface
 interface MainClass {
	
	public  abstract void method1();

	 
	default void method3()
	{
		System.out.println("Method 3 is Executed");
		
	}
	static void method4()
	{
		System.out.println("Method 4 is Executed");
	}
			
}
public class  FunIntrfaceProg   
 {
	 public static void main(String[] args) {
		 MainClass obj = () -> System.out.println("method 5 is executed");
		 obj.method1();	  
	}

	
}