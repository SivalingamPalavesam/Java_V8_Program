package com.java.java8version;

@FunctionalInterface
interface ExceptinHandle {
	public abstract int sub(int x, int y);

	default void method3() {
		System.out.println("Method 3 is Executed");
	}
	static void method4() {
		System.out.println("Method 4 is Executed");
	}
}
public class FunctionInterExceptionProg  {
	public static void main(String[] args) {
		ExceptinHandle obj = (int x, int y) -> {

			if (x < y) {
				throw new RuntimeException("Wrong value");
			} else {
				return x - y;
			}
		};
		System.out.println(obj.sub(37, 5));
	}
}