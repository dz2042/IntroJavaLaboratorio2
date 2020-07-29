/*
Ejercicio:
Dado el siguiente código:
int a = 10, b=-2, c=5; // hay 2 números positivos y 1 negativo
Informar la multiplicación de los dos números positivos

Solucion:
Se define que la clase reciba 3 variable y haga la logica multiplicar e Informar.

Author: Dz2042
Fecha: 2020-07-29

*/
package laboratorioclase2;

public class Ejercicio2 {
   public static void main(int a, int b, int c) {
       int multi = 0;
       //Imprimo ejercicio
       String linea = "---------------------------------";
       System.out.println(linea);
       System.out.println("       Ejercicio 2");
       System.out.println(linea);
       //Imprimo variables recibidas
       System.out.println("a = " + a);
       System.out.println("b = " + b);
       System.out.println("c = " + c);
       
       //Logica
       if (a >= 0 & b >= 0 & c >= 0)
           System.out.println("los 3 nros son mayores o iguales a 0, ingrese al menos 1 negativo");
       else if (a < 0 & b < 0 & c < 0) 
           System.out.println("los 3 nros son Negativos, ingrese al menos 2 valores positivos");
       else if (a > 0 & b > 0 & c < 0){
           multi = a * b;
           System.out.println("a * b = " + multi);
       } else if (a > 0 & b < 0 & c > 0){
           multi = a * c;
           System.out.println("a * c = " + multi);
       } else if (a < 0 & b > 0 & c > 0){
           multi = b * c;
           System.out.println("b * c = " + multi);
       }
           
           
   }   
}
