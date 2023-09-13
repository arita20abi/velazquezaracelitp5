package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numeroA =23;
        int numeroB = 4;
        
        
        Calculadora calculadora = new Calculadora();
        calculadora.setNumeroA(numeroA);
        calculadora.setNumeroB(numeroB);
        System.out.println("el resultado de DIVIDIR es:"+calculadora.dividir());
        System.out.println("el resultado de SUMAR  es:"+calculadora.sumar());
        System.out.println("el resultado de RESTA es:"+calculadora.restar());
        System.out.println("el resultado de MULTIPLICACION  es:"+calculadora.multiplicar());
        
        
	}

}
