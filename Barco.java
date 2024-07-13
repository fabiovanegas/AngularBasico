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
public class Barco {
	private String matricula;
	private int eslora;
	private int añofab;

	// Constructor con parámetros
	public Barco(String matricula, int eslora, int añofab) {
		this.matricula = matricula;
		this.eslora = eslora;
		this.añofab = añofab;
	}

	// Constructor vacío
	public Barco() {
	}

	// Métodos getters y setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getEslora() {
		return eslora;
	}

	public void setEslora(int eslora) {
		this.eslora = eslora;
	}

	public int getAñofab() {
		return añofab;
	}

	public void setAñofab(int añofab) {
		this.añofab = añofab;
	}
}
