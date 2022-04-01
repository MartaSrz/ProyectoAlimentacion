package proyectoAlimento;

public class Alimento { //Clase para almacenar los diferentes alimentos que se van a utilizar en el programa. Los valores deberían ser equivalentes a 100g de producto.

	protected String nombre;
	protected double kcal;
	protected double kJ;
	protected double grasas;
	protected double grasasSaturadas;
	protected double hidratos;
	protected double azucar;
	protected double proteinas;
	protected double fibra;
	protected double sal;
	protected double calcio;
	protected double hierro;
	protected double potasio;


	public Alimento(String nombreFruta, double kcal, double kJ, double grasas, double grasasSaturadas, double hidratos,
			double azucar, double proteinas, double fibra, double sal, double calcio, double hierro,
			double potasio) {
		this.nombre = nombreFruta;
		this.kcal = kcal;
		this.kJ = kJ;
		this.grasas = grasas;
		this.grasasSaturadas = grasasSaturadas;
		this.hidratos = hidratos;
		this.azucar = azucar;
		this.proteinas = proteinas;
		this.sal = sal;
		this.calcio = calcio;
		this.fibra = fibra;
		this.potasio = potasio;
		this.hierro = hierro;


	}

	public String getNombre() {
		return nombre;
	}

	public double getKcal() {
		return kcal;
	}

	public double getkJ() {
		return kJ;
	}

	public double getGrasas() {
		return grasas;
	}

	public double getGrasasSaturadas() {
		return grasasSaturadas;
	}

	public double getHidratos() {
		return hidratos;
	}

	public double getAzucar() {
		return azucar;
	}

	public double getProteinas() {
		return proteinas;
	}

	public double getSal() {
		return sal;
	}

	public double getCalcio() {
		return calcio;
	}

	public double getFibra() {
		return fibra;
	}

	public double getPotasio() {
		return potasio;
	}

	public double getHierro() {
		return hierro;
	}

}
