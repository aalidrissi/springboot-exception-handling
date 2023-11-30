package com.example.GlobalExeptionHandling.exception;

public class FonctionnelleException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	private String classNamme;
	
	private String rg;
	
	public FonctionnelleException(String message, String classNamme, String rg) {
		super(message);
		this.classNamme = classNamme;
		this.rg = rg;
	}

	public FonctionnelleException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public String getClassNamme() {
		return classNamme;
	}

	public void setClassNamme(String classNamme) {
		this.classNamme = classNamme;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	

}
