import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class MinMaxTestCajaBlanca {
	private MinMax m;
	private int nulo[]=null;
	private int vacio[]={};
	private int array[]={2,1,4,3};
	private int sol[]={1,4};
	
	@Before
	public void setUp(){
		m=new MinMax();
		
	}
	@Test
	public void statementCoverage() {
		assertArrayEquals(sol,m.minMax(array));
		
	}

	@Test
	public void decisionCoverage() {
		assertArrayEquals(sol,m.minMax(array));
		assertNull(m.minMax(vacio));
		
	}
	
	@Test
	public void conditionCoverage() {
		assertArrayEquals(sol,m.minMax(array));
		assertNull(m.minMax(vacio));
		assertNull(m.minMax(nulo));
	}
	
	@Test
	public void decisionConditionCoverage() {
		assertArrayEquals(sol,m.minMax(array));
		assertNull(m.minMax(vacio));
		assertNull(m.minMax(nulo));
	}
}
