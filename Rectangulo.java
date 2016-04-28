package excepciones.rectangulo;

public class Rectangulo {
private double base, altura;
	
	public Rectangulo() throws ParametroIncorrecto{
		setBase(0);
		setAltura(0);
	}
	
	public Rectangulo(double b, double a) throws ParametroIncorrecto{
		setBase(b);
		setAltura(a);
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) throws ParametroIncorrecto {
		
		//si es negativo se lanza una excepcion
		if(base<0){
			//lanza objeto tipo excepcion
			throw new ParametroIncorrecto("El valor "+base+ " recibido es negativo");
		}
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) throws ParametroIncorrecto {
		if(altura<0){
			throw new ParametroIncorrecto("el valor "+altura+" es negativo");
		}
		this.altura = altura;
	}


	public double calcularPerimetro() {
		return base*2+altura*2;
	}


	public double calcularArea() {
		return base*altura;
	}
}
