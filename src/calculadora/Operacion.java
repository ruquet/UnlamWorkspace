package calculadora;

import java.util.Scanner;

public class Operacion{	
	 
	 // atributos
 int a;
 int b;
 int suma;
 int resta;
 int multiplicacion;
 int division;
 Scanner teclado = new Scanner(System.in);
 // metodos
 
 public void LeerNumero() {
     System.out.println("Ingrese el primer numero");       
     a = teclado.nextInt();
    
     System.out.println("Ingrese el segundo numero");  
     b = teclado.nextInt();
 }
 
 public void sumar() {
	 suma = a+b;
	 System.out.println("La suma es: "+suma);
 }
 public void restar() {
	 resta = a-b;
	 System.out.println("La resta es: "+resta);
 }
 public void multiplicar() {
	 multiplicacion = a*b;
	 System.out.println("La multiplicacion es: "+multiplicacion);
 }
 public void dividir() {
	 division = a/b;
	 System.out.println("La division es: "+division);
 }
 
}

