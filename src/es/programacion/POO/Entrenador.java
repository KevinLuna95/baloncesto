package es.programacion.POO;
/**
 * 
 * @author kkevi
 *
 */
public class Entrenador extends Persona {
	
	private int experiencia;
	private Equipo equipo;
	/**
	 * 
	 * @param nombre
	 * @param apelidos
	 * @param dni
	 * @param experiencia
	 * @param equipo
	 */
	public Entrenador(String nombre, String apelidos, String dni, int experiencia, Equipo equipo) {
		super(nombre, apelidos, dni);
		// TODO Auto-generated constructor stub
		this.experiencia=experiencia;
		this.equipo=equipo;
	}
	/**
	 * @return the experiencia
	 */
	public int getExperiencia() {
		return experiencia;
	}
	/**
	 * @param experiencia the experiencia to set
	 */
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	/**
	 * @return the equipo
	 */
	public Equipo getEquipo() {
		return equipo;
	}
	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	@Override
	public String toString() {
		return  "nombre=" + getNombre() + "\n" + 
				"apelidos=" + getApelidos() + "\n" + 
				"experiencia=" + getExperiencia() + "\n" + 
				"equipo=" + getEquipo() + "\n" + 
				"dni=" + getDni();
	}

}
