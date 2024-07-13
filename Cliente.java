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
public class Cliente {
    
    private String nombre;
	private int dni;
	
	
	
	/**
	 *Constructor de --  -- .Metodo que inicializa las variables.
	 */
	public Cliente(String nombre, int dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	/**
	 * Metodo GET de nombre.Retorna el valor de nombre de la clase
	 * @return: el nombre
	 */
	public String getNombre() {

		return nombre;
	}


	/**
	 * Metodo GET de dni.Retorna el valor de dni de la clase
	 * @return: el dni
	 */
	public int getDni() {

		return dni;
	}



	/**
	 * Metodo SET de  nombre.Cambia el valor de nombre de la clase
	 * @param: nombre: el nombre 
	 */
	public void setNombre(String nombre) {

		this.nombre = nombre;
	}



	/**
	 * Metodo SET de  dni.Cambia el valor de dni de la clase
	 * @param: dni: el dni 
	 */
	public void setDni(int dni) {

		this.dni = dni;
	}
	
    
}
