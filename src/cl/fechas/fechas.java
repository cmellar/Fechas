package cl.fechas;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fecha1 = " "; // Se declara variable para primera fecha
		String fecha2 = " "; // Se declara variable para segunda fecha
		
		
		/*Se declaran variablec para cáculos*/
		int dia1=0;
		int mes1=0;
		int ano1=0;
		int dia2=0;
		int mes2=0;
		int ano2=0;
		int per1=0;
		int per2=0;
		Scanner tecla = new Scanner(System.in); // Se declara objeto para ingreso por teclado
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Formato para el ingreso de fecha
		boolean continua = false;
				
		/*Comienza primer bucle*/
		do {
			try {
				System.out.println("Ingrese la primera fecha como DD/MM/AAAA"); //Se pide ingreso primera fecha
				fecha1=tecla.next();
				LocalDate fecha = LocalDate.parse(fecha1, formato);
				dia1 = Integer.parseInt(fecha1.substring(0,2)); //almacenamos el día de la primera persona
			    mes1 = Integer.parseInt(fecha1.substring(3,5)); //almacenamos el mes de la primera persona
			    ano1 = Integer.parseInt(fecha1.substring(6)); //almacenamos el año de la primera persona
			    continua = false;
			} catch (DateTimeParseException ex) { //Validamos excepciones del formato
				System.out.println("Debe ingresar obligatoriamente una fecha");
				continua = true;
			} catch (NumberFormatException ex) {
				System.out.println("Debe ingresar obligatoriamente una fecha");
				continua = true;
		}	  catch (StringIndexOutOfBoundsException ex) {
			System.out.println("Debe ingresar obligatoriamente una fecha");
			continua = true;
		}
		}while(continua);
		  
		/*Comienza segundo bucle*/
		do {
			try {
				System.out.println("Ingrese la segunda fecha como DD/MM/AAAA"); //Se pide ingreso segunda fecha
				fecha2=tecla.next();
				LocalDate fecha = LocalDate.parse(fecha2, formato);
				dia2 = Integer.parseInt(fecha2.substring(0,2)); //almacenamos el día de la segunda persona
			    mes2 = Integer.parseInt(fecha2.substring(3,5)); //almacenamos el mes de la segunda persona
			    ano2 = Integer.parseInt(fecha2.substring(6)); //almacenamos el año de la segunda persona
			    continua = false;
			} catch (DateTimeParseException ex) {
				System.out.println("Debe ingresar obligatoriamente una fecha");
				continua = true;
			} catch (NumberFormatException ex) {
				System.out.println("Debe ingresar obligatoriamente una fecha");
				continua = true;
		}	  catch (StringIndexOutOfBoundsException ex) {
			System.out.println("Debe ingresar obligatoriamente una fecha");
			continua = true;
		}
		}while(continua);
		
		   
	    if (ano1==ano2&&mes1==2||mes2==2) // Se valida caso de borde febrero
    		if (dia1>=30) {
    			dia1=dia2-1;
    		} else if (dia2>=30) {
    			dia2=dia1-1;
    		}
	    
    		per1 = dia1+mes1; //Se suman valores para validación en caso de igualdad en fecha
    		per2 = dia2+mes2; //Se suman valores para validación en caso de igualdad en fecha
	    
	    if ((dia1+mes1+ano1)==(dia2+mes2+ano2)) {
	    	System.out.println("Tienen la misma edad"); //Se muestra en pantalla resultado
	    }  else if (ano1<ano2) {
	    	System.out.println("Persona 1 es mayor"); //Se muestra en pantalla resultado
	    } else if(ano2<ano1){
	    	System.out.println("Persona 2 es mayor"); //Se muestra en pantalla resultado
	    } else if(per1<per2){
	    	System.out.println("Persona 1 es mayor"); //Se muestra en pantalla resultado
	    } else {
	    	System.out.println("Persona 2 es mayor"); //Se muestra en pantalla resultado
	}   
		tecla.close();
		
	}

}
