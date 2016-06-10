package br;

public class Gerente extends Funcionario implements Autenticavel {
	
     public int senha;
     
     public boolean autenticar(int senha){
    	 return this.senha ==senha;
     }

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autenticar(int senha, String login) {
		// TODO Auto-generated method stub
		return false;
	}

}
