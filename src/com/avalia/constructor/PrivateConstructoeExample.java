
package com.avalia.constructor;

public class PrivateConstructoeExample {

	private PrivateConstructoeExample() {

		System.out.println("I am private constructor");
	}

	public static void main(String[] args) {
		new PrivateConstructoeExample();

	}
}
