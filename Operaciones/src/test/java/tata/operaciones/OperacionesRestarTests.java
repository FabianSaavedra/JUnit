package tata.operaciones;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.operaciones.opera.Operaciones;

public class OperacionesRestarTests {

	private Operaciones ope;
	@Before
	public void setUp() throws Exception {
		this.ope= new Operaciones();
	}

	@Test
	public void elResultadoDe15menos5es10() {
		int resultado=this.ope.restar(15, 5);
		assertTrue("Deberia ser 10 pero es"+resultado, resultado==10);
	}
	@Test
	public void cuandoBesMayorQueAentonces0() {
		int resultado=this.ope.restar(15, 20);
		assertTrue("Cuando 20 es maoy que 15"+resultado,resultado==0);
	}
	@Test
	public void cuandoMaxmenosMaxEntonces0() {
		int resultado=this.ope.restar(Integer.MAX_VALUE, Integer.MAX_VALUE);
		assertTrue("La resta de de maximos"+resultado,resultado==0);
	}
	@Test
	public void cunadoMinmenosMaxEntonces0() {
		int resultado=this.ope.restar(Integer.MIN_VALUE,Integer.MAX_VALUE);
		assertTrue("La resta entre em min y el max"+resultado,resultado==0);
	}

}
