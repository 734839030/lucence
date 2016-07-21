package com.bf.lucence;

import org.junit.Test;

public class TestException {

	public void t1(){
		throw new RuntimeException("1");
	}
	@Test
	public void t2(){
		try {
			this.t1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
