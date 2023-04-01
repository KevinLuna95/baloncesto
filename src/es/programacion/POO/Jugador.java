package es.programacion.POO;
/**
 * 
 * @author kkevi
 *
 */
public class Jugador extends Persona{
	
	private int numeroDorsal;
	private Equipo equipo;
	/**
	 * 
	 * @param nombre
	 * @param apelidos
	 * @param dni
	 * @param numeroDorsal
	 * @param equipo
	 */
	public Jugador(String nombre, String apelidos, String dni, int numeroDorsal, Equipo equipo) {
		super(nombre, apelidos, dni);
		// TODO Auto-generated constructor stub
		this.numeroDorsal=numeroDorsal;
		this.equipo=equipo;
	}

	/**
	 * @return the numeroDorsal
	 */
	public int getNumeroDorsal() {
		return numeroDorsal;
	}

	/**
	 * @param numeroDorsal the numeroDorsal to set
	 */
	public void setNumeroDorsal(int numeroDorsal) {
		this.numeroDorsal = numeroDorsal;
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
				"numeroDorsal=" + getNumeroDorsal() + "\n" + 
				"equipo=" + getEquipo() + "\n" + 
				"dni=" + getDni();
	}
}
