import java.io.BufferedReader;
import java.io.InputStreamReader;



		public class fila {

		    public static void main (String args[])throws Exception{
		    	
		    	//Declaração de variáveis
		    	String leitor = "";
		    	BufferedReader ler = (new BufferedReader( new InputStreamReader(System.in)));
		    	int fila[] = new int [5];
		    	int opcao;
		    	
		    	do {    	
		    	System.out.println("O que vc quer? (1 novo elemento / 2 mostrar fila / 3 saida)");
		    	opcao = Integer.parseInt(ler.readLine());
		    	
		    	switch (opcao) {
		    	case 1:
		    		System.out.println("Digite o numero para entrar na fila");
		    		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		    		for (int i = 3; i >= 0; i--) {
		    			fila[i+1] = fila[i];
		    		}
		    		fila[0] = Integer.parseInt(leitor);
		    		break;
		    		
		    	case 2:
		    		for (int i = 0; i < 5; i++) {
		    			System.out.println(fila[i] + " ");
		    		
		    		}
		    		System.out.println("");
		    		break;
		    	
		    	}
		    	
		    	}while(opcao < 3);
		    	
		  }
		    
		}
