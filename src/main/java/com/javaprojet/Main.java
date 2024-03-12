package com.javaprojet;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("Menu Principal");
            System.out.println("1. Operadores");
            System.out.println("2. Condicionales");
            System.out.println("3. Ciclos");
            System.out.println("99. Salir");
            System.out.print("Seleccione una opcion: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> operadores();
                case 2 -> condicionales();
                case 3 -> ciclos();
            }
        } while (option != 99);
    }

    private static void operadores() {
        int option;
        do {
            System.out.println("\nOperadores");
            System.out.println("1. Calcular el área de un triángulo.");
            System.out.println("2. Sumar dos números.");
            System.out.println("3. Elevar un número al cuadrado.");
            System.out.println("4. Convertir de euros a dólares.");
            System.out.println("5. Calcular área y perímetro de un cuadrado.");
            System.out.println("6. Determinar área y volumen de un cilindro.");
            System.out.println("7. Calcular longitud de circunferencia y área del círculo.");
            System.out.println("8. Calcular el promedio de tres números.");
            System.out.println("9. Volver al menú principal.");
            System.out.print("Seleccione una opcion: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> calcularAreaTriangulo();
                case 2 -> sumarNumeros();
                case 3 -> elevarAlCuadrado();
                case 4 -> convertirEurosADolares();
                case 5 -> calcularAreaPerimetroCuadrado();
                case 6 -> calcularAreaVolumenCilindro();
                case 7 -> calcularCircunferenciaYAreaCirculo();
                case 8 -> calcularPromedioTresNumeros();
                
            }
        } while (option != 9);
    }


    private static void calcularAreaTriangulo() {
        System.out.print("Ingrese base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese altura: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }

    private static void sumarNumeros() {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }

    private static void elevarAlCuadrado() {
        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();
        double cuadrado = Math.pow(numero, 2);
        System.out.println("El número elevado al cuadrado es: " + cuadrado);
    }
    
    private static void convertirEurosADolares() {
        System.out.print("Ingrese la cantidad en euros: ");
        double euros = scanner.nextDouble();
        System.out.print("Ingrese el tipo de cambio actual (1 euro a dólares): ");
        double tipoCambio = scanner.nextDouble();
        double dolares = euros * tipoCambio;
        System.out.println(euros + " euros equivalen a " + dolares + " dólares.");
    }
    
    private static void calcularAreaPerimetroCuadrado() {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        double perimetro = 4 * lado;
        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);
    }
    
    private static void calcularAreaVolumenCilindro() {
        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();
        double areaBase = Math.PI * Math.pow(radio, 2);
        double volumen = areaBase * altura;
        System.out.println("El área de la base del cilindro es: " + areaBase);
        System.out.println("El volumen del cilindro es: " + volumen);
    }
    
    private static void calcularCircunferenciaYAreaCirculo() {
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo es: " + area);
    }
    
    private static void calcularPromedioTresNumeros() {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();
        double promedio = (num1 + num2 + num3) / 3;
        System.out.println("El promedio es: " + promedio);
    }

    private static void condicionales() {
        int option;
        do {
            System.out.println("\nCondicionales");
            System.out.println("1. Determinar si un número es positivo o negativo.");
            System.out.println("2. Indicar cuál de dos números es mayor.");
            System.out.println("3. Indicar el menor y el mayor de tres números.");
            System.out.println("4. Sumar dos números si el primero es menor que el segundo, de lo contrario restarlos.");
            System.out.println("5. Encontrar el cociente entre dos números, manejar división por cero.");
            System.out.println("6. Sumar dos números si al menos uno es negativo, de lo contrario multiplicarlos.");
            System.out.println("7. Determinar si un año es bisiesto.");
            System.out.println("9. Volver al menú principal.");
            System.out.print("Seleccione una opcion: ");
            option = scanner.nextInt();
    
            switch (option) {
                case 1 -> determinarPositivoNegativo();
                case 2 -> indicarMayorDeDos();
                case 3 -> indicarMenorYMayorDeTres();
                case 4 -> sumarORestar();
                case 5 -> encontrarCociente();
                case 6 -> sumarOMultiplicar();
                case 7 -> determinarBisiesto();
            }
        } while (option != 9);
    }
    
    private static void determinarPositivoNegativo() {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es positivo.");
        }
    }
    
    private static void indicarMayorDeDos() {
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
            System.out.println("El menor es: " + num2);
        } else if (num2 > num1) {
            System.out.println("El mayor es: " + num2);
            System.out.println("El menor es: " + num1);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }

    private static void indicarMenorYMayorDeTres() {
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
    
        int mayor = Math.max(Math.max(num1, num2), num3);
        int menor = Math.min(Math.min(num1, num2), num3);
    
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
    }
    
    private static void sumarORestar() {
        System.out.print("Ingrese el primer número (A): ");
        int A = scanner.nextInt();
        System.out.print("Ingrese el segundo número (B): ");
        int B = scanner.nextInt();
    
        if (A < B) {
            System.out.println("La suma es: " + (A + B));
        } else {
            System.out.println("La resta es: " + (A - B));
        }
    }
    
    private static void encontrarCociente() {
        System.out.print("Ingrese el dividendo (A): ");
        double A = scanner.nextDouble();
        System.out.print("Ingrese el divisor (B): ");
        double B = scanner.nextDouble();
    
        if (B == 0) {
            System.out.println("La división por cero no está definida.");
        } else {
            double cociente = A / B;
            System.out.println("El cociente de " + A + " / " + B + " es: " + cociente);
        }
    }
    
    private static void sumarOMultiplicar() {
        System.out.print("Ingrese el primer número (A): ");
        int A = scanner.nextInt();
        System.out.print("Ingrese el segundo número (B): ");
        int B = scanner.nextInt();
    
        if (A < 0 || B < 0) {
            System.out.println("La suma es: " + (A + B));
        } else {
            System.out.println("El producto es: " + (A * B));
        }
    }
    
    private static void determinarBisiesto() {
        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();
    
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }
    
    private static void ciclos() {
        int option;
        do {
            System.out.println("\nCiclos");
            System.out.println("1. Imprimir múltiplos de 3 entre 1 y 100.");
            System.out.println("2. Imprimir números impares entre 0 y 100.");
            System.out.println("3. Imprimir números pares del 1 al 100.");
            System.out.println("4. Imprimir cuadrados de los números del 1 al 30.");
            System.out.println("5. Sumar cuadrados de los primeros 100 números naturales.");
            System.out.println("6. Generar números entre dos números dados en secuencia ascendente.");
            System.out.println("7. Sumar números ingresados por teclado hasta que se introduzca un cero.");
            System.out.println("9. Volver al menú principal.");
            System.out.print("Seleccione una opcion: ");
            option = scanner.nextInt();
    
            switch (option) {
                case 1 -> imprimirMultiplosDeTres();
                case 2 -> imprimirImpares();
                case 3 -> imprimirPares();
                case 4 -> imprimirCuadrados();
                case 5 -> sumarCuadrados();
                case 6 -> generarNumerosSecuencia();
                case 7 -> sumarHastaCero();
            }
        } while (option != 9);
    }
     
    private static void imprimirMultiplosDeTres() {
        System.out.println("Múltiplos de 3 entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Salto de línea para mejor formato en la salida
    }
    
    private static void imprimirImpares() {
        System.out.println("Números impares entre 0 y 100:");
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Salto de línea para mejor formato en la salida
    }
    
    private static void imprimirPares() {
        System.out.println("Números pares del 1 al 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Salto de línea para mejor formato en la salida
    }
    
    private static void imprimirCuadrados() {
        System.out.println("Cuadrados de los números del 1 al 30:");
        for (int i = 1; i <= 30; i++) {
            System.out.println("El cuadrado de " + i + " es: " + (i * i));
        }
    }
    
    private static void sumarCuadrados() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i * i;
        }
        System.out.println("La suma de los cuadrados de los primeros 100 números naturales es: " + suma);
    }
    
    private static void generarNumerosSecuencia() {
        System.out.print("Ingrese el número inicial: ");
        int inicio = scanner.nextInt();
        System.out.print("Ingrese el número final: ");
        int fin = scanner.nextInt();
    
        if (inicio < fin) {
            System.out.println("Números entre " + inicio + " y " + fin + ":");
            for (int i = inicio; i <= fin; i++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Salto de línea para mejor formato en la salida
        } else {
            System.out.println("El número inicial debe ser menor que el número final.");
        }
    }
    
    private static void sumarHastaCero() {
        int suma = 0, num;
        System.out.println("Ingrese números para sumar (0 para terminar):");
        do {
            num = scanner.nextInt();
            suma += num;
        } while (num != 0);
    
        System.out.println("La suma total es: " + suma);
    }
}
