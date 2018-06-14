
public class Vetor implements VetorDinamico {
	int valores[];

	int contador;

	public Vetor() {
		valores = new int[1];
		contador = 0;
	}

	@Override
	public void insereValorFinal(int valor) {
		adicionaEspaco();
		valores[this.contador] = valor;
		contador++;
	}

	@Override
	public void insereValorInicio(int valor) {
		insereValorPosicao(0, valor);
	}

	@Override
	public void insereValorPosicao(int ind, int valor) {
		try {
			if (isIndexValid(ind)) {
				adicionaEspaco();

				moveFrente(ind);

				valores[ind] = valor;

				contador++;
			} else {

				System.out.println("Indice invalido, adicione indice para poder incluir valor");
				throw new ArrayIndexOutOfBoundsException();
			}
		} catch (Exception erro) {
			System.out.println();
		}
	}

	@Override
	public void retornaIndice(int ind) {
		if (isIndexValid(ind)) {
			System.out.println("int: " + valores[ind]);
		}

	}

	@Override
	public void adicionaIndice(int ind, int valor) {
		if (isIndexValid(ind)) {
			valores[ind] = valor;
		}

	}

	@Override
	public void removeFinal() {
		contador--;
	}

	private void moveTras(int index) {

		if (isIndexValid(index)) {
			for (int i = index + 1; i < contador; i++) {
				valores[i - 1] = valores[i];
			}
		}
	}

	@Override
	public void removeInicio() {
		int ini = 0;
		moveTras(ini);

	}

	@Override
	public void remove(int indice) {
		if (isIndexValid(indice)) {
			moveTras(indice);
			contador--;

		}

	}

	@Override
	public int tamanhoVetor() {
		return contador;

	}

	@Override
	public int capacidade() {
		return (valores.length - 1);

	}

	@Override
	public boolean isEmpty() {
		return (contador == 0);
	}

	@Override
	public void adicionaEspaco() {
		if (contador == valores.length - 1) {
			int aux[] = new int[valores.length * 2];
			for (int i = 0; i < valores.length; i++) {
				aux[i] = valores[i];
			}
			valores = aux;

		}

	}

	public void moveFrente(int index) {
		if (isIndexValid(index)) {

			for (int i = contador; i > index; i = i - 1) {
				valores[i] = valores[i - 1];
			}
		}
	}

	public boolean isIndexValid(int index) {
		return (index >= 0) && (index < contador);
	}

}
