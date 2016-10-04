
package com.avalia.constructor;

public class PrivateConstructoeExample {

	private PrivateConstructoeExample() {

		System.out.println("This is private constructor");
	}

	public static void main(String[] args) {
		new PrivateConstructoeExample();

	}
}
