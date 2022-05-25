package nttdata.javat2;

import nttdata.javat2.business.ManagmentServiceImpl;

/**
 * Taller Práctico 2 - Gestión de empleados
 * 
 * @author Alvaro L
 *
 */
public class T2MainALF {
	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se crea el objeto de la clase ManagmentServiceImpl
		ManagmentServiceImpl m = new ManagmentServiceImpl();
		
		// El método hireEmployee es ejecutado multitud de veces para probar la 
		// funcionalidad de la base de datos al añadir varios empleados
		m.hireEmployee("Paco", "Programador junior");
		
		m.hireEmployee("Luis", "Programador full stack");
		
		m.hireEmployee("Manuel", "Programador Frontend");
		
		m.hireEmployee("Víctor", "Programador analista");
		
		// El método showAllEmployees es ejecutado, mostrando los empleados de la base de datos
		m.showAllEmployees();
		
		// El método countAllEmployees es ejecutado, mostrando el número total de empleados
		// en la base de datos
		m.countAllEmployees();
	}

}
