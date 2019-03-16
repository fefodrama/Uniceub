import java.io.BufferedReader;
import java.io.InputStreamReader;


public class calcularvotos{
	public static void main(String[] args) throws Exception {
	
	double votosTotais;
	double votosNulos;
	double votosValidos;
	double porcentagem;
	String lerVotosTotais = "";
	String lerVotosNulos = "";
	
	System.out.println("Digite os votos totais ");
	lerVotosTotais = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	votosTotais = Double.parseDouble(lerVotosTotais);
	
	System.out.println("Digite os votos nulo e em branco");
	lerVotosNulos = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	votosNulos = Double.parseDouble(lerVotosNulos);
	
	
	votosValidos = votosTotais - votosNulos;
	
	porcentagem = (votosValidos / votosTotais) * 100;
	System.out.println("A porcentagem de votos validos e de: " + porcentagem + "%");		
		
	}
	
}
