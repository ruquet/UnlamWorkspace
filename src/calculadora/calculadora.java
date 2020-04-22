package calculadora;

import java.util.Scanner;


public class calculadora {
       
        public static void main(String[] args)  {                    
            Integer opcion;
            Operacion op = new Operacion();
           
            Scanner teclado = new Scanner(System.in);
            do{
                System.out.println("Ingrese su operación \n 1 para restar \n 2 para multiplicar \n 3 para dividir \n 4 para sumar");  
            opcion = teclado.nextInt();   

            teclado.close();
            }
            while (opcion < 1 && opcion > 4);
            
            op.LeerNumero();
           
            switch (opcion) {
         
            case 1:
            	op.restar();
            	
            break;
            case 2:
            	op.multiplicar();
           break;
           case 3:
        	   op.dividir(); 
            break;
           case 4:
        	   op.sumar();
           break;
            }
            }
        }

