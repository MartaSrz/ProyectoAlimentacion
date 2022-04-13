/*Clase para crear una persona con su correspondiente peso, edad, etc. para
 *realizar los respectivos cálculos dependiendo del valor de sus atributos  
 * */


package proyectoAlimento;

public class Persona {
	private String nombre;
	private String sexo;
	private int peso;
	private int altura;
	private int edad;
	
	//CONSTRUCTOR--------------------------------------------
	public Persona(String nombre, String sexo, int peso, int altura, int edad) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}

	//-------------------------------------------------------
	public String getNombre() {
		return nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public int getPeso() {
		return peso;
	}
	public int getAltura() {
		return altura;
	}
	public int getEdad() {
		return edad;
	}
	//-------------------------------------------------------
	
}
