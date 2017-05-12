import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MinMaxCiclomatica {
	
private MinMax m;
	
	@Before
	public void setUp(){
		m=new MinMax();
	}
	
	@Test
	public void C1(){
		assertNull(m.minMax(null));
	}
	
	@Test
	public void C2(){
		int a[]={};
		assertNull(m.minMax(a));
	}
	@Test
	public void C3(){
		int a[]={1};
		int sol[]={1,1};
		assertArrayEquals(sol,m.minMax(a));
	}
	
	@Test
	public void C4(){
		int a[]={1,2};
		int sol[]={1,2};
		assertArrayEquals(sol,m.minMax(a));
	}
	
	@Test
	public void C5(){
		int a[]={1,0};
		int sol[]={0,1};
		assertArrayEquals(sol,m.minMax(a));
	}
	
	@Test
	public void C6(){
		int a[]={1,1};
		int sol[]={1,1};
		assertArrayEquals(sol,m.minMax(a));
	}

	/*
	  COMPLEJIDAD CICLOMATICA:
->V(G)= Aristas - Nodos + 2=16-12+2=6
->V(G)=P+1=5+1=6
->V(G)=Nº regiones en G=6

CAMINOS BASICOS:
->C1:a,b1,k
->C2:a,b1,b2,k
->C3:a,b1,b2,c,d,k
->C4:a,b1,b2,c,d,e,f,g,j,d,k
->C5:a,b1,b2,c,d,e,f,h,i,j,d,k
->C6:a,b1,b2,c,d,e,f,h,j,d,k
	 * 
	 */
	 
}
