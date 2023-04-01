package es.programacion.POO;
/**
 * 
 * @author kkevi
 *
 */
public class Persona {
	private String nombre;
	private String apelidos;
	private String dni;
	/**
	 * 
	 * @param nombre
	 * @param apelidos
	 * @param segundoApellido
	 * @param dni
	 */
	public Persona(String nombre, String apelidos, String dni) {
		this.nombre=nombre;
		this.apelidos=apelidos;
		this.dni=dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the primerApellido
	 */
	public String getApelidos() {
		return apelidos;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setApelidos(String apelidos) {
		this.apelidos = apelidos;
	}


	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return  "nombre=" + getNombre() + "\n" + 
				"apelidos=" + getApelidos() + "\n" + 
				"dni=" + getDni();
	}
}
