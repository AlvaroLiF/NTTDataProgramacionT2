package nttdata.javat2.business;

/**
 * Interfaz implementada por la clase ManagmentServiceImpl
 * 
 * @author Alvaro L
 *
 */

public interface ManagmentServiceI {

	/**
	 * Método que da de alta a un empleado
	 * 
	 * @param name
	 * @param category
	 */

	public void hireEmployee(String name, String category);

	/**
	 * Método que muestra todos los empleados
	 */

	public void showAllEmployees();

	/**
	 * Método que cuenta el número de empleados
	 */

	public void countAllEmployees();

}
