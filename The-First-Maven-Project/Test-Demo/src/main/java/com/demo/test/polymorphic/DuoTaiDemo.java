package com.demo.test.polymorphic;

public class DuoTaiDemo {
	
	public static void main(String args[]) {
		Restaurant r = new Restaurant();
		r.meet(new Ming(), new MiXian());
		r.meet(new Hong(), new Chicken());
	}

}
