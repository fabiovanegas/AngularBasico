/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerbarco;

/**
 *
 * @author Fabio
 */
public class Yate extends Barco {
	
	private double potencia;
	private int camarotes;
	
	public static final int VALORYATE=350;
	
	
	public Yate() {
		super();
		
	}
	public Yate(String matricula, int eslora, int añofab,int camarotes,double potencia) {
		super(matricula, eslora, añofab);
		this.camarotes=camarotes;
		this.potencia=potencia;
	}
	/**
	 * Metodo GET de potencia.Retorna el valor de potencia de la clase
	 * @return: el potencia
	 */
	public double getPotencia() {
		return potencia;
	}
	/**
	 * Metodo GET de camarotes.Retorna el valor de camarotes de la clase
	 * @return: el camarotes
	 */
	public int getCamarotes() {
		return camarotes;
	}
	/**
	 * Metodo SET de  potencia.Cambia el valor de potencia de la clase
	 * @param: potencia: el potencia 
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	/**
	 * Metodo SET de  camarotes.Cambia el valor de camarotes de la clase
	 * @param: camarotes: el camarotes 
	 */
	public void setCamarotes(int camarotes) {
		this.camarotes = camarotes;
	}

	
	
}

