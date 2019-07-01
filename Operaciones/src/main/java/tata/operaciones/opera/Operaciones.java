package tata.operaciones.opera;

public class Operaciones {
	
	public int sumar(int a, int b) {
		return (a==0 || b==0)?0:a+b;
		//si a es o b es 0 retorna 0 si no a+b
	}

	public int restar(int a, int b) {
		return (b>a)?0:a-b;
		//si b es mayor que a retorno 0 si no a-b
	}
	
	public int multiplicar(int a, int b) {
		return (b==0)?1:a*b;
		//si b es igual a 0 retorna 0 si no a*b
	}
	
	public double dividir(double a, int b) {
		return (b==0)?0:a/b;
		//si b es igual a 0 retorna 0 si no a/b
	} 
	
	
	
}
