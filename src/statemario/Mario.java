/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemario;

/**
 *
 * @author Windows 7
 */

    public class Mario {
	protected MarioState estado;
	
	public Mario() {
		estado = new MarioPequeno();
	}

	public void pegarCogumelo() {
		estado = estado.pegarCogumelo();
	}

	public void pegarFlor() {
		estado = estado.pegarFlor();
	}

	public void pegarPena() {
		estado = estado.pegarPena();
	}

	public void levarDano() {
		estado = estado.levarDano();
	}
}

