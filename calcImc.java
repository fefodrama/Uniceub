import java.io.BufferedReader;
import java.io.InputStreamReader;

public class calcImc{
	public static void main(String[] args) throws Exception {
	
		
	float peso;
	float altura;
	float IMC;
	String lerPeso = "";
	String lerAltura = "";	
		
	System.out.println("Digite seu peso ");
	lerPeso = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	peso = Float.parseFloat(lerPeso);
		
		
		
	System.out.println("Digite sua altura ");
	lerAltura = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	altura = Float.parseFloat(lerAltura);
	
	IMC = peso / (altura * altura);
	
	System.out.println("Seu imc e " +IMC);
		
	}
	
}
