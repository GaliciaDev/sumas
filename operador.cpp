#include <stdio.h>
#include <math.h>

int main() {
    int seleccion;
    float lado, base, altura, lado_a, lado_b, radio, area, perimetro, circunferencia;

    printf("Seleccione una forma geometrica: 1. Cuadrado, 2. Triangulo, 3. Circulo\n");
    scanf("%d", &seleccion);

    if (seleccion == 1) {
        printf("Ingrese la longitud de un lado del cuadrado: ");
        scanf("%f", &lado);
        area = pow(lado, 2);
        perimetro = 4 * lado;
        printf("El area del cuadrado es %.2f y el perimetro es %.2f", area, perimetro);
    } else if (seleccion == 2) {
        printf("Ingrese la base del triangulo: ");
        scanf("%f", &base);
        printf("Ingrese la altura del triangulo: ");
        scanf("%f", &altura);
        area = 0.5 * base * altura;
        printf("Ingrese el lado a del triangulo: ");
        scanf("%f", &lado_a);
        printf("Ingrese el lado b del triangulo: ");
        scanf("%f", &lado_b);
        perimetro = base + lado_a + lado_b;
        printf("El area del triangulo es %.2f y el perimetro es %.2f", area, perimetro);
    } else if (seleccion == 3) {
        printf("Ingrese el radio del circulo: ");
        scanf("%f", &radio);
        area = M_PI * pow(radio, 2);
        circunferencia = 2 * M_PI * radio;
        printf("El area del circulo es %.2f y la circunferencia es %.2f", area, circunferencia);
    } else {
        printf("Seleccion invalida");
    }

    return 0;
}