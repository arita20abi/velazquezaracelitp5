package ejercicio9;

public class Usuario {
	 private String apellidos;
	    private String nombres;
	    private String mail;
	    private int edad;
	    private double ingresosMensuales;
	    private double gastosMensuales;
	    
	    public Usuario(String apellidos, String nombres, String mail, int edad, double ingresosMensuales, double gastosMensuales) {
	        this.apellidos = apellidos;
	        this.nombres = nombres;
	        this.mail = mail;
	        this.edad = edad;
	        this.ingresosMensuales = ingresosMensuales;
	        this.gastosMensuales = gastosMensuales;
	    }
	    
	    public String getApellidos() {
	        return apellidos;
	    }
	    
	    public String getNombres() {
	        return nombres;
	    }
	    
	    public String getMail() {
	        return mail;
	    }
	    
	    public int getEdad() {
	        return edad;
	    }
	    
	    public double getIngresosMensuales() {
	        return ingresosMensuales;
	    }
	    
	    public double getGastosMensuales() {
	        return gastosMensuales;
	    }
	    
	    public boolean esMayorDeEdad() {
	        return edad >= 18;
	    }
	    
	    public boolean puedeAhorrar() {
	        return ingresosMensuales > gastosMensuales;
	    }
}
