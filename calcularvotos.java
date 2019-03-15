import java.util.Scanner;



public class calcularvotos{
	public static void main(String[] args) {
	
	double votosTotais;
	double votosNulos;
	double votosValidos;
	double porcentagem;
	
	System.out.println("Digite os votos totais ");
	Scanner sc = new Scanner (System.in);
	votosTotais = sc.nextDouble();
	
	System.out.println("Digite os votos nulo e em branco");
	votosNulos = sc.nextDouble();
	
	votosValidos = votosTotais - votosNulos;
	
	porcentagem = (votosValidos / votosTotais) * 100;
	System.out.println("A porcentagem de votos validos e de: " + porcentagem + "%");		
		
	}
	
}