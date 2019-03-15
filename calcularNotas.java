import java.util.Scanner;


public class calcularNotas{
	public static void main(String[] args) {
	
		double nota1, nota2, nota3, nota4, media;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a primeira nota");	
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota");	
		nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota");	
		nota3 = sc.nextDouble();
		System.out.println("Digite a quarta nota");	
		nota4 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A media das notas e: " + media);
		
	}
	
}