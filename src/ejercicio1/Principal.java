package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String apellidos = "Velazquez";
        String nombres = "Araceli";

        usuario usuario = new usuario();
        usuario.setApellidos(apellidos);
        usuario.setNombres(nombres);

        System.out.println("Datos del usuario:");
        System.out.println("Apellidos: " + usuario.getApellidos());
        System.out.println("Nombres: " + usuario.getNombres());
	}

}
