package proyectoAlimento;

public class Alimento {
	
	protected String nombreFruta;
	protected double kcal;
	protected double kJ;
	protected double grasas;
	protected double grasasSaturadas;
	protected double hidratos;
	protected double azucar;
	protected double proteinas;
	protected double sal;
	protected double calcio;
	protected double vitaminas;
	protected double omega3;
	protected double hierro;
	
	public Alimento(String nombreFruta, double kcal, double kJ, double grasas, double grasasSaturadas, double hidratos,
			double azucar, double proteinas, double sal, double calcio, double vitaminas, double omega3,
			double hierro) {
		this.nombreFruta = nombreFruta;
		this.kcal = kcal;
		this.kJ = kJ;
		this.grasas = grasas;
		this.grasasSaturadas = grasasSaturadas;
		this.hidratos = hidratos;
		this.azucar = azucar;
		this.proteinas = proteinas;
		this.sal = sal;
		this.calcio = calcio;
		this.vitaminas = vitaminas;
		this.omega3 = omega3;
		this.hierro = hierro;
		
	}

	public String getNombreFruta() {
		return nombreFruta;
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

	public double getVitaminas() {
		return vitaminas;
	}

	public double getOmega3() {
		return omega3;
	}

	public double getHierro() {
		return hierro;
	}

}
