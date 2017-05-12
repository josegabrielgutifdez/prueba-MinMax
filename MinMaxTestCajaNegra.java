import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MinMaxTestCajaNegra {
	
	private MinMax m;
	
	@Before
	public void setUp(){
		m=new MinMax();
	}
	
	@Test
	public void ArrayVacio()  {
		int array[]={};
		assertNull(m.minMax(array));
	}
	
	@Test
	public void SoloUnElementoEnArray() {
		int array[]={1};
		int sol[]={1,1};
		assertArrayEquals(sol,m.minMax(array));
	}
	
	@Test
	public void ArrayConElementoUnicoRepetido()  {
		int array[]={1,1,1,1,1};
		int sol[]={1,1};
		assertArrayEquals(sol,m.minMax(array));
	}
	
	@Test 
	public void ArrayConElementosDiferentesPositivos(){
		int array[]={2,1,4,3};
		int sol[]={1,4};
		assertArrayEquals(sol,m.minMax(array));
	}
	
	@Test
	public void ArrayConElementosDiferentesNegativos(){
		int array[]={-2,-1,-4,-3};
		int sol[]={-4,-1};
		assertArrayEquals(sol,m.minMax(array));
	}
	
	@Test
	public void ArrayConElementosDiferentesPositivosYNegativos() {
		int array[]={-1,-2,2,1};
		int sol[]={-2,2};
		assertArrayEquals(sol,m.minMax(array));
	}
	
	
	
	

}
