package calculadora;

import java.util.Scanner;

public class calculadora {
	 
	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Ingrese su operación /n 1 para restar /n 2 para multiplicar /n 3 para dividir /n 4 para sumar");
			opcion = Integer.parseInt(teclado.next());
		}
            while (opcion < 1 && opcion > 4);
            System.out.println("Ingrese el primer numero");       
            a = teclado.nextInt();
           
            System.out.println("Ingrese el segundo numero");  
            b = teclado.nextInt();
           
            switch (opcion) {
         
            case 1:
            	resultado = a - b; 
            break;
            case 2:
            	resultado = a * b;
           break;
           case 3:
        	   resultado = a / b;   
            break;
           case 4:
        	   resultado = a + b;
           break;
            }
 
            System.out.println("El resultado es " + resultado.toString());
            }
	} 


