package br;

public class Diretor extends Funcionario implements Autenticavel {
	
	public int senha;
	
	public boolean auteticar(int senha){
		return this.senha == senha;
	}

	@Override
	public boolean autenticar(int senha, String login) {
		// TODO Auto-generated method stub
		return false;
	}

}
