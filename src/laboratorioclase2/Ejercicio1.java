/*
Ejercicio:
Dado el siguiente código:
int nro1 = 100, nro2 = 500, nro3 = 250;
Informar cual de los tres números es mayor    

Solucion:
Se define que la clase reciba 3 variable y haga la logica de calcular cua es el 
mayor.

Author: Dz2042
Fecha: 2020-07-29

*/
package laboratorioclase2;

public class Ejercicio1 {
    public static void main(int nro1, int nro2, int nro3) {
        //Imprimo Ejercicio
        String linea = "---------------------------------";
        System.out.println(linea);
        System.out.println("       Ejercicio 1");
        System.out.println(linea);
        
        //Imprimo variables recibidas
        System.out.println("nro1 = " + nro1);
        System.out.println("nro2 = " + nro2);
        System.out.println("nro3 = " + nro3);
        
        //Logica
        if (nro1 > nro2 & nro1 > nro3)
            System.out.println("nro1 es mayor");
        else if(nro2 > nro1 & nro2 > nro3)
            System.out.println("nro2 es mayor");
        else if(nro3 > nro1 & nro3 > nro2)
            System.out.println("nro3 es mayor");
        else
            System.out.println("Los nros son iguales");
        
        //No lleva llaves ya que la logica del if es una sola linea
    }
            
}
