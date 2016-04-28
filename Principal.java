package excepciones.rectangulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int base, altura;
		Rectangulo r;
		
		System.out.println("introduce la base:");
		base=entrada.nextInt();
		System.out.println("introduce la altura:");
		altura=entrada.nextInt();
		
		try{
			
		r=new Rectangulo(base, altura);
		System.out.println("El area es: "+ r.calcularArea() );
		
		}catch(ParametroIncorrecto e){
			System.out.println("Error en la entrada de datos: "+e);
			System.out.println("holamundooo");
		}
	}

}
