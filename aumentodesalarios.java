import java.io.BufferedReader;
import java.io.InputStreamReader;

public class aumentodesalarios{
	public static void main (String[] args)throws Exception {
		int cargo;
		String leitor = "";
		
		double atual, novo;
		
	System.out.println("==========Programa de aumento de salario de classes diferentes==========\n");	
	System.out.println("Digite o numero correspondente do seu cargo:\n 1 - Gerente\n 2 - Supervisor\n 3 - Funcionario");
	
		System.out.println("Digite seu cargo");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		cargo = Integer.parseInt(leitor);
		
		System.out.println("Digite o seu salario atual");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		atual = Double.parseDouble(leitor);
		
		switch(cargo) {
		
		case 1:
			novo =  (atual * 0.10) + atual;
			System.out.println("Cargo de Gerente\n");
			System.out.println("Aumento de 10%");
			System.out.println("Novo salario: " + novo);
			break;
			
		case 2:
			novo = (atual * 0.15) + atual;
			System.out.println("Cargo de supervisor\n");
			System.out.println("Aumento de 15%");
			System.out.println("Novo salario: " + novo);
			break;
			
		case 3:
			novo = (atual * 0.20) + atual;
			System.out.println("Cargo de funcionario\n");
			System.out.println("Aumento de 20%");
			System.out.println("Novo salario: " + novo);
			break;
		
		
		}				
		
	}
	
}
