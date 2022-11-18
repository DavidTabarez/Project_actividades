import java.util.Scanner;

public class venta_articulo_if_else {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		byte clave_articulo = 0;
		double materia_prima = 0;
		double mano_obra = 0;
		double gasto_fabricacion, costo_produccion = 0;
		double costo_porcentaje, precio_venta = 0, ganancia = 0;
		
		System.out.println("Ingrese clave articulo");
		System.out.println("Claves del 1 al 6: ");
		clave_articulo = entrada.nextByte();
		
		System.out.println("¨Precio de materia prima: ");
		materia_prima = entrada.nextDouble();
		
		if (clave_articulo > 6 || clave_articulo < 1) {
			System.out.println("Clave no valida");
			
		} else if (clave_articulo == 6) {
			mano_obra = (materia_prima * 0.85);
			gasto_fabricacion = (materia_prima * 0.35);
			costo_produccion = (materia_prima+mano_obra+gasto_fabricacion);
			costo_porcentaje = (costo_produccion * 0.45);
			precio_venta = (costo_produccion + costo_porcentaje);
			
		} else if (clave_articulo == 5) {
			mano_obra = (materia_prima * 0.80);
			gasto_fabricacion = (materia_prima * 0.30);
			costo_produccion = (materia_prima+mano_obra+gasto_fabricacion);
			costo_porcentaje = (costo_produccion * 0.45);
			precio_venta = (costo_produccion + costo_porcentaje);
			
		} else if (clave_articulo == 4) {
			mano_obra = (materia_prima * 0.75);
			gasto_fabricacion = (materia_prima * 0.28);
			costo_produccion = (materia_prima+mano_obra+gasto_fabricacion);
			costo_porcentaje = (costo_produccion * 0.45);
			precio_venta = (costo_produccion + costo_porcentaje);
			
		} else if (clave_articulo == 3) {
			mano_obra = (materia_prima * 0.75);
			gasto_fabricacion = (materia_prima * 0.35);
			costo_produccion = (materia_prima+mano_obra+gasto_fabricacion);
			costo_porcentaje = (costo_produccion * 0.45);
			precio_venta = (costo_produccion + costo_porcentaje);
			
		} else if (clave_articulo == 2) {
			mano_obra = (materia_prima * 0.85);
			gasto_fabricacion = (materia_prima * 0.30);
			costo_produccion = (materia_prima+mano_obra+gasto_fabricacion);
			costo_porcentaje = (costo_produccion * 0.45);
			precio_venta = (costo_produccion + costo_porcentaje);
			
		} else {
			mano_obra = (materia_prima * 0.80);
			gasto_fabricacion = (materia_prima * 0.28);
			costo_produccion = (materia_prima+mano_obra+gasto_fabricacion);
			costo_porcentaje = (costo_produccion * 0.45);
			precio_venta = (costo_produccion + costo_porcentaje);
			
		}
		
		ganancia = (precio_venta - costo_produccion);
		System.out.println("Precio venta: " + precio_venta);
		System.out.println("Precio original: " + costo_produccion);
		System.out.println("Tu ganancia es de: " + ganancia);

	}

}
