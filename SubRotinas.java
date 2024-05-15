
public class SubRotinas {
	public static void main(String[] args) { // MAIN: é uma sub-rotina.
		// voide: procedimento, nao tem retorno.

		int resultado = fatorial(5);
		System.out.println(resultado);
	}

	public static int soma(int primeiroValor, int segundoValor) {
		// int: procedimento // (): parametros sao variaveis.

		int resultado = primeiroValor + segundoValor;
		return resultado;
	}

	public static int exponenciacao(int valor, int expoente) {
		int resultado = 1;

		for (int i = 0; i < expoente; i++) {
			resultado *= valor;

		}

		return resultado;

	}
	
	public static int fatorial(int valor) {
		
		int resultado = 1;
		for(int i = valor; i > 1; i-- ) {
			resultado *= i;
		}
		return resultado;
		
	}

}
