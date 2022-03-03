package com.multithreading;




class First extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Second extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreading {
	public static void main(String[] args) throws InterruptedException {
		First first= new First();
		Second second= new Second();
		first.start();
		second.start();

		//		first.join();
		//		second.join();
		System.out.println("Welcome");
	}
}
