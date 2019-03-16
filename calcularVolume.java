import java.io.BufferedReader;
import java.io.InputStreamReader;


public class calcVolume{
	public static void main(String[] args) throws Exception {
		
	double volume;
	double pi = 3.14;
	double raio;
	double altura;
	double capacidade;
	String lerRaio = "";
	String lerAltura = "";
	
	System.out.print("Digite a medida do raio em metros: ");
	lerRaio = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	raio = Double.parseDouble(lerRaio);
		
	System.out.print("Digite a medida da altura em metros: ");
	lerAltura = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	altura = Double.parseDouble(lerAltura);
	
	volume = pi * (raio * raio) * altura;	
	System.out.println("O volume e: " + volume + "m³");
	
	capacidade = volume * 1000;
	System.out.print("A capacidade desse volume e de: " + capacidade + " litros" );
	
		}
	}
	
