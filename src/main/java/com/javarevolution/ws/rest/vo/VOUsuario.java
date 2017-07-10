package com.javarevolution.ws.rest.vo;

public class VOUsuario {
	
	private  String usuario;
	private  String password;
	private  boolean userValid;
	
	public VOUsuario(){
		
	}
	
	public String getUsuario() {
	
		return usuario;
	
	}
	
	public void setUsuario( String usuario ) {
	
		this.usuario = usuario;
	
	}
	
	public String getPassword() {
	
		return password;
	
	}
	
	public void setPassword( String password ) {
	
		this.password = password;
	
	}
	
	public boolean isUserValid() {
	
		return userValid;
		
	}
	
	public void setUserValid( boolean userValid ) {
		
		this.userValid = userValid;
		
	}
	
}
