import java.io.BufferedReader;
import java.io.InputStreamReader;

public class binarioDecimal {
	public static void main(String args[])throws Exception{
		BufferedReader ler = (new BufferedReader(new InputStreamReader(System.in)));
		double resultadoDecimal = 0;
		String leitor = "";
		System.out.println("Digite o numero");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		
		for (int i = 0; i < leitor.length(); i++) {
			//string aspas duplas
			//char aspas simples
			if (leitor.charAt(i) == '1') {
				resultadoDecimal = resultadoDecimal + Math.pow(2, leitor.length() - 1 - i);
			}
		}
		
		//saida de dados
		System.out.println("o numero decimal correspondente é " + resultadoDecimal);
		
	}

}
