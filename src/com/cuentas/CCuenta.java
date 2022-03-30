package com.cuentas;

/**
 * Clase que simula una cuenta bancaria.
 * @author juanx
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor por defecto.
     */
    public CCuenta() {  }

    /**
     *
     * @param nom Hace referencia al propietario de la cuenta.
     * @param cue Hace referencia a la cuenta en sí misma.
     * @param sal Hace referencia al saldo de dinero en la cuenta.
     * @param tipo Hace referencia al tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     *
     *
     * @return Devuelve el saldo en la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método que simula el ingreso de dinero en una cuenta.
     * @param cantidad Hace referencia a una cantidad que quieras ingresar.
     * @throws Exception Si la cantidad es menor de "0", se lanza una excepción.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que simula el retiro de dinero en una cuenta.
     * @param cantidad Hace referencia a una cantidad que quieras retirar.
     * @throws Exception Si la cantidad es menor de "0" o la cantidad a retirar es mayor que el saldo en la cuenta, se lanza una excepción.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método que nos da el saldo en la cuenta, aplica un retiro y un ingreso en la cuenta.
     * @param cantidad Hace referencia a una cantidad que quieras retirar.
     */
    public void operativa_cuenta(float cantidad){
         double saldoActual = this.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            this.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            this.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    /**
     *
     * @return Devuelve el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre Establece el nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return Devuelve la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece una cuenta.
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *
     * @return Devuelve el saldo.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo en una cuenta.
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return Devuelve los tipos de intereses.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece los tipos de intereses.
     * @param tipoInteres
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
