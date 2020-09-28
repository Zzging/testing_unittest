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
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult1input1() {
		double input = 1;
		boolean expected = true;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultNegative1inputNegative1() {
		double input = -1;
		boolean expected = true;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult499input499() {
		double input = 499;
		boolean expected = true;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	
 	@Test
	public void testResult837inputNegative499() {
		double input = 499;
		boolean expected = true;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult500input500() {
		double input = 500;
		boolean expected = true;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultNegative500inputNegative500() {
		double input = -500;
		boolean expected = true;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult501input501() {
		double input = 501;
		boolean expected = true;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultNegative501inputNegative501() {
		double input = -501;
		boolean expected = true;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult999input999() {
		double input = 999;
		boolean expected = true;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultNegative999inputNegative999() {
		double input = -999;
		boolean expected = true;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult1000input1000() {
		double input = 1000;
		boolean expected = true;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultNegative1000inputNegative1000() {
		double input = -1000;
		boolean expected = true;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void testResult1001input1001() {
		double input = 1001;
		boolean expected = false;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultNegative1001inputNegative1001() {
		double input = -1001;
		boolean expected = false;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult1010input1010() {
		double input = 1010;
		boolean expected = false;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultNegative1010inputNegative1010() {
		double input = -1010;
		boolean expected = false;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResult2000input2000() {
		double input = 2000;
		boolean expected = false;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testResultNegative2000inputNegative2000() {
		double input = -2000;
		boolean expected = false;
		boolean actual = object.isBoumd(input);
		assertEquals(expected,actual);
	}

//		@Test
//		public void testResult0input0() {
//			double input = 0;
//			double expected =0;
//			double actual = object.input(input);
//			assertEquals(expected,actual);
//		}
//		@Test
//		public void testResult0input1() {
//			double input = 1;
//			double expected =33.8;
//			double actual = object.input(input);
//			assertEquals(expected,actual);
//		}
//		@Test
//		public void testResult0inputNegative1() {
//			double input = -1;
//			double expected = 30.2;
//			double actual = object.input(input);
//			assertEquals(expected,actual);
//		}
//		@Test
//		public void testResult0input499() {
//			double input = 499;
//			double expected = 930.2;
//			double actual = object.input(input);
//			assertEquals(expected,actual);
//		}
////		@Test
////		public void testResult837inputNegative499() {
////			double input = 499;
////			double expected = -837.2;
////			double actual = object.input(input);
////			assertEquals(expected,actual);
////		}
//		@Test
//		public void testResult0input500() {
//			double input = 500;
//			double expected = 932;
//			double actual = object.input(input);
//			assertEquals(expected,actual);
//		}
//		@Test
//		public void testResult0inputNegative500() {
//			double input = -500;
//			double expected = -868;
//			double actual = object.input(input);
//			assertEquals(expected,actual);
//		}
//		@Test
//		public void testResult0input501() {
//			double input = 501;
//			double expected = 933.8;
//			double actual = object.input(input);
//			assertEquals(expected,actual);
//		}
//		@Test
//		public void testResult0inputNegative501() {
//			double input = -501;
//			double expected = -869.8;
//			double actual = object.input(input);
//			assertEquals(expected,actual);
//		}
//		@Test
//		public void testResult0input999() {
//			double input = 999;
//			double expected = 1830.2;
//			double actual = object.input(input);
//			assertEquals(expected,actual);
//		}
//		@Test
//		public void testResult0inputNegative999() {
//			double input = -999;
//			double expected = -1766.2;
//			double actual = object.input(input);
//			assertEquals(expected,actual);
//		}
//		@Test
//		public void testResult0input1001() {
//			double input = 1001;
//			double expected = 1833.8;
//			double actual = object.input(input);
//			assertEquals(expected,actual);
//		}
//		@Test
//		public void testResult0inputNegative1001() {
//			double input = -1;
//			double expected = -1769.8;
//			double actual = object.input(input);
//			assertEquals(expected,actual);
//		}
//		@Test
//		public void testResult0input1010() {
//			double input = 1010;
//			double expected = 1850;
//			double actual = object.input(input);
//			assertEquals(expected,actual);
//		}
//		@Test
//		public void testResult0input2000() {
//			double input = 2000;
//			double expected = 3632;
//			double actual = object.input(input);
//			assertEquals(expected,actual);
//		}
//		@Test
//		public void testResult0inputNegative2000() {
//			double input = -2000;
//			double expected = -3568;
//			double actual = object.input(input);
//			assertEquals(expected,actual);
//		}
//	}	
}
