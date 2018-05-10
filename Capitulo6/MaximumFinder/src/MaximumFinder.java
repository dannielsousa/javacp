import java.util.Scanner;

public class MaximumFinder {

	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entre com 3 valores separados por espaço: ");
		
		double valor1 = in.nextDouble();
		double valor2 = in.nextDouble();
		double valor3 = in.nextDouble();
		
		
		
		double resultado = maximo(valor1, valor2, valor3);
		
		System.out.println(resultado);
	}

	public static double maximo(double valor1, double valor2, double valor3){
		
		double maximo = valor1;
		
		if (valor2 > maximo) {
			maximo = valor2;
		}
		if (valor3 > maximo) {
			maximo = valor3;
		}
		return maximo;
	};
}
