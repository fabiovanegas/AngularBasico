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
public class EmbarcacionesMotor extends Barco {
    public static final int VALOREMBARCACION=450;
    private double potenciaMotor;
	
	public EmbarcacionesMotor() {
		super();
		
	}

	public EmbarcacionesMotor(String matricula, int eslora, int añofab,double potenciaMotor) {
		super(matricula, eslora, añofab);
		this.potenciaMotor=potenciaMotor;
	}

	/**
	 * Metodo GET de potenciaMotor.Retorna el valor de potenciaMotor de la clase
	 * @return: el potenciaMotor
	 */
	public double getPotenciaMotor() {
		return potenciaMotor;
	}

	/**
	 * Metodo SET de  potenciaMotor.Cambia el valor de potenciaMotor de la clase
	 * @param: potenciaMotor: el potenciaMotor 
	 */
	public void setPotenciaMotor(double potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	
	

    
}
