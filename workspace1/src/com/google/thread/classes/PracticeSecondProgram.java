package com.google.thread.classes;

public class PracticeSecondProgram extends Thread {

	public String Browser;

	public PracticeSecondProgram(String threadName, String Browser) {
		super(threadName);
		this.Browser = Browser;
	}

	public void Run() {
		System.out.println("Thread Started Data" + Thread.currentThread().getName());
		try {
			Practice practice = new Practice();
			practice.browser(Browser);
			practice.practData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
