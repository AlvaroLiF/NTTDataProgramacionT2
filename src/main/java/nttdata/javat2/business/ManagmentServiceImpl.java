package nttdata.javat2.business;

import java.util.HashMap;
import java.util.Map;

/**
 * Método ManagmentServiceImpl
 * 
 * @author Alvaro L
 *
 */

public class ManagmentServiceImpl implements ManagmentServiceI {

	// Creación del mapa companyDatabase
	final Map<Integer, Employee> companyDatabase = new HashMap<Integer, Employee>();

	// Creación del objeto Employee
	Employee e = new Employee();

	// Variable para el número de empleados
	int numberOfEmployees;

	/**
	 * El método hireEmployee añade un empleado a la base de datos, si la empresa no
	 * ha llegado al tope de empleados permitidos
	 */
	@Override
	public void hireEmployee(String name, String category) {

		if (numberOfEmployees == e.getMAXEMPLOYEES()) {

			System.out.println("La empresa ha llegado al tope de empleados.");
			System.out.println();
		} else {

			Employee e = new Employee();

			e.setName(name);

			e.setCategory(category);

			companyDatabase.put(e.getId(), e);

			numberOfEmployees++;

			System.out.println("La " + e.getId()
					+ " persona ha superado los requisitos y ha sido contratado. Ahora es un empleado.");
			System.out.println();
		}

	}

	/**
	 * El método showAllEmployees muestra todos los empleados de la base de datos
	 */
	@Override
	public void showAllEmployees() {

		for (Integer employee : companyDatabase.keySet()) {

			System.out.println(companyDatabase.get(employee));
			System.out.println();
		}

	}

	/**
	 * El método countAllEmployees cuenta el número total de empleados contratados
	 * en la empresa
	 */
	@Override
	public void countAllEmployees() {

		System.out.println("Actualmente hay " + numberOfEmployees + " empleados contratados.");

	}

}
