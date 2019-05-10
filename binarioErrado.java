import java.io.BufferedReader;
import java.io.InputStreamReader;


		public class fila {

		    public static void main (String args[])throws Exception{
		    	
		    	//Declaração de variáveis
		    	String leitor = "";
		    	int numero;
		    	BufferedReader ler = (new BufferedReader( new InputStreamReader(System.in)));
		    	System.out.println("Digite o numero");
		    	numero = Integer.parseInt(ler.readLine());
		    	
		    	do {
		    		int res = numero % 2;
		    		numero = numero / 2;
		    		System.out.println(res);
		    	}while (numero > 0);
		   
		    	
		  }
		    
		}

		


