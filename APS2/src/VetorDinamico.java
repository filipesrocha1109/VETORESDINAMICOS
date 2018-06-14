
public interface VetorDinamico {

	public void insereValorFinal(int valor);

	public void insereValorInicio(int valor);

	public void insereValorPosicao(int indice, int valor);

	public void retornaIndice(int indice); 

	public void adicionaIndice(int indice, int valor);

	public void removeFinal();

	public void removeInicio();

	public void remove(int indice);

	public int tamanhoVetor();

	public int capacidade();

	public boolean isEmpty();

	public void adicionaEspaco();
}
}
