package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(4, 0, 1);
    	assertEquals(0, a);
    	int b = hw.Method3(4, 0, -1);
    	assertEquals(0, b);
    	int c = hw.Method3(6, -1, 1);
    	assertEquals(0, c);
        int d = hw.Method3(6, -1, -1);
    	assertEquals(0, d);
        int e = hw.Method3(6, 1, 1);
    	assertEquals(0, e);
        int f = hw.Method3(6, 1, -1);
    	assertEquals(0, f);
        int g = hw.Method3(4, 0, -3);
    	assertEquals(0, g);
        int h = hw.Method3(6, 0, -3);
    	assertEquals(0, h);	
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0, 0, 0, 0, 0);
        assertEquals(0, a);
        int b = hw.Method4(1, 1, 0, 0, 0);
        assertEquals(0, b);
        int c = hw.Method4(1, 2, 1, 2, 0);
        assertEquals(0, c);
        int d = hw.Method4(5, 0, 1, 1, 0);
        assertEquals(0, d);
        int e = hw.Method4(1, 0, 1, 1, 0);
        assertEquals(0, e);
    }

    @Test
    public void testBug() {
    	HelloWorld hw = new HelloWorld();
    	boolean a = hw.bug(5);
    	assertEquals(true, a);
    	boolean b = hw.bug(4);
    	assertEquals(false, b);
    }

    @Test
    public void testIsTriangle() {
    	HelloWorld hw = new HelloWorld();
    	boolean a = hw.isTriangle(1, 1, 1);
    	assertEquals(true, a);
    	boolean b = hw.isTriangle(1, 1, 2);
    	assertEquals(false, b);
    	boolean c = hw.isTriangle(2, 1, 1);
    	assertEquals(false, c);
        boolean d = hw.isTriangle(1, 2, 1);
    	assertEquals(false, d);
    }

    @Test
    public void testMiniCalculator() {
    	HelloWorld hw = new HelloWorld();
    	double a = hw.miniCalculator(9, 3, '+');
    	assertEquals(12.0, a, 0);
    	double b = hw.miniCalculator(9, 3, '-');
    	assertEquals(6.0, b, 0);
    	double c = hw.miniCalculator(9, 3, '*');
    	assertEquals(27.0, c, 0);
        double d = hw.miniCalculator(9, 3, '/');
    	assertEquals(3.0, d, 0);
        double e = hw.miniCalculator(9, 3, '1');
    	assertEquals(0.0, e, 0);
    }

    @Test
    public void testIsBirthday() {
    	HelloWorld hw = new HelloWorld();
    	boolean ymin = hw.isBirthday(1, 1, 1);
    	assertEquals(false, ymin);
    	boolean ymax = hw.isBirthday(2222, 1, 1);
    	assertEquals(false, ymax);
    	boolean y2019 = hw.isBirthday(2019, 10, 10);
    	assertEquals(false, y2019);
        boolean mmin = hw.isBirthday(2019, -1, 1);
    	assertEquals(false, mmin);
        boolean mmax = hw.isBirthday(2018, 13, 1);
    	assertEquals(false, mmax);
        boolean dmin = hw.isBirthday(2019, 1, -1);
    	assertEquals(false, dmin);
        boolean dmax1 = hw.isBirthday(2018, 1, 32);
    	assertEquals(false, dmax1);
        boolean dmax3 = hw.isBirthday(2018, 3, 32);
    	assertEquals(false, dmax3);
        boolean dmax5 = hw.isBirthday(2018, 5, 32);
    	assertEquals(false, dmax5);
        boolean dmax7 = hw.isBirthday(2018, 7, 32);
    	assertEquals(false, dmax7);
        boolean dmax8 = hw.isBirthday(2018, 8, 32);
    	assertEquals(false, dmax8);
        boolean dmax10 = hw.isBirthday(2018, 10, 32);
    	assertEquals(false, dmax10);
        boolean dmax12 = hw.isBirthday(2018, 12, 32);
    	assertEquals(false, dmax12);
        boolean d1 = hw.isBirthday(2018, 1, 31);
    	assertEquals(true, d1);
        boolean d3 = hw.isBirthday(2018, 3, 31);
    	assertEquals(true, d3);
        boolean d5 = hw.isBirthday(2018, 5, 31);
    	assertEquals(true, d5);
        boolean d7 = hw.isBirthday(2018, 7, 31);
    	assertEquals(true, d7);
        boolean d8 = hw.isBirthday(2018, 8, 31);
    	assertEquals(true, d8);
        boolean d10 = hw.isBirthday(2018, 10, 31);
    	assertEquals(true, d10);
        boolean d12 = hw.isBirthday(2018, 12, 31);
    	assertEquals(true, d12);
        boolean dmax4 = hw.isBirthday(2018, 4, 31);
    	assertEquals(false, dmax4);
        boolean dmax6 = hw.isBirthday(2018, 6, 31);
    	assertEquals(false, dmax6);
        boolean dmax9 = hw.isBirthday(2018, 9, 31);
    	assertEquals(false, dmax9);
        boolean dmax11 = hw.isBirthday(2018, 11, 31);
    	assertEquals(false, dmax11);
        boolean d4 = hw.isBirthday(2018, 4, 30);
    	assertEquals(true, d4);
        boolean d6 = hw.isBirthday(2018, 6, 30);
    	assertEquals(true, d6);
        boolean d9 = hw.isBirthday(2018, 9, 30);
    	assertEquals(true, d9);
        boolean d11 = hw.isBirthday(2018, 11, 30);
        assertEquals(true, d11);
        boolean dmax29 = hw.isBirthday(2000, 2, 30);
    	assertEquals(false, dmax29);
        boolean dmax28 = hw.isBirthday(2001, 2, 29);
    	assertEquals(false, dmax28);
        boolean d29 = hw.isBirthday(2000, 2, 29);
    	assertEquals(true, d29);
        boolean d28 = hw.isBirthday(2001, 2, 28);
    	assertEquals(true, d28);	
    }
}
