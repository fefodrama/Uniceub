import java.io.BufferedReader;
import java.io.InputStreamReader;


public class trianguloAngulo{
	public static void main(String[] args)throws Exception{
		
	int angulo1, angulo2, angulo3;
	String lerAngulo1 = "";		
	String lerAngulo2 = "";		
	String lerAngulo3 = "";		
		
	System.out.print("Digite o primeiro angulo: ");	 
	lerAngulo1 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	angulo1 = Integer.parseInt(lerAngulo1);
	
	System.out.print("Digite o segundo angulo: ");	
	lerAngulo2 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	angulo2 = Integer.parseInt(lerAngulo2);
	
	System.out.print("Digite o terceiro angulo: ");	 
	lerAngulo3 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	angulo3 = Integer.parseInt(lerAngulo3);	
		
		
	if (angulo1 == angulo2 && angulo2 == angulo3 && angulo3 == angulo1) {
		System.out.println("Triangulo equilatero ");
		
	}
	else if(angulo1 != angulo2 && angulo1 == angulo3 || angulo2 != angulo1 && angulo2 == angulo3 || angulo1 != angulo3 && angulo1 == angulo2){
		System.out.println("O triangulo e isosceles");
		
	}
	else if (angulo1 != angulo2 && angulo1 != angulo3 && angulo2 != angulo3) {
	System.out.println("Triangulo escaleno");	
		
		
	}
	
	}
	
}