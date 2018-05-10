import java.security.SecureRandom;

public class Frequencia {

	public static void main(String[] args) {

		SecureRandom random = new SecureRandom();

		int valor1 = 0;
		int valor2 = 0;
		int valor3 = 0;
		int valor4 = 0;
		int valor5 = 0;
		int valor6 = 0;

		for (int i = 1; i <= 6000000; i++) {

			int resultado = 1 + random.nextInt(6);

			switch (resultado) {
			case 1:
				valor1++;
				break;
			case 2:
				valor2++;
				break;
			case 3:
				valor3++;
				break;
			case 4:
				valor4++;
				break;
			case 5:
				valor5++;
				break;
			case 6:
				valor6++;
				break;
			}
		}
		
		System.out.println("Valor\tFrequencia");
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", valor1,valor2,valor3,valor4,valor5,valor6);
	}
}
