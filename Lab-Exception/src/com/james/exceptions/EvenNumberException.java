package com.james.exceptions;

public class EvenNumberException extends Exception {

	@Override
	public String getMessage() {
		return "Error! you cannot input an even number!";
	}
}
