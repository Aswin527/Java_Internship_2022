package com.demo.muti;

public class SleepDemo {

	public static void main(String[] args) {
		Thread t=new ThreadDemo();
		t.start();
		try {
		t.sleep(100);
		}catch(Exception e) {
			System.out.println(e);
		}
		for(int i=0;i<20;i++) {
			System.out.println(i);
		}
	}
}


class ThreadDemo extends Thread{
	@Override
	public void run() {
		for(char i='a';i<='z';i++) {
			System.out.println(i);
		}
	}
	
}
