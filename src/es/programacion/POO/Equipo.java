package es.programacion.POO;
/**
 * 
 * @author kkevi
 *
 */
public class Equipo {
	private String nombre;
/**
 * 
 * @param nombre
 */
	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + "]";
	}
	
}
