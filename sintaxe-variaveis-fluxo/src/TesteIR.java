
public class TesteIR {
	
	public static void main(String[] args) {
		
		System.out.println("Testando impostos do Leão!");
		
		double salario = 5400.0;
		
		if (salario > 4664.68) {
			System.out.println("Sua aliquota é de 27.5%");
			System.out.println("Você pode deduzir R$ 869,36 reais.");
			
		} else {
			if(salario >= 3751.06 ) {
				System.out.println("Sua aliquota é de 22.5%");
				System.out.println("Você pode deduzir R$ 636,13 reais.");
			}
			else {
				if(salario >= 2826.66) {
					System.out.println("Sua aliquota é de 15%");
					System.out.println("Você pode deduzir R$ 354,80 reais.");
				}
				else {
					if(salario >= 1903.99) {
						System.out.println("Sua aliquota é de 7,5%");
						System.out.println("Você pode deduzir R$ 142,80 reais.");
					}
					else {
						System.out.println("Você não precisa pagar imposto e não terá deduções.");
					}
				}
			}
		}
		
		
		/*
		if(salario <= 2600.0) {
			System.out.println("A sua aliquota é de 15%");
			System.out.println("Você pode deduzir até R$ 350");
		} else 
		
		if (salario <= 3700.0) {
			System.out.println("A sua aliquota é de 22.5%");
			System.out.println("Você pode deduzir R$ 636");
		}
		*/
	}

}
