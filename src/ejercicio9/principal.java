package ejercicio9;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String apellidos = "Velazquez";
        String nombres = "Araceli";
        String mail = "Aracelivelazquez776@gmail.com";
        int edad = 16;
        double ingresosMensuales = 2222.0;
        double gastosMensuales = 1200.0;
        
        Usuario usuario = new Usuario(apellidos,nombres, mail, edad, ingresosMensuales, gastosMensuales);
        
        System.out.println("Apellidos: " + usuario.getApellidos());
        System.out.println("Nombres: " + usuario.getNombres());
        System.out.println("Mail: " + usuario.getMail());
        System.out.println("Edad: " + usuario.getEdad());
        System.out.println("Ingresos Mensuales: " + usuario.getIngresosMensuales());
        System.out.println("Gastos Mensuales: " + usuario.getGastosMensuales());
        
        if (usuario.esMayorDeEdad()) {
            System.out.println("El usuario es mayor de edad");
        } else {
            System.out.println("El usuario es menor de edad");
        }
        
        if (usuario.puedeAhorrar()) {
            System.out.println("El usuario puede ahorrar");
        } else {
            System.out.println("El usuario no puede ahorrar");
        }
    }
}
	