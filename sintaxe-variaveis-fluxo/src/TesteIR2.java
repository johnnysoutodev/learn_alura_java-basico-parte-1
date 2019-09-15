
public class TesteIR2 {
	
	public static void main(String[] args) {

        double salario = 3300.0;
        boolean salarioBaixo = salario < 1900.0;
        
        if(salarioBaixo) {
        	System.out.println("Você não precisa pagar imposto de renda.");
        } else if(salario > 1900.0 && salario <= 2800.0) {
        	System.out.println("Você precisa pagar 7.5% de IR.");
        } else if (salario > 2800.0 && salario <= 3751.0) {
        	System.out.println("Você precisa pagar 15% de IR.");
        } else if(salario > 3751.0 && salario <= 4664.0) {
        	System.out.println("Você precisa pagar 22.5% de IR.");
        } else if(salario > 4664.0) {
        	System.out.println("Você precisa pagar 27.5% de IR.");
        }
    }

}
