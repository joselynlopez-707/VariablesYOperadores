import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        // DECLARACIÓN Y USO DE VARIABLES// 
        System.out.println("===== DECLARACIÓN DE VARIABLES =====");

        System.out.print("Ingrese un número entero: ");
        int numeroEntero = sc.nextInt();

        System.out.print("Ingrese un número decimal (double): ");
        double numeroDecimal = sc.nextDouble();

        sc.nextLine(); 

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("¿Es estudiante? (true/false): ");
        boolean esEstudiante = sc.nextBoolean();

        System.out.println("\nValores ingresados:");
        System.out.println("Entero: " + numeroEntero);
        System.out.println("Decimal: " + numeroDecimal);
        System.out.println("Nombre: " + nombre);
        System.out.println("Es estudiante: " + esEstudiante);

        //  OPERACIONES MATEMÁTICAS // 
        System.out.println("\n===== OPERACIONES CON INT =====");

        System.out.print("Ingrese primer número entero: ");
        int a = sc.nextInt();

        System.out.print("Ingrese segundo número entero: ");
        int b = sc.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b)); 
        System.out.println("\n===== OPERACIONES CON DOUBLE =====");

        double x = a;
        double y = b;

        System.out.println("División double: " + (x / y));

        System.out.println("\n===== OPERACIONES CON FLOAT =====");

        float f1 = a;
        float f2 = b;

        System.out.println("División float: " + (f1 / f2));

        System.out.println("\n===== OPERACIONES CON SHORT =====");

        short s1 = (short) a;
        short s2 = (short) b;

        System.out.println("Suma short: " + (s1 + s2));

        System.out.println("\n===== OPERACIONES CON BYTE =====");

        byte by1 = (byte) a;
        byte by2 = (byte) b;

        System.out.println("Suma byte: " + (by1 + by2));

        
        // OPERACIONES LÓGICOS// 
        System.out.println("\n===== OPERACIONES LÓGICAS =====");

        System.out.print("Ingrese primer número para comparar: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese segundo número para comparar: ");
        int num2 = sc.nextInt();

        System.out.println("¿num1 > num2? " + (num1 > num2));
        System.out.println("¿num1 < num2? " + (num1 < num2));
        System.out.println("¿num1 == num2? " + (num1 == num2));

        System.out.println("¿Ambos son positivos? " + (num1 > 0 && num2 > 0));
        System.out.println("¿Alguno es positivo? " + (num1 > 0 || num2 > 0));

        // CLASIFICACIÓN DE EDAD// 
        System.out.println("\n===== CLASIFICACIÓN DE EDAD =====");

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 12) {
            System.out.println("Niño");
        } else if (edad <= 17) {
            System.out.println("Adolescente");
        } else if (edad <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }

        // DÍA DE LA SEMANA// 
        System.out.println("\n===== DÍA DE LA SEMANA =====");

        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido");
        }

        //  VERIFICACIÓN DE ACCESO// 

        System.out.println("\n===== VERIFICACIÓN DE ACCESO =====");

        sc.nextLine(); 

        System.out.print("Ingrese usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Ingrese contraseña: ");
        String contraseña = sc.nextLine();

        String usuarioCorrecto = "admin";
        String contraseñaCorrecta = "1234";

        if (usuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)) {
            System.out.println("Acceso concedido");
        } else if (usuario.equals(usuarioCorrecto)) {
            System.out.println("Contraseña incorrecta");
        } else {
            System.out.println("Usuario no registrado");
        }

        sc.close();
    }
}