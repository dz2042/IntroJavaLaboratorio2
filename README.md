# IntroJavaLaboratorio2

Laboratorio 2 de Intro a Java en Educación IT

Ejercicio 1
Dado el siguiente código:
int nro1 = 100, nro2 = 500, nro3 = 250;
Informar cual de los tres números es mayor    
Pseudocódigo
PROGRAMA 1
 
LEER n1,n2,n3
SI n1>n2 y n1>n3
ENTONCES
                     INFORMAR "n1 es el mayor"
FIN SI
SI n2>n1 y n2>n3
ENTONCES
                     INFORMAR  "n2 es el mayor"
          
FIN SI
SI n3>n2 y n3>n1
ENTONCES
                     "n3 es el mayor"
         
 FIN SI
 FIN PROGRAMA
Diagramación
 
Codificación en Java
Copiar a Clipboard
int nro1 = 10,nro2 = 20, nro3 = 30;
               if(nro1 > nro2 & nro1 > nro3) { System.out.println(" el nro1 es el mayor: " + nro1); }
                  if (nro2 > nro1 & nro2 > nro3) { System.out.println(" el nro2 es el mayor: " + nro2); }
               if (nro3 > nro2 & nro3 > nro1) { System.out.println(" el nro3 es el mayor: " + nro3); }
        
Prueba de escritorio
nro1	nro2	nro3	El mayor es
10	20	30	nro3
10	20	10	nro1
20	30	10	nro2
30	10	20	nro1
20	10	30	nro3
10	30	20	nro2
Ejercicio 2
Dado el siguiente código:
int a = 10, b=-2, c=5; // hay 2 números positivos y 1 negativo
Informar la multiplicación de los dos números positivos
Pseudocódigo
PROGRAMA 2
 
LEER a,b,c
SI a>0 y b>0
ENTONCES
                     INFORMAR a*b
FIN SI
SI a>0 y c>0
ENTONCES
                     INFORMAR a*c
FIN SI
SI b>0 y c>0
ENTONCES
                     INFORMAR a*b
FIN SI
FIN PROGRAMA
Diagramación
 
Codificación en Java
       
Copiar a Clipboard
      
 int a = -10, b = 2, c = 5;
                if (a > 0 & b > 0) { System.out.println("a x b = " + a * b); }
                      if (a > 0 & c > 0) { System.out.println("a x c = " + a * c); }
                      if (b > 0 & c > 0) { System.out.println(" b x c = " + b * c); }
Prueba de escritorio
	a	b	c	producto
1	positivo	positivo	negativo	a * b
2	positivo	negativo	positivo	a * c
3	negativo	positivo	positivo	b * c
Ejercicio 3
Dado el siguiente código:
String usuario = “Pepito”, clave= “1234”;
Informar los siguientes casos:
Si usuario=”pepito” y clave=”1234” informar Bienvenido pepito!”
Si usuario=”pepito” y clave no es “1234” informar “Usuario incorrecto”
Si usuario no es “pepito” y clave= “1234” informar “Contraseña incorrecta”
Pseudocódigo
PROGRAMA 2
 
LEER usuario,clave
SI usuario=”Pepito” y clave=”EducacionIt”
ENTONCES
                     INFORMAR “Bienvenido pepito!!”
FIN SI
SI usuario!=”Pepito” y clave=”EducacionIt”
ENTONCES
                     INFORMAR “Usuario incorrecto”
FIN SI
SI usuario=”Pepito” y clave!=”EducacionIt”
ENTONCES
                     INFORMAR “Contraseña incorrecta!”
FIN SI
Diagramación
 
Codificación en Java
Copiar a Clipboard
String user="Pepito", pass="1234";
if(user.equals("Pepe") & pass.equals("1234"))  { System.out.println("Bienvenido Pepe!!"); }
if(!(user.equals("Pepe")) & pass.equals("1234")) { System.out.println("usuario incorrecto"); }
if(user.equals("Pepe") & !(pass.equals("1234"))) { System.out.println("Contraseña incorrecta"); }
Prueba de escritorio
CASO	user	pass	mensaje
1	es “Pepito”	es “1234”	“Bienvenido Pepe!!”
2	no es “Pepito”	 es “1234” 	“Usuario incorrecto”
3	es “Pepito”	no es “1234” 	“Contraseña incorrecta”
Ejercicio 4 - Switch Case
Ingresar dos números y ofrecer al usuario un menú con las siguientes opciones: “1-suma 2-resta 3-producto 4-división”. Luego, mostrar el resultado de la operación aritmética elegida.
Pseudocódigo
DEFINIR n1, n2,opcion
LEER n1
LEER n2
LEER opcion
SI opcion= ’ + ‘  ENTONCES
                   INFORMAR n1 + n2
 FIN SI
SINO
SI opcion = ’ - ‘  ENTONCES
                   INFORMAR n1 - n2
FIN SI
SINO
SI opcion = ’ * ‘  ENTONCES
                   INFORMAR n1 * n2
 FIN SI
SINO
SI opcion = ’ / ‘  ENTONCES
                   INFORMAR n1/ n2
 FIN SI
Codificación en Java
Copiar a Clipboard
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = teclado.nextInt();
        System.out.println("1-suma 2-resta 3-producto 4-division: ");
        String opcion = teclado.next();
        switch (opcion) {
            case "+":
                System.out.println("Resultado:" + (n1 + n2));
                break;
            case "-":
                System.out.println("Resultado:" + (n1 - n2));
                break;
            case "/":
                System.out.println("Resultado:" + (n1 / n2));
                break;
            case "*":
                System.out.println("Resultado:" + (n1 * n2));
                break;
            default:
                System.out.println("Por favor, elija la operación!");
                break;
        }
Definir n1 y n2 como double, ejecutar nuevamente y analizar resultado. Que diferencia existe en la salida? Por qué?
Prueba de escritorio
n1	n2	opción	Salida
10	5	+	15
10	5	-	5
10	5	*	50
10	5	/	2
BONUS
Ejercicio 1 - Operador condicional
Dado el siguientes códigos, informe los distintos valores de n3
Copiar a Clipboard
System.out.println(“A”);
int n1=20;
int n2=10;
int n3=(n1>n2)? n1:0;
System.out.println(n3);
System.out.println(“B”);
int n1=20;
int n2=10;
int n3=(n1<n2)? n1:0;
System.out.println(n3);
System.out.println(“C”);
int n1=20;
int n2=10;
int n3=(n1==n2)? n1:0;
System.out.println(n3);
System.out.println(“D”);
int n1=20;
int n2=10;
int n3=(n1!=n2)? n1:0;
System.out.println(n3);
Prueba de escritorio
	n1	n2	n3
A			
B			
C			
D			
Solución
	n1	n2	n3
A	20	10	20
B	20	10	0
C	20	10	0
D	20	10	20

