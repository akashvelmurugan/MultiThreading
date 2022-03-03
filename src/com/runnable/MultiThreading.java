package com.runnable;
class First implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}	
} 
class Second implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}
public class MultiThreading {
	public static void main(String[] args) {
		First first= new First();
		Second second= new Second();
		Thread firstThread= new Thread(first);
		Thread secondThread= new Thread(second);
		firstThread.start();
		secondThread.start();
	}
}

