import java.util.Scanner;

public class calcImc{
	public static void main(String[] args) {
		
	float peso;
	float altura;
	float IMC;
	
	System.out.println("Digite seu peso ");
	Scanner sc = new Scanner (System.in);
	peso = sc.nextFloat();
	System.out.println("Digite sua altura ");
	altura = sc.nextFloat();
	
	IMC = peso / (altura * altura);
	
	System.out.println("Seu imc e " +IMC);
		
	}
	
}