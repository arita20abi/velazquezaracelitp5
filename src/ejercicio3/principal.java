package ejercicio3;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        CalculadoraDeCadenas calculadora = new CalculadoraDeCadenas();
	        String palabra = "buenos dias";
	        int cantidadVocales = calculadora.contarVocales(palabra);
	        System.out.println("La palabra \"" + palabra + "\" tiene " + cantidadVocales + " vocales.");
	    }
}


