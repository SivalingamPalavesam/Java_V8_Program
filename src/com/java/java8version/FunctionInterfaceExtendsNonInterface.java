package com.java.java8version;

interface extendInterface
{
	default String abMethod() {
		return "siva";	
	}
}

@FunctionalInterface
interface FunInterface extends extendInterface
{
	public void abstractMethod();
	
	default String defmethod()
	{
		return "Default method";
	}
	static String staticMethod(String msg)
	{
		return msg;
	}
}

public class FunctionInterfaceExtendsNonInterface {

	public static void main(String[] args) 
	{

	}

}
