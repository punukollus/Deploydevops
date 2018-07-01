package com.devops.number;

import org.junit.*;


public class NumberWordsTest {
private NumberWordsTe numbrword;
	
	@Before
	public void setup() {
		numbrword=new NumberWordsTe();
	}

	/*@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numbrword.toWords( - 1) ) ;
	}*/
	
	@Test
	public void scenarioone() {
		Assert.assertEquals( "Success", "one hundred",numbrword.toWords(100) ) ;
	}

}
