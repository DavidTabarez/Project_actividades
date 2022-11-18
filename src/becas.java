import java.util.Scanner;

public class becas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double promedio = 0;
		byte edad = 0; 
		
		System.out.println("Ingrese se edad: ");
		edad = entrada.nextByte();
		
		if (edad > 18) {
			
			System.out.println("Ingrese su promedio: ");
			promedio = entrada.nextDouble();
			if (promedio >= 9 || promedio == 10) {
				System.out.println("Tu beca es de $ 2000");
				
			} else if (promedio >= 7.5) {
				System.out.println("Tu beca es de $1000");
				
			} else if (promedio >= 6) {
				System.out.println("Tu beca es de $500");
				
			} else {
				System.out.println("estudien mas para el próximo ciclo escolar");
			}
		
			
		} else {
			
			System.out.println("Ingrese su promedio: ");
			promedio = entrada.nextDouble();
			if (promedio >= 9 || promedio == 10) {
				System.out.println("Tu beca es de $ 3000");
				
			} else if (promedio < 9 && promedio >= 8) {
				System.out.println("Tu beca es de $2000");
				
			} else if (promedio < 8 && promedio >= 6) {
				System.out.println("Tu beca es de $100");
				
			} else {
				System.out.println("estudien mas para el próximo ciclo escolar");
			}
			
		} // fin del if else

	}

}
