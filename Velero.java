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
public class  Velero extends Barco {
	
	private int numeroMastiles;
	
	public static final int VALORVELERO=250;
	
	

	public Velero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Velero(String matricula, int eslora, int añofab, int numeroMastiles) {
		super(matricula, eslora, añofab);
		this.numeroMastiles=numeroMastiles;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo GET de numeroMastiles.Retorna el valor de numeroMastiles de la clase
	 * @return: el numeroMastiles
	 */
	public int getNumeroMastiles() {
		return numeroMastiles;
	}

	/**
	 * Metodo SET de  numeroMastiles.Cambia el valor de numeroMastiles de la clase
	 * @param: numeroMastiles: el numeroMastiles 
	 */
	public void setNumeroMastiles(int numeroMastiles) {
		this.numeroMastiles = numeroMastiles;
	}
	
	

}

