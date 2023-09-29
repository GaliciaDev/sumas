import math

print("Seleccione una forma geometrica: 1. Cuadrado, 2. Triangulo, 3. Circulo")
seleccion = input()

if seleccion == "1":
    lado = float(input("Ingrese la longitud de un lado del cuadrado: "))
    area = lado ** 2
    perimetro = 4 * lado
    print(f"El area del cuadrado es {area} y el perimetro es {perimetro}")
elif seleccion == "2":
    base = float(input("Ingrese la base del triangulo: "))
    altura = float(input("Ingrese la altura del triangulo: "))
    area = 0.5 * base * altura
    lado_a = float(input("Ingrese el lado a del triangulo: "))
    lado_b = float(input("Ingrese el lado b del triangulo: "))
    perimetro = base + lado_a + lado_b
    print(f"El area del triangulo es {area} y el perimetro es {perimetro}")
elif seleccion == "3":
    radio = float(input("Ingrese el radio del circulo: "))
    area = math.pi * radio ** 2
    circunferencia = 2 * math.pi * radio
    print(f"El area del circulo es {area} y la circunferencia es {circunferencia}")
else:
    print("Seleccion invalida")