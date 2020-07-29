/*
Ejercicios del Laboratorio 2.
Se presenta un menu de ejcución de Cada Ejercicio

Author: DZ2042
Fecha: 2020-07-29
*/
package laboratorioclase2;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        String linea = "---------------------------------";
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println(linea);
        System.out.println("       Laboratorio 2");
        System.out.println(linea);
        System.out.println("");
        
        do{
            System.out.println(linea);
            System.out.println("Seleccione El Ejercicio a Ejecutar:");
            System.out.println(linea);
            System.out.println("1 - Ejercicio 1.");
            System.out.println("2 - Ejercicio 2.");
            System.out.println("3 - Ejercicio 3.");
            System.out.println("4 - Ejercicio 4.");
            System.out.println("21 - Bonus 1.");
            System.out.println("99 - Salir.");
            System.out.println("");
            System.out.print("Ingrese Opción:");
            if(teclado.hasNextInt()){
                   opcion = teclado.nextInt();
                   menu(opcion);
            }else{
                teclado.nextLine();
                System.out.println("Ingrese un valor Valido");
            }     
        }while(opcion != 99);                
    }
    
    public static void menu(int opcion){
        boolean ingresoOk = false;
        int nro1, nro2, nro3;
        String usuario, password;
        switch (opcion){
            case 1:
                System.out.println("");
                nro1 = PedirValor.PerdirInt("Ingrese Valor para variable nro1 = ");
                nro2 = PedirValor.PerdirInt("Ingrese Valor para variable nro2 = ");
                nro3 = PedirValor.PerdirInt("Ingrese Valor para variable nro3 = ");
                Ejercicio1.main(nro1, nro2, nro3);
                break;
            case 2:
                System.out.println("");
                nro1 = PedirValor.PerdirInt("Ingrese Valor para variable a = ");
                nro2 = PedirValor.PerdirInt("Ingrese Valor para variable b = ");
                nro3 = PedirValor.PerdirInt("Ingrese Valor para variable c = ");
                Ejercicio2.main(nro1, nro2, nro3);
                break;
            case 3:
                System.out.println("");
                usuario = PedirValor.PerdirString("usuario = ");
                password = PedirValor.PerdirString("Password= ");
                Ejercicio3.main(usuario, password);
                break;
            case 4:
                Ejercicio4.main();
                break;
            case 21:
                Bonus.Bonus1();
                break;
          
            default:
                System.out.println("Opción inválida.");
        }   
    }
}
