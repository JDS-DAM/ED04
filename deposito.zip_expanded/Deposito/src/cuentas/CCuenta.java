/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;


/**
 * Clase para interactuar con una cuenta
 * (he añadido unos tags "deprecated" en algunos métodos)
 * 
 * @author Jorge
 * @version 0.1.3
 * @since 0.1
 *
 */
public class CCuenta {


	/**
	 * Nombre de cuenta
	 */
    private String nombre;
    
    /**
     * Nº de cuenta
     */
    private String cuenta;
    
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    
    /**
     * Tipo de interés de la cuenta
     */
    private double tipoInteres;


    /**
     * Constructor vacío
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con todos los parámetros
     * 
     * @param nom Nombre de la cuenta
     * @param cue Cuenta
     * @param sal Salida (cantidad)
     * @param tipo Tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método para asignar el nombre (Nº Cuenta), mediante llamada a setter
     * 
     * @param nom El nombre
     * @deprecated Podríamos llamar al setter directamente
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * Método para recuperar el nombre (Nº Cuenta), mediante llamada a getter
     * 
     * @return El nombre
     * @deprecated Podríamos llamar al getter directamente
     */    
    public String obtenerNombre()
    {
        return getNombre();
    }


    /**
     * Obtiene el saldo
     * (¡el nombre del método no es muy adecuado!)
     * 
     * @return El saldo
     * @deprecated Podríamos llamar al getter directamente
     */
    public double estado()
    {
        return saldo;
    }


    /**
     * Realiza un ingreso
     * 
     * @param cantidad Cantidad a ingresar
     * @throws Exception En caso de cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Realiza una retirada
     * 
     * @param cantidad Cantidad a retirar
     * @throws Exception En caso de que no haya saldo suficiente o se intente retirar una cantidad negativa
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }


    /**
     * Obtiene la cuenta
     * 
     * @return La cuenta
     * @deprecated Podríamos utilizar el getter directamente
     */
    public String obtenerCuenta()
    {
        return cuenta;
    }


    //************************************************************
    //************************************************************
    //************************************************************
    //					SETTERS & GETTERS

    /**
     * 
     * @return El nombre
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * 
     * @param nombre El nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
	 * @return La cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta La cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return El saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo El saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 * @return El tipo de interés
	 */
	public double getTipoInteres() {
        return tipoInteres;
    }

	/**
	 * 
	 * @param tipoInteres El tipo de interés
	 */

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    //************************************************************
    //************************************************************
    //************************************************************
}
