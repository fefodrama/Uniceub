import java.io.BufferedReader;
import java.io.InputStreamReader;

public class calcImc{
	public static void main(String[] args) {
	
		
	float peso;
	float altura;
	float IMC;
	string lerPeso = "";
	string lerAltura = "";	
		
	System.out.println("Digite seu peso ");
	lerpeso = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	peso = Float.parseFloat(lerpeso);
		
		
		
	System.out.println("Digite sua altura ");
		
	IMC = peso / (altura * altura);
	
	System.out.println("Seu imc e " +IMC);
		
	}
	
}
