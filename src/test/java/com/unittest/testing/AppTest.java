package com.unittest.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
	fahrenheit object;
	@Before
	public void newClassfahrenheit() {
		object = new fahrenheit();
	}
	
	@Test
	public void testResult0input0() {
		double input = 0;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult1input1() {
		double input = 1;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultNegative1inputNegative1() {
		double input = -1;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult499input499() {
		double input = 499;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
 	@Test
	public void testResult837inputNegative499() {
		double input = 499;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult500input500() {
		double input = 500;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultNegative500inputNegative500() {
		double input = -500;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult501input501() {
		double input = 501;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultNegative501inputNegative501() {
		double input = -501;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult999input999() {
		double input = 999;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultNegative999inputNegative999() {
		double input = -999;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult1000input1000() {
		double input = 1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultNegative1000inputNegative1000() {
		double input = -1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void testResult1001input1001() {
		double input = 1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultNegative1001inputNegative1001() {
		double input = -1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult1010input1010() {
		double input = 1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultNegative1010inputNegative1010() {
		double input = -1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult2000input2000() {
		double input = 2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultNegative2000inputNegative2000() {
		double input = -2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}

		@Test
		public void testResult00input00() {
			double input = 0;
			double expected =0;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult01input01() {
			double input = 1;
			double expected =1;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult00inputNegative01() {
			double input = -1;
			double expected = -1;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult0input499() {
			double input = 499;
			double expected = 499;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult499inputNegative499() {
			double input = -499;
			double expected = -499;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult0input500() {
			double input = 500;
			double expected = 500;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult0inputNegative500() {
			double input = -500;
			double expected = -500;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult0input501() {
			double input = 501;
			double expected = 501;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult0inputNegative501() {
			double input = -501;
			double expected = -501;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult0input999() {
			double input = 999;
			double expected = 999;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult0inputNegative999() {
			double input = -999;
			double expected = -999;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult0input1001() {
			double input = 1001;
			double expected = 1001;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult0inputNegative1001() {
			double input = -1001;
			double expected = -1001;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult0input1010() {
			double input = 1010;
			double expected = 1010;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult0input2000() {
			double input = 2000;
			double expected = 2000;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult2000inputNegative2000() {
			double input = -2000;
			double expected = -2000;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		//////////////////////////////////////////////////////////////////////////////
//		@Test
//		public void testResult32calculateFrominput0() {
//			double input = 0;
//			String expected = "";
//			object.input(input);
//			double actual = object.calculate();
//			assertEquals(expected,actual,2);
//		}
//		@Test
//		public void testResult32calculateFrominput1() {
//			double input = 1;
//			double expected = 33.8;
//			object.input(input);
//			double actual = object.calculate();
//			assertEquals(expected,actual,2);
//		}
//		@Test
//		public void testResult32calculateFrominputNegative1() {
//			double input = -1;
//			double expected = -30.2;
//			object.input(input);
//			double actual = object.calculate();
//			assertEquals(expected,actual,2);
//		}
//		@Test
//		public void testResult32calculateFrominputNegative1() {
//			double input = -1;
//			double expected = -30.2;
//			object.input(input);
//			double actual = object.calculate();
//			assertEquals(expected,actual,2);
//		}
//		
//		
//		
//		
//		
//		
//		@Test
//		public void testResult32calculateFrominput1000() {
//			double input = 1000;
//			double expected = 1832;
//			object.input(input);
//			double actual = object.calculate();
//			assertEquals(expected,actual,2);
//		}
//		@Test
//		public void testResult32calculateFrominputNegative1000() {
//			double input = -1000;
//			double expected = -1768;
//			object.input(input);
//			double actual = object.calculate();
//			assertEquals(expected,actual,2);
//		}
//		
		
		
		////////////////////////////////////////////////////////////
		public void testResultMessageOutputcalculateFrominput0() {
			double input = 0;
			String expected = "0 celcius = 0 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominput1() {
			double input = 1;
			String expected = "1 celcius = 33.8 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominputNegative1() {
			double input = -1;
			String expected = "-1 celcius = 30.2 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominput499() {
			double input = 499;
			String expected = "499 celcius = 930.2 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominputNegative499() {
			double input = -499;
			String expected = "-499 celcius = -866.2 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominput500() {
			double input = 500;
			String expected = "500 celcius = 932 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominputNegative500() {
			double input = -500;
			String expected = "-500 celcius = -868 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominput501() {
			double input = 501;
			String expected = "501 celcius =  933.8fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominputNegative501() {
			double input = -501;
			String expected = "-501 celcius = -869.8 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominput999() {
			double input = 999;
			String expected = "999 celcius = 1830.2 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominputNegative999() {
			double input = -999;
			String expected = "-999 celcius = -1766.2 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}

		
		public void testResultMessageOutputcalculateFrominput1000() {
			double input = 1000;
			String expected = "1000 celcius = 1832 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominputNegative1000() {
			double input = -1000;
			String expected = "-1000 celcius = -1768 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominput1001() {
			double input = 1001;
			String expected = "1001 celcius = 1833.8 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominputNegative1001() {
			double input = -1001;
			String expected = "-1001 celcius = -1769.8 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominput1010() {
			double input = 1010;
			String expected = "1010 celcius = 1850 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominputNegative1010() {
			double input = -1010;
			String expected = "-1010 celcius = -1786 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominput2000() {
			double input = 2000;
			String expected = "2000 celcius = 3632 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		public void testResultMessageOutputcalculateFrominputNegative2000() {
			double input = -2000;
			String expected = "-2000 celcius = -3568 fahrenheit";
			object.input(input);
			String actual = object.toString();
			assertEquals(expected,actual);
		}
}
