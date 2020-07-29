/*
Ejercicio:
Ingresar dos números y ofrecer al usuario un menú con las siguientes opciones:
“1-suma 2-resta 3-producto 4-división”. 
Luego, mostrar el resultado de la operación aritmética elegida.

Solucion:
minicalculadora.

Author: Dz2042
Fecha:2020-07-29

 */
package laboratorioclase2;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(){
        double valor1 = 0, valor2 = 0, resultado = 0;
        int opcion = 0;
        boolean isok = false;
        Scanner teclado = new Scanner(System.in);
        String linea = "---------------------------------";
        System.out.println(linea);
        System.out.println("       Ejercicio 4");
        System.out.println(linea);
        valor1 = PedirValor.PerdirDouble("Ingrese Valor 1: ");
        valor2 = PedirValor.PerdirDouble("Ingrese Valor 2: ");
        do{
            System.out.println(linea);
            System.out.println("Seleccione Opcion:");
            System.out.println(linea);
            System.out.println("1 - Suma.");
            System.out.println("2 - Resta.");
            System.out.println("3 - Producto.");
            System.out.println("4 - División.");
            System.out.println("");
            System.out.print("Ingrese Opción:");
            if(teclado.hasNextInt()){
                   opcion = teclado.nextInt();
                   isok = menu(opcion, valor1, valor2);
            }else{
                teclado.nextLine();
                System.out.println("Ingrese un valor Valido");
            }     
        }while(!isok); 
    }
    public static boolean menu(int opcion, double valor1, double valor2){
        double resultado = 0;
        boolean isok = true;
        switch (opcion){
            case 1:
                resultado = valor1 + valor2;
                System.out.println("Resultado Suma: " + resultado);
                break;
            case 2:
                resultado = valor1 - valor2;
                System.out.println("Resultado Resta: " + resultado);
                break;
            case 3:
                resultado = valor1 * valor2;
                System.out.println("Resultado Producto: " + resultado);
                break;
            case 4:
                resultado = valor1 / valor2;
                System.out.println("Resultado División: " + resultado);
                break;
            default:
                isok = false;
                System.out.println("Opción incorrecta");
        }
        return isok;
    }
}
