package com.java.java8version;


@FunctionalInterface
interface InterClass  {

	public  abstract int method1(String msg);  // return type is int

	default void method3()
	{
		System.out.println("Method 3 is Executed");

	}
	static void method4()
	{
		System.out.println("Method 4 is Executed");
	}

}

public class FunctionInterFace {
	public static void diplay(String msg)
	{
		msg = msg.toUpperCase();
		System.out.println(msg);
	}

	

}
