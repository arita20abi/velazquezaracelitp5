package ejercicio5;

import ejercicio2.Calculadora;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int numero;
	        
	        do {
	            System.out.print("Ingrese un número entero del rango [0,10]: ");
	             numero = 6; //aqui puedes cambiar y elegir un numero del 0 al 10 
	        } while (numero < 0 || numero > 10);
	        
	        Calculadora calculadora = new Calculadora();
	        int factorial = calculadora.calcularFactorial(numero);
	        
	        System.out.println("El factorial de " + numero + " es: " + factorial);
	}
	

}
