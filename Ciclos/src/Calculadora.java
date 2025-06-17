import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("*** Calculadora JAVA por Consola ***");

        //Defino Scanner
        var consola = new Scanner(System.in);

        //Pido dato
        System.out.println("Queres ejecutar la calculadora con un switch o con un if? ");
        System.out.println("Escribi 'switch' o 'if' ");
        var switchIf = consola.nextLine().strip().trim().toLowerCase();

        //Defino variables
        var res = 0.0;
        var num1 = 0.0;
        var num2 = 0.0;
        var salida = false;
        var opcion = 0;

        //Estructura condicionales
        if (switchIf.equals("switch")) {
        //Con switch y while
            while (!salida) {
                System.out.print("""
                        Operaciones que podes realizar:
                        1. SUMA
                        2. RESTA
                        3. MULTIPLICACION
                        4. DIVISION
                        5. SALIR
                        """);
                opcion = consola.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingresa el primer numero: ");
                        num1 = consola.nextDouble();

                        System.out.print("Ingresa el segundo numero: ");
                        num2 = consola.nextDouble();

                        res = num1+num2;
                        System.out.println("El resultado de la SUMA es: " + res);
                    }
                    case 2 -> {
                        System.out.print("Ingresa el primer numero: ");
                        num1 = consola.nextDouble();

                        System.out.print("Ingresa el segundo numero: ");
                        num2 = consola.nextDouble();

                        res = num1-num2;
                        System.out.println("El resultado de la RESTA es: " + res);
                    }
                    case 3 -> {
                        System.out.print("Ingresa el primer numero: ");
                        num1 = consola.nextDouble();

                        System.out.print("Ingresa el segundo numero: ");
                        num2 = consola.nextDouble();

                        res = num1*num2;
                        System.out.println("El resultado de la MULTIPLICACION es: " + res);
                    }
                    case 4 -> {
                        System.out.print("Ingresa el primer numero: ");
                        num1 = consola.nextDouble();

                        System.out.print("Ingresa el segundo numero: ");
                        num2 = consola.nextDouble();

                        res = num1/num2;
                        System.out.println("El resultado de la DIVISION es: " + res);
                    }
                    case 5 -> {
                        salida = true;
                        System.out.println("GRACIAS. HASTA LUEGO!");
                    }
                }
            }
        } else if (switchIf.equals("if")) {
            //Con if y while
            while (!salida) {
                System.out.print("""
                        Operaciones que podes realizar:
                        1. SUMA
                        2. RESTA
                        3. MULTIPLICACION
                        4. DIVISION
                        5. SALIR
                        """);
                opcion = consola.nextInt();
                if (opcion == 1) {
                    System.out.print("Ingresa el primer numero: ");
                    num1 = consola.nextDouble();

                    System.out.print("Ingresa el segundo numero: ");
                    num2 = consola.nextDouble();

                    res = num1+num2;
                    System.out.println("El resultado de la SUMA es: " + res);
                } else if (opcion == 2) {
                    System.out.print("Ingresa el primer numero: ");
                    num1 = consola.nextDouble();

                    System.out.print("Ingresa el segundo numero: ");
                    num2 = consola.nextDouble();

                    res = num1-num2;
                    System.out.println("El resultado de la RESTA es: " + res);
                } else if (opcion == 3) {
                    System.out.print("Ingresa el primer numero: ");
                    num1 = consola.nextDouble();

                    System.out.print("Ingresa el segundo numero: ");
                    num2 = consola.nextDouble();

                    res = num1*num2;
                    System.out.println("El resultado de la MULTIPLICACION es: " + res);
                } else if (opcion == 4) {
                    System.out.print("Ingresa el primer numero: ");
                    num1 = consola.nextDouble();

                    System.out.print("Ingresa el segundo numero: ");
                    num2 = consola.nextDouble();

                    res = num1/num2;
                    System.out.println("El resultado de la DIVISION es: " + res);
                } else if (opcion == 5) {
                    salida = true;
                    System.out.println("GRACIAS. HASTA LUEGO!");
                } else System.out.println("Opcion invalida");
            }
        } else System.out.println("Opcion invalida.");
    }
}
