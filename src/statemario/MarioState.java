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
public interface MarioState {
   
	MarioState pegarCogumelo();

	MarioState pegarFlor();

	MarioState pegarPena();

	MarioState levarDano();

}
