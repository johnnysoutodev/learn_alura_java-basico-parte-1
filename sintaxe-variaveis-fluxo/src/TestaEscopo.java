
public class TestaEscopo {
	
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais!");
		int idade = 18;
		int quantidadePessoa = 3;
//		boolean acompanhado = quantidadePessoa >= 2;
		
		boolean acompanhado;
		if(quantidadePessoa >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
			}
		
		if(idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
			}
	}

}
