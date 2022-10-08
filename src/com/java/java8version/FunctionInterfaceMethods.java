package com.java.java8version;
@FunctionalInterface
interface fun
{
	public default String HelloWorld() { 
		return "Hello World";
	}
	public static String CustomMessage(String msg) { 
		return msg; 
	} 
	public void bar(); 

}

public class FunctionInterfaceMethods implements fun {

	public static void main(String[] args) 
	{
		fun obj =() ->System.out.println("siva");
		obj.bar();
		System.out.println(obj.HelloWorld());
		System.out.println(fun.CustomMessage("static method"));
	}

	@Override
	public void bar() {
		System.out.println("Hello World");		
	}
	

}
