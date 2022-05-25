package nttdata.javat2.business;

import java.util.Objects;

/**
 * Clase Employee
 * 
 * @author Alvaro L
 *
 */

public class Employee {

	// Variables
	private final static String COMPANY = "NTTData";
	private final static int MAXEMPLOYEES = 3;
	private String name;
	private String category;
	private int id;
	private static int idNumber;

	/**
	 * Constructor por defecto de la clase Employee
	 */
	public Employee() {

		this.id = idNumber;
		idNumber++;
	}
	/**
	 * Getter de la variable final MAXEMPLOYEES
	 * 
	 * @return MAXEMPLOYEES
	 */

	public int getMAXEMPLOYEES() {
		return MAXEMPLOYEES;
	}

	/**
	 * Getter de la variable final COMPANY
	 * 
	 * @return COMPANY
	 */
	
	public static String getCompany() {
		return COMPANY;
	}

	/**
	 * Setter de la variable name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setter de la variable category
	 * 
	 * @param category
	 */
	
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Getter de la variable id
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * Método que comprueba que el código Hash del id no esté repetido
	 */
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	/**
	 * Método que comprueba que dos empleados no tengan el id repetido
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	/**
	 * Método toString para representar la cadena de texto con los valores del empleado
	 */
	
	@Override
	public String toString() {
		return "El empleado con id "+id+", es "+name+", "+category+" que trabaja en " + getCompany();
	}

}
