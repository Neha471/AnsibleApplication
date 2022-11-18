package com.ansible.dev;

public class Numbers {
	public int num1;
	public int num2;
	public String fun;

	public Numbers() {
	}

	@Override
	public String toString() {
		return "Numbers [num1=" + num1 + ", num2=" + num2 + ", fun=" + fun + "]";
	}

	public int getNum1() {
		return num1;
	}

	public Numbers(int num1, int num2, String fun) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.fun = fun;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public String getFun() {
		return fun;
	}

	public void setFun(String fun) {
		this.fun = fun;
	}

}
