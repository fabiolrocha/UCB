package br.com.fabio.padrao.impl;

import br.com.fabio.padrao.InterruptorListener;

public class Luz implements InterruptorListener {

	private boolean acesa = false;
	
	@Override
	public void aoLigar() {
		// TODO Auto-generated method stub
		acesa = true;
		System.out.println("Luz ligada");
	}

	@Override
	public void aoDesligar() {
		// TODO Auto-generated method stub
		acesa = false;
		System.out.println("Luz desligada");
	}

	
}
