
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LOGICAII {
    record InformacionPersonal(String nombres,
                           String apellidos,
                           LocalDate fechaDeNacimiento,
                           String direccion,
                           String municipio,
                           String nivelAcademico,
                           String ocupacion,
                           char genero,
                           Integer peso,
                           Double estatura){
}


	public static void main(String[] args) {
        
        InformacionPersonal[] data = new InformacionPersonal[10];   //Se reemplaza el array de String por array del nuevo record InformacionPersonal
	

        data[0] = new InformacionPersonal("Juan","Pérez", LocalDate.parse("15/03/1985", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 123", "Medellín", "Licenciatura en Ingeniería", "Ingeniero de Software", 'M', 70, 1.75D);
        data[1] = new InformacionPersonal("María","García", LocalDate.parse("28/07/1992", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 123", "Medellín", "Maestría en Psicología", "Psicóloga Clínica", 'F', 58, 1.68D);
        data[2] = new InformacionPersonal("Carlos","Pérez García", LocalDate.parse("10/03/2023", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 123", "Medellín", "", "", 'M', 3, 0.80D);
        data[3] = new InformacionPersonal("Ana","Martínez", LocalDate.parse("05/09/2009", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle 14", "Villa", "Bachiller", "Estudiante", 'F', 55, 1.60D);
        data[4] = new InformacionPersonal("Luisa","Hernández", LocalDate.parse("20/06/1989", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Carrera 789", "Envigado", "Doctorado en Economía", "Profesora Universitaria", 'F', 63, 1.70D);
        data[5] = new InformacionPersonal("Javier","López", LocalDate.parse("12/04/1975", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Calle San Juan", "Medellin", "Licenciatura en Arquitectura", "Arquitecto Independiente", 'F', 75, 1.82D);
        data[6] = new InformacionPersonal("Laura","Ramírez", LocalDate.parse("18/04/1998", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6", "Ciudad Metropolitana", "Bachiller", "Estudiante", 'F', 52, 1.65D);
        data[7] = new InformacionPersonal("Martín","Torres", LocalDate.parse("30/02/1998", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6", "Aldea", "Bachiller", "Estudiante", 'M', 68, 1.78D);
        data[8] = new InformacionPersonal("Sofía","Vargas", LocalDate.parse("22/07/1995", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6", "Rionegro", "Bachiller", "Estudiante", 'F', 60, 1.63D);
        data[9] = new InformacionPersonal("Daniel","Sánchez", LocalDate.parse("08/12/1999", DateTimeFormatter.ofPattern("dd/MM/uuuu")),"Avenida 6", "Rionegro", "Bachiller", "Estudiante", 'M', 72, 1.79D);



	
	for ( InformacionPersonal InformacionPersonal : data){
			System.out.println(InformacionPersonal.direccion);
		}


	//1. Pesos:
	 // int = getPesos(data);
        System.out.println("Los pesos son: ");
        double promedio = 0D;
        for ( InformacionPersonal InformacionPersonal : data){
			System.out.println(InformacionPersonal.peso);
		}
            promedio = InformacionPersonal.peso;
                

	//2. Estaturas:
        System.out.println("Estaturas: ");
        Double alto=0D, bajo = 0D;
        for (InformacionPersonal InformacionPersonal : data){
            System.out.println(InformacionPersonal.estatura);
            if(alto>InformacionPersonal.estatura) alto=InformacionPersonal.estatura;
            else if (bajo>InformacionPersonal.estatura) bajo=InformacionPersonal.estatura;
        }
        System.out.println("El más alto mide: "+alto);
        System.out.println("El menos alto mide: "+bajo);


	//3. Generos
        System.out.println("Géneros: ");
        int numMasculino=0, numFemenino=0;
        for (InformacionPersonal InformacionPersonal :data){
            System.out.println(InformacionPersonal.genero);
            if (InformacionPersonal.genero=='F') numFemenino++;
            else if (InformacionPersonal.genero=='M') numMasculino++;
        }
        System.out.println("Número de mujeres: "+numFemenino);
        System.out.println("Número de hombres: "+numMasculino);


	//4. Nombres Completos
	System.out.println("Nombres Completos: ");
        String todosLosNombres = "";
        for (InformacionPersonal InformacionPersonal :data){
            System.out.println(InformacionPersonal.nombres()+ "" + InformacionPersonal.apellidos());
            todosLosNombres += (InformacionPersonal.nombres()+ "" + InformacionPersonal.apellidos());
        }
        System.out.println(todosLosNombres);

	//5. Edades:
	System.out.println("Fechas de Nacimiento: ");
         for (InformacionPersonal InformacionPersonal :data){
            System.out.println(InformacionPersonal.fechaDeNacimiento);
            hoy = datetime.today();
            int edad;
            edad =hoy year - LocalDate.parse 
            
        }

	}

	public static Integer[] getPesos(String[] data){

		int[] pesos = new int[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			Integer peso = Integer.valueOf(datum[8]);
			pesos[i-1] = peso;
		}
		return pesos;
	}
            
        public static double[] getEstaturas(String[] data){
            
            double[] estaturas = new double[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			double estatura = double.valueOf(datum[9]);
			estaturas[i-1] = estatura;
		}
		return estaturas;
	}

	public static char[] getGeneros(String[] data){

		char[] generos = new char[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			char genero = datum[7].charAt( 0 );
			generos[i-1] = genero;
		}
		return generos;
	}

	public static string[] getNombresCompletos(String[] data){

		string[] nombresCompletos = new string[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			string[] datum = data[i].split( "," );
			string nombreCompleto = datum[0] + " " + datum[1];
			nombresCompletos[i-1] = nombreCompleto;
		}
		return nombresCompletos;
	}



	public static LocalDate[] getFechasDeNacimientos(String[] data){

		LocalDate[] fechasDeNacimiento = new LocalDate[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			String fechaDeNacimiento = datum[2];
			fechasDeNacimiento[i-1] = LocalDate.parse( fechaDeNacimiento, DateTimeFormatter.ofPattern("dd/MM/uuuu"));
		}
		return fechasDeNacimiento;
	}

	public static String[] getDirecciones(String[] data){

		String[] direcciones = new String[data.length-1];

		for ( int i = 1; i < data.length; i++ ) {
			String[] datum = data[i].split( "," );
			String direccion = datum[3] ;
			direcciones[i-1] = direccion;
		}
		return direcciones;
	}
}
