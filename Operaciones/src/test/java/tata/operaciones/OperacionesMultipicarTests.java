package tata.operaciones;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import tata.operaciones.opera.Operaciones;

public class OperacionesMultipicarTests {

	private Operaciones ope;
	
	@Before
	public void setUp() throws Exception {
		this.ope=new Operaciones();
	}

	@Test
	public void cuandoAyBsonmayorACero() {
		int resultado=this.ope.multiplicar(10,10);
		assertTrue("Cuando 10*10 es "+resultado,resultado==100);
	}
	
	@Test
	public void cuandoBes0retrn1() {
		int resultado=this.ope.multiplicar(10, 0);
		assertTrue("Cuando 10*10 es "+resultado,resultado==1);
	}

	@Test
	public void cuandoAyBsonMaximos() {
		int resultado=this.ope.multiplicar(Integer.MAX_VALUE, Integer.MAX_VALUE);
}
}
