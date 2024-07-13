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
public class Alquiler {
    
    private  int  posicionAmarre;
	
	private int fechaDia;
	private Barco barco;
	private Yate yate;
	private Velero velero;
	private EmbarcacionesMotor embarcacionesMotor;
	private Cliente cliente;



	/**
	 * Constructor con parámetros para alquilar un velero.
	 *
	 * @param posicionAmarre La posición de amarre.
	 * @param fechaDia La fecha de inicio del alquiler.
	 * @param velero El velero alquilado.
	 * @param cliente El cliente que alquila.
	 */
	

	public Alquiler(int posicionAmarre, int fechaDia, 
			Velero velero, Cliente cliente) {
		super();
		this.posicionAmarre = posicionAmarre;
		this.fechaDia = fechaDia;
		this.velero = velero;
		this.cliente = cliente;
	}

	/**
	 * Constructor con parámetros para alquilar una embarcación a motor.
	 *
	 * @param posicionAmarre La posición de amarre.
	 * @param fechaDia La fecha de inicio del alquiler.
	 * @param embarcacionesMotor La embarcación a motor alquilada.
	 * @param cliente El cliente que alquila.
	 */


	public Alquiler(int posicionAmarre, int fechaDia,
			EmbarcacionesMotor embarcacionesMotor, Cliente cliente) {
		super();
		this.posicionAmarre = posicionAmarre;
		this.fechaDia = fechaDia;
		this.embarcacionesMotor = embarcacionesMotor;
		this.cliente = cliente;
	}

	/**
	 * Constructor con parámetros para alquilar un yate.
	 *
	 * @param posicionAmarre La posición de amarre.
	 * @param fechaDia La fecha de inicio del alquiler.
	 * @param yate El yate alquilado.
	 * @param cliente El cliente que alquila.
	 */


	public Alquiler(int posicionAmarre, int fechaDia, 
			Yate yate, Cliente cliente) {
		super();
		this.posicionAmarre = posicionAmarre;
		this.fechaDia = fechaDia;
		this.yate = yate;
		this.cliente = cliente;
	}


	/**
	 * Constructor vacío.
	 */

	public Alquiler() {

	}


	//Metodos GET

	/**
	 * Método GET de fechaDia. Retorna el valor de fechaDia de la clase.
	 *
	 * @return El valor de fechaDia.
	 */
	public int getFechaDia() {
		return fechaDia;
	}


	/**
	 * Metodo GET de posicionAmarre.Retorna el valor de posicionAmarre de la clase
	 * @return: el posicionAmarre
	 */
	public int getPosicionAmarre() {
		return posicionAmarre;
	}

	/**
	 * Metodo GET de cliente.Retorna el valor de cliente de la clase
	 * @return: el cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Metodo GET de barco.Retorna el valor de barco de la clase
	 * @return: el barco
	 */
	public Barco getBarco() {

		return barco;
	}

		/**
	 * Metodo GET de yate.Retorna el valor de yate de la clase
	 * @return: el yate
	 */
	public Yate getYate() {
		return yate;
	}

	/**
	 * Metodo GET de velero.Retorna el valor de velero de la clase
	 * @return: el velero
	 */
	public Velero getVelero() {

		return velero;
	}

	/**
	 * Metodo GET de embarcacionesMotor.Retorna el valor de embarcacionesMotor de la clase
	 * @return: el embarcacionesMotor
	 */
	public EmbarcacionesMotor getEmbarcacionesMotor() {

		return embarcacionesMotor;
	}


//Metodos SET

	/**
	 * Metodo SET de  fechaDia.Cambia el valor de fechaDia de la clase
	 * @param: fechaDia: el fechaDia
	 */
	public void setFechaDia(int fechaInicio) {

		this.fechaDia = fechaDia;
	}

	/**
	 * Metodo SET de  posicionAmarre.Cambia el valor de posicionAmarre de la clase
	 * @param: posicionAmarre: el posicionAmarre
	 */
	public void setPosicionAmarre(int posicionAmarre) {

		this.posicionAmarre = posicionAmarre;
	}


	/**
	 * Metodo SET de  cliente.Cambia el valor de cliente de la clase
	 * @param: cliente: el cliente
	 */
	public void setCliente(Cliente cliente) {

		this.cliente = cliente;
	}


	/**
	 * Metodo SET de  barco.Cambia el valor de barco de la clase
	 * @param: barco: el barco
	 */
	public void setBarco(Barco barco) {

		this.barco = barco;
	}

	/**
	 * Metodo SET de  yate.Cambia el valor de yate de la clase
	 * @param: yate: el yate 
	 */
	public void setYate(Yate yate) {

		this.yate = yate;
	}

	/**
	 * Metodo SET de  velero.Cambia el valor de velero de la clase
	 * @param: velero: el velero 
	 */
	public void setVelero(Velero velero) {

		this.velero = velero;
	}

	/**
	 * Metodo SET de  embarcacionesMotor.Cambia el valor de embarcacionesMotor de la clase
	 * @param: embarcacionesMotor: el embarcacionesMotor 
	 */
	public void setEmbarcacionesMotor(EmbarcacionesMotor embarcacionesMotor) {

		this.embarcacionesMotor = embarcacionesMotor;
	}

	//main
	public static void main(String args[]){

		// Crear un cliente
		Cliente cliente1 = new Cliente("Juan Pérez", 12345678);

		// Crear un velero
		Velero velero1 = new Velero("Velero1", 10, 1999, 2);

		// Crear un alquiler de velero
		Alquiler alquiler1 = new Alquiler(1, 20240712, velero1, cliente1);

		// Mostrar detalles del alquiler
		System.out.println("Detalles del alquiler:");
		System.out.println("Cliente: " + alquiler1.getCliente().getNombre());
		System.out.println("Barco alquilado: " + alquiler1.getVelero().getMatricula());
		System.out.println("Fecha de inicio: " + alquiler1.getFechaDia());
		System.out.println("Posición de amarre: " + alquiler1.getPosicionAmarre());
// Crear un cliente
		Cliente cliente2 = new Cliente("María López", 87654321);

		// Crear una embarcación a motor
		EmbarcacionesMotor embarcacion1 = new EmbarcacionesMotor("Embarcacion1", 15, 1996,4);

		// Crear un alquiler de embarcación a motor
		Alquiler alquiler2 = new Alquiler(2, 20240713, embarcacion1, cliente2);

		// Mostrar detalles del alquiler
		System.out.println("Detalles del alquiler:");
		System.out.println("Cliente: " + alquiler2.getCliente().getNombre());
		System.out.println("Barco alquilado: " + alquiler2.getEmbarcacionesMotor().getMatricula());
		System.out.println("Fecha de inicio: " + alquiler2.getFechaDia());
		System.out.println("Posición de amarre: " + alquiler2.getPosicionAmarre());
	}

    
}
