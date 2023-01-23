package com.test.basic;

public class test {

	public static void main(String[] args) {
		
		System.out.println("xyz");
		test x=new test();
		x.display();
		x.getData();
		x.putData(10,10);
		
		
		// TODO Auto-generated method stub

	}
	public void display() {
		System.out.println("disp");
	}
	public int getData() {
		return 10;
	}
	public void putData(int n,int m) {
		System.out.println(n+m);
	}

}
