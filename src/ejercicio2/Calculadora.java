package ejercicio2;

public class Calculadora {
	
	
	 private int numeroA;
	 private int numeroB;
	 
	 public Calculadora() {
		 // TODO Auto-generated constructor stub
	 }

	 //getters y setters
	 
	public int getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(int numeroA) {
		this.numeroA = numeroA;
	}

	public int getNumeroB() {
		return numeroB;
	}

	public void setNumeroB(int numeroB) {
		this.numeroB = numeroB;
	}
	 
	public double sumar() {
        
		int resultado = 0;
		resultado = numeroA + numeroB;
		return resultado;
    }

    public double restar() {
    	int resultado = 0;
		resultado = numeroA - numeroB;
		return resultado;
    }

    public double multiplicar() {
    	int resultado = 0;
		resultado = numeroA * numeroB;
		return resultado;
    }

    public int  dividir(){
        if (numeroB != 0) {
        	return numeroA / numeroB;
        	
        }else {
        	System.out.println("no se puede dividir por cero");
        	return  0;
            
        }
        
    }
    public double potenciar(double base, double exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    
    public void verificarParImpar(int numero) {
        if (numero % 2 == 0) {
            int resultado = numero * 3;
            System.out.println("El número es par. El triple del número es: " + resultado);
        } else {
            int resultado = numero * 2;
            System.out.println("El número es impar. El doble del número es: " + resultado);
        }
    }
    
    public int calcularFactorial(int numero) {
        int factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
    
    
    public void cuentaAtrasFor() {
        for (int i = 320; i >= 160; i -= 20) {
            System.out.println(i);
        }
    }
    
    public static void cuentaAtrasWhile() {
        int numero = 320;
        while (numero >= 160) {
            System.out.println(numero);
            numero -= 20;
        }
    }
    
    public static void cuentaAtrasDoWhile() {
        int numero = 320;
        do {
            System.out.println(numero);
            numero -= 20;
        } while (numero >= 160);
    }
    
}