import java.security.SecureRandom;

public class Craps {

	private static final SecureRandom secureRandom = new SecureRandom();

	private enum Status {
		CONTINUE, VENCEU, PERDEU
	};

	public static void main(String[] args) {

		Status gameStatus;
		int somaDosDados = rolarDados();
		int minhaSoma = somaDosDados;
		
		switch (somaDosDados) {

			case 7:
			case 11:
				gameStatus = Status.VENCEU;
				System.out.printf("Você venceu. Resultado obtido %d%n",somaDosDados);
				break;
	
			case 2:
			case 3:
			case 12:
				gameStatus = Status.PERDEU;
				System.out.printf("Você Perdeu. Resultado obtido %d%n",somaDosDados);
				break;
	
			default:
				gameStatus = Status.CONTINUE;
				minhaSoma = somaDosDados;
				break;
		}
		
		while (gameStatus == Status.CONTINUE) {
			
			somaDosDados = rolarDados();
			
			if (somaDosDados == minhaSoma) {
				gameStatus = Status.VENCEU;
				System.out.printf("Você venceu. Resultado obtido %d%n",somaDosDados);
			}
			else if (somaDosDados == 7) {
				gameStatus = Status.PERDEU;
				System.out.printf("Você Perdeu. Resultado obtido %d%n",somaDosDados);
			}
		}
	}

	public static int rolarDados() {

		int dado1 = 1 + secureRandom.nextInt(6);
		int dado2 = 1 + secureRandom.nextInt(6);
		System.out.printf("Rolando dados: %n");
		System.out.printf("Dado 1: %d%n", dado1);
		System.out.printf("Dado 2: %d%n", dado2);
		System.out.printf("Soma: %d%n", dado1 + dado2);
		System.out.printf("------- %n");
		
		return dado1 + dado2;
	}

}
