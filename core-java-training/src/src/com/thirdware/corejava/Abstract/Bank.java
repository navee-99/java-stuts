package com.thirdware.corejava.Abstract;

public abstract class Bank {

	abstract void bankLocation();

	abstract void bankName();

	public void accounts() {
		System.out.println("savings acount,current acount");
	}
}
