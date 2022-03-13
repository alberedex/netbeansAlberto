package aplicacion;

/**
 * Clase de Metodos de Cuenta
 *
 * @author Alberto Redondo Sanchez
 * @see Cuenta
 * @version 1.0
 *
 */
public class Cuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Datos por defecto del objeto si no asigna
     */
    public Cuenta() {
        nombre = "";
        cuenta = "";
        saldo = 0;
        tipoInteres = 0;
    }

    /**
     * Metodo donde se introduce los datos dado por parametros
     *
     * @param nom parametro nombre del objeto
     * @param cue parametro String de la cuenta del objeto
     * @param sal parametro double del saldo de la cuenta
     * @param tipo parametro double de la tipo de interes que tiene la cuenta
     */
    public Cuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }
    
    /**
     * Metodo donde se va a modificar el saldo positivamente.
     *
     * @param cantidad cantidad positiva que se va a sumar al saldo del objeto
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Metodo donde se va a modificar el saldo negativamente
     *
     * @param cantidad cantidad positiva que se va a restar al saldo del objeto
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
    /**
     * Metodo donde devuelve el estado del saldo de un objeto
     *
     * @return
     */
    public double estado() {
        return saldo;
    }
    /**
     * Metodo que regresa el nombre de la persona
     *
     * @return devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que modifica el nombre de la persona
     *
     * @param nombre nuevo nombre a modificar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que regresa el saldo de la cuenta
     *
     * @return devuelve el parametro string de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Metodo que modifica la cuenta de la persona
     *
     * @param cuenta asigna nuevo valor de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Metodo que regresa el saldo de la cuenta
     *
     * @return devuelve el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo que modifica el saldo
     *
     * @param saldo asigna nuevo saldo al objeto
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo que devuelve el tipo de interes que tiene la cuenta
     *
     * @return tipoInteres devuelve el tipo de interes que tiene la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Metodo que modifica el valor del tipo de interes del objeto
     *
     * @param tipoInteres el nuevo valor a modificar
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", cuenta=" + cuenta + ", saldo=" + saldo + ", tipoInteres=" + tipoInteres + '}';
    }

}
