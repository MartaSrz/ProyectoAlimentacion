package proyectoAlimento;

public class Imc {

	public static double imc(int altura, int peso) { //Calculo del imc de una persona

		double alt = (double) altura/100;
		
		double calculo = peso/Math.pow(alt, 2);

		return calculo;

	}

	public static String peso_ideal(int edad, int altura, int peso, String sexo) { //Según el imc, mostraremos si el usuario se encuentra en el peso ideal seas hombre o mujer

		String estadoFisico = "";

		double calc= imc(altura, peso);

		if (sexo.equals("Hombre")) { 

			if ((edad==16) && (calc>=19 && calc<=24)) { //Peso ideal Hombres

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad==17 && edad==18) && (calc>=20 && calc<=25)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if((edad==18) && (calc>=14.5 && calc<=18)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=19 && edad<=24) && (calc >=21 && calc<=26)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=25 && edad<=34) && (calc >=22 && calc<=27)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=35 && edad<=54) && (calc >=23 && calc<=38)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=55 && edad<=64) && (calc>=24 && calc<=29)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=65 && edad<=90) && (calc>=25 && calc<=30)) { 

				estadoFisico = "Su estado físico es Ideal";

			}else

				estadoFisico = "Su estado físico no es Ideal";

		}else //Peso ideal Mujeres

			if ((edad>=16 && edad<=17) && (calc>=19 && calc<=24)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=18) && (calc>=19 && calc<=24)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if((edad>=19 && edad<=24) && (calc>=19 && calc<=24)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=25 && edad<=34) && (calc>=20 && calc<=25)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=35 && edad<=44) && (calc>=21 && calc<=26)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=45 && edad<=54) && (calc>=22 && calc<=27)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=55 && edad<=64) && (calc>=23 && calc<=28)) {

				estadoFisico = "Su estado físico es Ideal";

			}else if ((edad>=65 && edad<=90) && (calc>=25 && calc<=30)) {

				estadoFisico = "Su estado físico es Ideal";

			}else

				estadoFisico = "Su estado físico no es Ideal";

		return estadoFisico;
	}

	public static String imc_persona(int altura, int peso) { //Clasificación imc según la persona

		String imc_persona = "";

		double calc= imc(altura, peso);

		if (calc < 16) {

			imc_persona = "Delgadez Severa";

		}else if (calc < 16 && calc <= 17) {

			imc_persona = "Delgadez Moderada";

		}else 	if (calc >= 17 && calc <= 18.5) {

			imc_persona = "Delgadez Leve";

		}else 	if (calc >= 18.5 && calc <= 24.9) {

			imc_persona = "Peso Normal";

		}else 	if (calc >= 25 && calc <= 29.9) {

			imc_persona = "Pre-Obeso";

		}else 	if (calc >= 30 && calc <= 34.9) {

			imc_persona = "Obesidad Tipo I";

		}else 	if (calc >= 35 && calc <= 39.9) {

			imc_persona = "Obesidad Tipo II";

		}else	if (calc >= 40) {

			imc_persona = "Obesidad Tipo III";

		}

		return imc_persona;

	}






}




