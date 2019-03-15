import java.util.Scanner;

public class calcfarenheit{
	public static void main(String[] args) {
		
	double celsius;
	double farenheit;
	
	System.out.println("Digite o grau em celsius ");
	Scanner sc =  new Scanner (System.in);
	celsius = sc.nextDouble();
	
	farenheit = (celsius * 1.8) + 32;
	System.out.println("A temperatura em farenheit e: " + farenheit);	
		
		
	}
		
}