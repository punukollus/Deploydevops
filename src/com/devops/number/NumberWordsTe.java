package com.devops.number;

import com.devops.number.NumberWords.DefaultProcessor;

public class NumberWordsTe {
	
	  public String toWords( int number ) {
	    	DefaultProcessor processor = new DefaultProcessor();
			String result = processor.getName(number) ;
			return result.trim() ;
		}

}
