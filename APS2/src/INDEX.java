
public class INDEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vetor a;
		a = new Vetor();
		a.insereValorFinal(2);
		a.insereValorInicio(1);
		a.insereValorFinal(3);
		a.insereValorFinal(4);
		// a.inserePosicao(3,7);
		a.removeInicio();
		a.insereValorPosicao(3, 6);
		a.retornaIndice(2);
		a.retornaIndice(2);

		

		System.out.println("Capacidade do vetor:" + a.capacidade());
		System.out.println("----------------------------------");

	}

}
