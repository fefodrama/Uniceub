import java.io.BufferedReader;
import java.io.InputStreamReader;

public class aumentodesalarios{
	public static void main (String[] args)throws Exception {
		int cargo;
		String leitor = "";
		
		double atual, novo;
		
	System.out.println("==========Programa de aumento de salario de classes diferentes==========\n");	
	System.out.println("Digite o numero correspondente do seu cargo:\n 1 - escritorio\n 2 - secretario\n 3 - caixa\n 4 - gerente\n 5 - diretor\n");
	
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		cargo = Integer.parseInt(leitor);
		
		System.out.println("Digite o seu salario atual");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		atual = Double.parseDouble(leitor);
		
		switch(cargo) {
		
		case 1:
			novo =  (atual * 0.50) + atual;
			System.out.println("Cargo de escritorio\n");
			System.out.println("Aumento de 50%");
			System.out.println("Novo salario: " + novo);
			break;
			
		case 2:
			novo = (atual * 0.35) + atual;
			System.out.println("Cargo de secretario\n");
			System.out.println("Aumento de 35%");
			System.out.println("Novo salario: " + novo);
			break;
			
		case 3:
			novo = (atual * 0.20) + atual;
			System.out.println("Cargo de caixa\n");
			System.out.println("Aumento de 20%");
			System.out.println("Novo salario: " + novo);
			break;
		
		case 4:
			novo = (atual * 0.10) + atual;
			System.out.println("Cargo de gerente\n");
			System.out.println("Aumento de 10%");
			System.out.println("Novo salario: " + novo);
			break;
			
		case 5:
			System.out.println("Cargo de diretor nao recebeu aumento");
			break;
		}				
		
	}
	
}
