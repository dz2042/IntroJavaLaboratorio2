/*
Ejercicio:
Dado el siguiente código:
String usuario = “Pepito”, clave= “1234”;
Informar los siguientes casos:
Si usuario=”pepito” y clave=”1234” informar Bienvenido pepito!”
Si usuario=”pepito” y clave no es “1234” informar “Usuario incorrecto”
Si usuario no es “pepito” y clave= “1234” informar “Contraseña incorrecta”

Solucion:
Se define que la clase reciba 2 variables String y haga la logica 
de valdiar usuario y pass.

Author: Dz2042
Fecha: 2020-07-29

*/
package laboratorioclase2;

public class Ejercicio3 {
    public static void main(String usuario, String password) {
        String linea = "---------------------------------";
        System.out.println(linea);
        System.out.println("       Ejercicio 3");
        System.out.println(linea);
        //Imprimo variables recibidas
        System.out.println("usuario = " + usuario);
        System.out.println("Password = " + password);
        String Fusuario = "Pepito", FPassword = "1234";
        //Logica
        boolean isok = false;
        if (usuario.equals(Fusuario) & password.equals(FPassword))
            System.out.println("ACCESO CORRECTO");
        else if (!usuario.equals(Fusuario))
            System.out.println("Usuario incorrecto");
        else if (usuario.equals(Fusuario) & !password.equals(FPassword))
            System.out.println("Password incorrecta");

    }
}
