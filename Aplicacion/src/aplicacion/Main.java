package aplicacion;
/**
 * Clase MAIN
 * @author Alberto Redondo
 */
public class Main {
    /**
     * Metodo principal de la aplicacion
     * @param args 
     */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }
    /**
     * Metodo donde se crea nueva cuenta
     * @param cantidad valor para introducir al saldo
     */
    public static void operativa_cuenta(float cantidad) {
        Cuenta Cuenta1;        

        Cuenta1 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
        mostrarSaldo(Cuenta1);

        retirar(Cuenta1);
        ingresar(Cuenta1);
    }
    /**
     * Metodo para sumar un valor mas al saldo asignada
     * @param Cuenta1 donde esta el objeto
     */
    public static void ingresar(Cuenta Cuenta1) {
        try {
            System.out.println("Ingreso en cuenta");
            Cuenta1.ingresar(695);
            mostrarSaldo(Cuenta1);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    /**
     * Metodo para restar un valor mas al saldo asignada
     * @param Cuenta1 
     */
    public static void retirar(Cuenta Cuenta1) {
        try {
            Cuenta1.retirar(2300);
            mostrarSaldo(Cuenta1);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
    }
    /**
     * Metodo donde se muestra en pantalla
     * @param Cuenta1 
     */
    public static void mostrarSaldo(Cuenta Cuenta1) {
        System.out.println("El saldo actual es:"+ Cuenta1.estado() );
    }
}
