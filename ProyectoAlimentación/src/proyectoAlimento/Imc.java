package proyectoAlimento;

/**
 * 
 * Clase que te indica si te encuentras en tu peso ideal y tu estado físico.
 * @author marcre
 *
 */

public class Imc {	

	public static double calcular_imc(int altura, int peso) { 
		
		double medida = (double) altura/100;
		
		double calculo = peso/Math.pow(medida, 2);

		return calculo;

	}
	
	/**
	 * Según el imc, mostraremos si el usuario se encuentra en el peso ideal, ya seas hombre o mujer.
	 * @param edad: Valor de la edad de la persona en años
	 * @param altura: Valor de la altura de la persona en cm
	 * @param peso: Valor del peso de la persona en kg
	 * @param sexo: Género de la persona (Hombre o Mujer)
	 * @return
	 */

	public static String calcular_peso_ideal(int edad, int altura, int peso, String sexo) { 

		String estadoFisico = "";

		double calculo_imc = calcular_imc(altura, peso);

		if (sexo.equals("Hombre")) { 

			if ((edad==16) && (calculo_imc>=19 && calculo_imc<=24)) { //Peso ideal Hombres

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad==17) && (calculo_imc>=20 && calculo_imc<=25)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if((edad==18) && (calculo_imc>=20 && calculo_imc<=25)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=19 && edad<=24) && (calculo_imc >=21 && calculo_imc<=26)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=25 && edad<=34) && (calculo_imc >=22 && calculo_imc<=27)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=35 && edad<=54) && (calculo_imc >=23 && calculo_imc<=38)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=55 && edad<=64) && (calculo_imc>=24 && calculo_imc<=29)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=65 && edad<=90) && (calculo_imc>=25 && calculo_imc<=30)) { 

				estadoFisico = "Su estado físico es Ideal";

			}else

				estadoFisico = "Su estado físico no es Ideal";

		}else //Peso ideal Mujeres

			if ((edad>=16 && edad<=17) && (calculo_imc>=19 && calculo_imc<=24)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=18) && (calculo_imc>=19 && calculo_imc<=24)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if((edad>=19 && edad<=24) && (calculo_imc>=19 && calculo_imc<=24)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=25 && edad<=34) && (calculo_imc>=20 && calculo_imc<=25)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=35 && edad<=44) && (calculo_imc>=21 && calculo_imc<=26)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=45 && edad<=54) && (calculo_imc>=22 && calculo_imc<=27)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=55 && edad<=64) && (calculo_imc>=23 && calculo_imc<=28)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=65 && edad<=90) && (calculo_imc>=25 && calculo_imc<=30)) {

				estadoFisico = "Su estado físico es Ideal";

			}else

				estadoFisico = "Su estado físico no es Ideal";

		return estadoFisico;
	}
	
	/**
	 * Según el resultado del cálculo del imc mostraremos el estado físico de la persona
	 * @param altura: Valor de la altura de la persona en cm
	 * @param peso: Valor del peso de la persona en kg
	 * @return
	 */
	

	public static String imc_persona(int altura, int peso) { 
		String imc_persona = "";

		double calculo_imc= calcular_imc(altura, peso);

		if (calculo_imc < 16) {

			imc_persona = "Delgadez Severa";

		}else if (calculo_imc < 16 && calculo_imc <= 17) {

			imc_persona = "Delgadez Moderada";

		}else 	if (calculo_imc >= 17 && calculo_imc <= 18.5) {

			imc_persona = "Delgadez Leve";

		}else 	if (calculo_imc >= 18.5 && calculo_imc <= 24.9) {

			imc_persona = "Peso Normal";

		}else 	if (calculo_imc >= 25 && calculo_imc <= 29.9) {

			imc_persona = "Pre-Obeso";

		}else 	if (calculo_imc >= 30 && calculo_imc <= 34.9) {

			imc_persona = "Obesidad Tipo I";

		}else 	if (calculo_imc >= 35 && calculo_imc <= 39.9) {

			imc_persona = "Obesidad Tipo II";

		}else	if (calculo_imc >= 40) {

			imc_persona = "Obesidad Tipo III";

		}

		return imc_persona;

	}






}




