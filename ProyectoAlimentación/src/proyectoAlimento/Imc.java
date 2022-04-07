package proyectoAlimento;

public class Imc {

	private static Persona usuario;

	public static double imc() { //Calculo del imc de una persona

		double calculo = usuario.getPeso()/Math.pow(usuario.getAltura()/100, 2);

		return calculo;

	}

	public static String peso_ideal_hombre() { //Según el imc, mostraremos al usuario el peso ideal seas hombre o mujer

		String estadoFisico = "";

		double calc= imc();

		if (usuario.getSexo().equals("Hombre")) {

			if (usuario.getEdad()>=19 && usuario.getEdad()<=24 && calc>=10.8 && calc<=14.9) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=25 && usuario.getEdad()<=29 && calc>=12.8 && calc<=16.5) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if(usuario.getEdad()>=30 && usuario.getEdad()<=34 && calc>=14.5 && calc<=18) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=35 && usuario.getEdad()<=39 && calc >=16.1 && calc<=19.4) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=40 && usuario.getEdad()<=44 && calc >=17.5 && calc<=20.5) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=45 && usuario.getEdad()<=49 && calc >=18.6 && calc<=21.5) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=50 && usuario.getEdad()<=54 && calc>=19.8 && calc<=22.7) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=55 && usuario.getEdad()<=59 && calc>=20.2 && calc<=23.2) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=60 && calc>=20.3 && calc<=23.5) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=19 && usuario.getEdad()<=24 && calc>14.9 && calc<=19) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=25 && usuario.getEdad()<=29 && calc>16.5 && calc<=20.3) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=30 && usuario.getEdad()<=34 && calc>18 && calc<=21.5) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=35 && usuario.getEdad()<=39 && calc>19.4 && calc<=22.6) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=40 && usuario.getEdad()<=44 && calc>20.5 && calc<=23.6) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=45 && usuario.getEdad()<=49 && calc>21.5 && calc<=24.5) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=50 && usuario.getEdad()<=54 && calc>22.7 && calc<=25.6) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=55 && usuario.getEdad()<=59 && calc>23.2 && calc<=26.2) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=60 && calc>23.2 && calc<=26.7) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=19 && usuario.getEdad()<=24 && calc>23) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=25 && usuario.getEdad()<=29 && calc>24.4) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=30 && usuario.getEdad()<=34 && calc>25.2) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=35 && usuario.getEdad()<=39 && calc>26.1) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=40 && usuario.getEdad()<=44 && calc>26.9) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=45 && usuario.getEdad()<=49 && calc>27.6) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=50 && usuario.getEdad()<=54 && calc>28.7) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=55 && usuario.getEdad()<=59 && calc>29.3) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=60 && calc>29.8) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}

		}else 

			if (usuario.getEdad()>=19 && usuario.getEdad()<=24 && calc>=18.9 && calc<=22.1) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=25 && usuario.getEdad()<=29 && calc>=18.9 && calc<=22) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if(usuario.getEdad()>=30 && usuario.getEdad()<=34 && calc>=19.7 && calc<=22.7) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=35 && usuario.getEdad()<=39 && calc >=21 && calc<=24) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=40 && usuario.getEdad()<=44 && calc >=22.6 && calc<=25.6) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=45 && usuario.getEdad()<=49 && calc >=24.3 && calc<=27.3) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=50 && usuario.getEdad()<=54 && calc>=26.6 && calc<=29.7) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=55 && usuario.getEdad()<=59 && calc>=27.4 && calc<=30.7) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=60 && calc>=27.6 && calc<=31) {

				estadoFisico = "Su estado físico es Óptimo";

			}else if (usuario.getEdad()>=19 && usuario.getEdad()<=24 && calc>22.1 && calc<=25) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=25 && usuario.getEdad()<=29 && calc>22 && calc<=25.4) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=30 && usuario.getEdad()<=34 && calc>22.7 && calc<=26.4) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=35 && usuario.getEdad()<=39 && calc>24 && calc<=27.7) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=40 && usuario.getEdad()<=44 && calc>25.6 && calc<=29.3) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=45 && usuario.getEdad()<=49 && calc>27.3 && calc<=30.9) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=50 && usuario.getEdad()<=54 && calc>29.7 && calc<=33.1) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=55 && usuario.getEdad()<=59 && calc>30.7 && calc<=34) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=60 && calc>31 && calc<=34.4) {

				estadoFisico = "Su estado físico es Bueno";

			}else if (usuario.getEdad()>=19 && usuario.getEdad()<=24 && calc>29.6) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=25 && usuario.getEdad()<=29 && calc>29.8) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=30 && usuario.getEdad()<=34 && calc>30.5) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=35 && usuario.getEdad()<=39 && calc>31.5) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=40 && usuario.getEdad()<=44 && calc>32.8) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=45 && usuario.getEdad()<=49 && calc>34.1) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=50 && usuario.getEdad()<=54 && calc>36.2) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=55 && usuario.getEdad()<=59 && calc>37.3) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}else if (usuario.getEdad()>=60 && calc>38) {

				estadoFisico = "Su estado físico es Malo (Obesidad)";

			}

		return estadoFisico;
	}






}




