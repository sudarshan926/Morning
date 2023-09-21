package com.defaults.interfaces;

public interface P1 {
	
	default Object m1() {
		System.out.println("This is  class P1-m1 Method");
		return null;
	}

}
