package com.demo.test.test;

public class RunnableTest {

	Runnable runnable1=new Runnable(){
		@Override
		public void run(){
		    System.out.println("Running without Lambda");
		}
	};
}
