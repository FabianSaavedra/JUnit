package tata.operaciones;

import tata.operaciones.opera.Operaciones;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operaciones oper= new Operaciones();
		System.out.println("la suma de 15 + 20 es ="+oper.sumar(15, 20));
		System.out.println("la restar de 15 - 20 es ="+oper.restar(15, 20));
		System.out.println("la multiplicacion de 15 * 20 es ="+oper.multiplicar(15, 20));
		System.out.println("la divicion de 15 / 20 es ="+oper.dividir(15, 20));
		System.out.println("La suma de max + max"+oper.sumar(Integer.MAX_VALUE, Integer.MAX_VALUE));
		System.out.println("La resta de 15 - 20 es= "+oper.restar(15, 20));
		System.out.println("La resta de max - max es= "+oper.restar(Integer.MAX_VALUE, Integer.MAX_VALUE));
		System.out.println("La resta de min - max es= "+oper.restar(Integer.MIN_VALUE, Integer.MAX_VALUE));
		System.out.println("La multiplicacion de max*max es= "+oper.multiplicar(Integer.MAX_VALUE, Integer.MAX_VALUE));

	}

}
