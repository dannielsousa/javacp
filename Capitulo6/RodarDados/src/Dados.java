import java.security.SecureRandom;

public class Dados {

	public static void main (String[] args) {
		
		SecureRandom random = new SecureRandom();
		
		for (int i=1; i <= 20; i++) {

			int valor = 1 + random.nextInt(6);
			
			System.out.printf("%d ",valor);
			
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		
	}
}
