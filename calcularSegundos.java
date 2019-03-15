import java.util.Scanner;

public class calcularSegundos{
	public static void main(String[] args) {
		
	double segundos;
	System.out.println("Digite os segundos");
	Scanner sc = new Scanner (System.in);
	segundos = sc.nextDouble();
	
	System.out.println(segundos + " segundos sao: " + segundos / 60 + " minutos, " + segundos / 3600 + " horas, " + segundos / 86400 + " dias" );
		
		
		
	}
	
}