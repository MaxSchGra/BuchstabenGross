package de.hfu.BuchstabenGross;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(value = Parameterized.class)
public class UtilTest {

	private int para1;
	private boolean soll;
	
	public UtilTest(int soll, int para1)
	{
		this.para1 = para1;
		
		if(soll==1)
			this.soll = true;
		else 
			this.soll = false;
	}
	

	
	@Parameters
	public static Collection<Integer[]> daten()
	{
		return Arrays.asList(new Integer[][] {
				{1, 1},
				{1, 2},
				{1, 3},
				{1, 4},
				{1, 5},
				{1, 6},
				{0, 7},
				{0, 8},
				{0, 9},
				{0, 10},
				{0, 11},
				{0, 12}
		});
	}
	
	@Test
	public void test() {
		assertEquals(soll , Util.istErstesHalbjahr(para1));
	}
	
	// Neue Testklasse sonst wird es jedes mal ausgeführt
	@Test(expected=IllegalArgumentException.class, timeout=1000)
	public void testUtilIllegal1() {
		Util.istErstesHalbjahr(13);
	}
	
	// Neue Testklasse sonst wird es jedes mal ausgeführt
	@Test(expected=IllegalArgumentException.class, timeout=1000)
	public void testUtilIllegal2() {
		Util.istErstesHalbjahr(-1);
	}
}
