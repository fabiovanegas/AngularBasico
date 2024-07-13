/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerbarco;

import java.util.ArrayList;

/**
 *
 * @author Fabio
 */
public class Compania {
    
    private ArrayList<Alquiler> miAlquiler;
	public Compania() {

		miAlquiler = new ArrayList<Alquiler>();

	}

	@SuppressWarnings("deprecation")
	public int crearAlquiler(Alquiler alquiler, int tipo ){

		int dias= 0;
		
		int valorModulo=0;
		int valorAlquiler=0;
		if (tipo==1) {
			valorModulo=alquiler.getVelero().getEslora()*alquiler.getFechaDia()*10;
			valorAlquiler=valorModulo*alquiler.getVelero().VALORVELERO;
		}
		if (tipo==2) {
			valorModulo=alquiler.getYate().getEslora()*alquiler.getFechaDia()*10;
			valorAlquiler=valorModulo*alquiler.getYate().VALORYATE;
		}
		if (tipo==3) {
			valorModulo=alquiler.getEmbarcacionesMotor().getEslora()*alquiler.getFechaDia()*10;
			valorAlquiler=valorModulo*alquiler.getEmbarcacionesMotor().VALOREMBARCACION;
		}
		
		
		return valorAlquiler;
                
                
	}
	public static void main(String args[]){

		Compania compania = new Compania();

		// Crear un cliente
		Cliente cliente = new Cliente("Juan Pérez", 12345678);

		// Crear un velero
		Velero velero = new Velero("Velero1", 10, 1999, 2);

		// Crear un alquiler de velero
		Alquiler alquiler = new Alquiler(1, 20240712, velero, cliente);

		// Calcular el valor del alquiler
		int valorAlquiler = compania.crearAlquiler(alquiler, 1);

		// Mostrar el valor del alquiler
		System.out.println("Valor del alquiler: " + valorAlquiler);
		System.out.println("Nombre del cliente: " +  cliente.getNombre());
	}
}
        

