package holamundo;

import java.util.Scanner;

public class Calculadora {
	
	public void menu() {
		System.out.println("\nCALCULADORA\n");
		System.out.println("Sumar - s");
		System.out.println("Restar - r");
		System.out.println("Multiplicar - m");
		System.out.println("Dividir - d");
		System.out.println("Finalizar - f");
	}
	
	public float sumar(float n1, float n2) {
		return n1+n2;
	}
	
	public float restar(float n1,float n2) {
		return n1-n2;
	}
	
	public float multiplicar(float n1, float n2) {
		return n1*n2;
	}
	
	public float dividir(float n1, float n2) {
		return n1/n2;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean continuar = true;
		char opcion=' ';
		Calculadora calculadora = new Calculadora();
		while(continuar) {
			do {
				calculadora.menu();
				opcion = teclado.next().charAt(0);
			}while(opcion!='s' && opcion!='r' && opcion!='m' && opcion!='d' && opcion!='f');
			//continuar=opcion=='f'?false:true;
			if(opcion!='f') {
				float n1 = 0.0f;
				float n2 = 0.0f;
				float res = 0.0f;
				System.out.println("n1?");
				n1 = teclado.nextFloat();
				System.out.println("n2?");
				n2 = teclado.nextFloat();
				switch(opcion) {
					case 's':
						res = calculadora.sumar(n1, n2);
						break;
					case 'r':
						res = calculadora.restar(n1, n2);
						break;
					case 'm':
						res = calculadora.multiplicar(n1, n2);
						break;
					case 'd':
						res = calculadora.dividir(n1, n2);
						break;
				}
				System.out.println("Resultado: "+res);
			}
			else {
				continuar = false;
			}
		}
	}

}
