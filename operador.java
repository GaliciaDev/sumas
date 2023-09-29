import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una forma geometrica: 1. Cuadrado, 2. Triangulo, 3. Circulo");
        String seleccion = scanner.nextLine();

        if (seleccion.equals("1")) {
            System.out.print("Ingrese la longitud de un lado del cuadrado: ");
            double lado = scanner.nextDouble();
            double area = Math.pow(lado, 2);
            double perimetro = 4 * lado;
            System.out.printf("El area del cuadrado es %.2f y el perimetro es %.2f", area, perimetro);
        } else if (seleccion.equals("2")) {
            System.out.print("Ingrese la base del triangulo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese la altura del triangulo: ");
            double altura = scanner.nextDouble();
            double area = 0.5 * base * altura;
            System.out.print("Ingrese el lado a del triangulo: ");
            double lado_a = scanner.nextDouble();
            System.out.print("Ingrese el lado b del triangulo: ");
            double lado_b = scanner.nextDouble();
            double perimetro = base + lado_a + lado_b;
            System.out.printf("El area del triangulo es %.2f y el perimetro es %.2f", area, perimetro);
        } else if (seleccion.equals("3")) {
            System.out.print("Ingrese el radio del circulo: ");
            double radio = scanner.nextDouble();
            double area = Math.PI * Math.pow(radio, 2);
            double circunferencia = 2 * Math.PI * radio;
            System.out.printf("El area del circulo es %.2f y la circunferencia es %.2f", area, circunferencia);
        } else {
            System.out.println("Seleccion invalida");
        }
    }
}