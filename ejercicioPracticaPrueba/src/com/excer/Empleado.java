package com.excer;

public class Empleado {
	//Atributos
	private String rut;
	private String nombres;
	private String apellidos;
	private String domicilio;
	private Double sueldo_Bruto;
	//Constructor
	public Empleado(String nuevoRut, String nuevoApellidos, String nuevoNombres, String nuevoDomicilio, Double nuevoSueldo_Bruto) {
		rut = nuevoRut;
		nombres = nuevoNombres;
		apellidos = nuevoApellidos;
		domicilio = nuevoDomicilio;
		sueldo_Bruto = nuevoSueldo_Bruto;
	}
	/**
	 * 
	 * @return
	 */
	public String getRut() {
		return rut;
	}
	/**
	 * 
	 * @param rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	/**
	 * 
	 * @return
	 */
	public String getNombres() {
		return nombres;
	}
	/**
	 * 
	 * @param nombres
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * 
	 * @return
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * 
	 * @return
	 */
	public String getDomicilio() {
		return domicilio;
	}
	/**
	 * 
	 * @param domicilio
	 */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	/**
	 * 
	 * @return
	 */
	public double getSueldo_Bruto() {
		return sueldo_Bruto;
	}
	/**
	 * 
	 * @param sueldo_Bruto
	 */
	public void setSueldo_Bruto(double sueldo_Bruto) {
		this.sueldo_Bruto = sueldo_Bruto;
	}
	
	public String getAtributos() {
		String sueldoString = Double.toString(getSueldo_Bruto());
		String AtributosC = getRut()+", "+getApellidos()+" "+getNombres()+", "+sueldoString;
		return AtributosC;
	}

}
