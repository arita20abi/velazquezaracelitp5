package ejercicio3;

public class CalculadoraDeCadenas {
	
	private String texto;
	public CalculadoraDeCadenas(){
		//TODO Auto-generated constructor stub
		
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public int contarVocales(String palabra) {
        int contador = 0;
        palabra = palabra.toLowerCase();
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
	
}
