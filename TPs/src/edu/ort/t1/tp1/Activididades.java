package edu.ort.t1.tp1;

import java.util.Scanner;
import java.text.DecimalFormat;
import edu.ort.t1.tp1.PersonasAporte;
import edu.ort.t1.tp1.MontañarusaPersonas;

public class Activididades {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
//		actividad_1 ();
	
//		actividad_2 ();
	
//		actividad_3 ();
	
//		actividad_4 ();
	
//		actividad_5 ();		
		
//		actividad_6 ();	
		
//		actividad_7 ();
		
//		actividad_7 ();
		
//		actividad_8 ();
		
//		actividad_9 ();
		
//		actividad_10 ();
		
//		actividad_11 ();
		
//		actividad_12 ();
		
//		actividad_14 ();
		
//		actividad_15 ();
		
//		actividad_16 ();
		
//		actividad_17 ();
		
//		actividad_18 ();
		
//		actividad_19 ();
		
		actividad_20 ();

}
	
	public static void actividad_1 (){
		String name;
		
		do{
			System.out.println("Ingresa tu nombre");
			name = input.nextLine();
			if(name.length() < 3){
			System.out.println("Tiene que tener minimo 3 caracteres");
			};
		}while (name.length() < 3);
	}
	
	public static void actividad_2 (){
	
				int notas[] = new int [3];
				float suma = 0;
				System.out.println("Ingresa tus notas: ");
				for(int i = 0; i < notas.length; i++){
					
					do{
						try{
							System.out.print("Nota " + (i+1) + ": ");
							notas[i] = Integer.parseInt(input.nextLine());
							if(notas[i] > 10 || notas[i] < 0){
								System.out.println("La nota debe estar entre 0 y 10");
								continue;
							}
							break;
						}
						catch(NumberFormatException error){
							System.err.println("Debes ingresar un número ");
						}
					}while (true);
					
					suma += notas[i];
				}
				
				System.out.println("Tu promedio es de: " + suma / notas.length);
				
	}

	public static void actividad_3 () {
		System.out.print("Ingresa un numero: ");
		int number = Integer.parseInt(input.nextLine());
		System.out.println("El numero que ingresaste es: " + number);
		System.out.println(number + " x " + 5 + " es: " + (number*5));
		System.out.println(number + " / " + 2 + " es: " + (number/2));
	}

	public static void actividad_4 () {

		System.out.print("Ingresa tu valor monetario por hora: ");
		int valorMonetario = Integer.parseInt(input.nextLine());
		System.out.print("Ingresa tus horas trabajadas: ");
		int horasTrabajadas = Integer.parseInt(input.nextLine());
		int valorPorSemana = ( ( horasTrabajadas * 5 ) + (horasTrabajadas/2) ) * valorMonetario ;
		System.out.print("valor del salario por semana: " + valorPorSemana );
		
	}

	public static void actividad_5 () {

		System.out.print("El valor que ingresaste en num1 es: ");
		float num1 = Float.parseFloat(input.nextLine());
		System.out.print("El valor que ingresaste en num2 es: ");
		float num2 = Float.parseFloat(input.nextLine());
		float num3;
		
		num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.print("El valor que tenes en la variable num1 es: " + num1 + " y en num2 es: " + num2);
	}

	public static void actividad_6 () {

		
		System.out.print("ingresa tus ventas totales de este mes: ");
		int ventasTotalesMes = Integer.parseInt(input.nextLine());
		int sueldoFijo = 44_000;
		float totalAcobrar = sueldoFijo + ( ventasTotalesMes * 1.16f );
		
		DecimalFormat formato = new DecimalFormat("#,###.##");		
		String totalAcobrarFormateado = formato.format(totalAcobrar);
		
		System.out.print("Tu sueldo este mes es de: $" + totalAcobrarFormateado);
	}
	
	public static void actividad_7 () {
		    
		System.out.print("ingresa el ancho del terreno: ");
		float ancho = Float.parseFloat(input.nextLine());
		System.out.print("ingresa el largo del terreno: ");
		float largo = Float.parseFloat(input.nextLine());
		System.out.print("ingresa el valor del metro cuadrado: ");
		float valorMetroCuadrado = Float.parseFloat(input.nextLine());
		float areaDelTerro = ancho * largo;
		float valorDelTerreno = areaDelTerro * valorMetroCuadrado;		
		float metrosCerca = ( ancho * 2 ) + ( largo * 2 );

		String areaDelTerrenoFormateado = String.format("%,.2f", valorDelTerreno);
		
		System.out.println("El valor total del terreno es: $" + areaDelTerrenoFormateado);
		System.out.println("La cantidad de metros de cerca que se necesita son: " + metrosCerca + 'm');
		
	}
	
	public static void actividad_8 () {
		System.out.print("Ingresa el primer numero por favor: ");
		float num1 = Float.parseFloat(input.nextLine());
		System.out.print("Ingresa el segundo numero por favor: ");
		float num2 = Float.parseFloat(input.nextLine());
		System.out.print("Ingresa uno de los siguientes operadores: +, -, / o * ");
		char operador = input.next().charAt(0);
		
		switch (operador) {
		case '+':
			System.out.print("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
			break;
		case '-':
			System.out.print("La resta de " + num1 + " y " + num2 + " es: " + (float) (num1 - num2));
			break;
		case '/':
			System.out.print("La division de " + num1 + " y " + num2 + " es: " + (float) (num1 / num2));
			break;
		case '*':
			System.out.print("La multiplicacion de " + num1 + " y " + num2 + " es: " + (float) (num1 * num2));
			break;
		default:
		System.out.print("El operador que ingreso es incorrecto");
			break;
		}
		
	}
	
	public static void actividad_9 () {
		System.out.print("Ingresa el primer angulo por favor: ");
		int num1 = Integer.parseInt(input.nextLine());
		System.out.print("Ingresa el segundo angulo por favor: ");
		int num2 = Integer.parseInt(input.nextLine());
		int tercerAngulo = 180 - ( num1 + num2 ); 
		
		System.out.print("El tercer angulo interior es: " + tercerAngulo + "°");
	}

	public static void actividad_10 () {
		PersonasAporte donadores[] = new PersonasAporte[3];
		String name;
		float aporte;
		float totalAporte = 0;
		for (int i = 0; i < donadores.length; i++) {
			System.out.print("Ingresa el nombre de la persona " + ( i + 1 ) + ": " );
			name = input.nextLine();
			System.out.print("Ingresa el aporte de la persona " + ( i + 1 ) + ": " );
			aporte = Float.parseFloat(input.nextLine());
			donadores[i] = new PersonasAporte(name, aporte);
			totalAporte += donadores[i].getAporte();
		}
		
		System.out.println();	
		
		for (int i = 0; i < donadores.length; i++) {
			System.out.print("donador: " + donadores[i].getNombre());
			System.out.println(" aporte: " + donadores[i].getAporte());
			System.out.println("porcentaje aportado: " + ( donadores[i].getAporte() * 100) / totalAporte);	
			System.out.println();	
		}
		System.out.println("El aporte total de los 3 donadores es de: $" + totalAporte);
	}

	public static void actividad_11 () {
		System.out.print("Ingresa un numero: ");
		int number = Integer.parseInt(input.nextLine());
		
		if (( number % 2 ) != 0){
			System.out.print("El numero que ingresaste " + number + " no es par");
			return;
		}
		System.out.print("El numero que ingresaste " + number + " es par ");
	}
	
	public static void actividad_12 () {
		System.out.print("Ingresa el primer numero: ");
		int number1 = Integer.parseInt(input.nextLine());
		System.out.print("Ingresa el segundo numero: ");
		int number2 = Integer.parseInt(input.nextLine());
		
		if (number1 > number2){
			System.out.print("El primer numero que ingresaste " + number1 + " es mayor a " + number2);
			return;
		}
		System.out.print("El segundo numero que ingresaste " + number2 + " es mayor a " + number1);
		
	}
	
	public static void actividad_13 () {
		int numbers[] = new int [3];
		double negInf = Double.NEGATIVE_INFINITY;
				
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Ingresa el el numero " + ( i + 1 ) + ": ");
			numbers[i] = Integer.parseInt(input.nextLine());
			
			if(numbers[i] > negInf){
				negInf = numbers[i];
			}
		}
		System.out.println("Los numeros que ingresaste son: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("El numero mas grande es: " + negInf);
	}
	
	public static void actividad_14 () {
		MontañarusaPersonas ingresantes[] = new MontañarusaPersonas[4];
		
		String name;
		float altura;
		int edad;
		
		float alturaMinima = 1.50f;
		int edadMinima = 7;
		
		for (int i = 0; i < ingresantes.length; i++) {
			System.out.print("Ingresa el nombre de la persona " + ( i + 1 ) + ": " );
			name = input.nextLine();
			
			System.out.print("Ingresa la altura de la persona " + ( i + 1 ) + ": " );
			altura = Float.parseFloat(input.nextLine());
			
			System.out.print("Ingresa la edad de la persona " + ( i + 1 ) + ": " );
			edad = Integer.parseInt(input.nextLine());
			
			ingresantes[i] = new MontañarusaPersonas(name, altura, edad);
			System.out.print("");
		}
		
		System.out.print("");
		
		for (int i = 0; i < ingresantes.length; i++) {
			if(ingresantes[i].getEdad() >= edadMinima && ingresantes[i].getAltura() >= alturaMinima){
				System.out.println("El ingresante " + ingresantes[i].getNombre() + " puede pasar ya que tiene una altura de " + ingresantes[i].getAltura() + " y tiene " + ingresantes[i].getEdad() + " años");
			}
		}
		
	}

	public static void actividad_15 () {
MontañarusaPersonas ingresantes[] = new MontañarusaPersonas[4];
		
		String name;
		float altura;
		int edad;
		
		float alturaMinima = 1.51f;
		int edadMinima = 7;
		
		for (int i = 0; i < ingresantes.length; i++) {
			System.out.print("Ingresa el nombre de la persona " + ( i + 1 ) + ": " );
			name = input.nextLine();
			
			System.out.print("Ingresa la altura de la persona " + ( i + 1 ) + ": " );
			altura = Float.parseFloat(input.nextLine());
			
			System.out.print("Ingresa la edad de la persona " + ( i + 1 ) + ": " );
			edad = Integer.parseInt(input.nextLine());
			
			ingresantes[i] = new MontañarusaPersonas(name, altura, edad);
			System.out.print("");
		}
		
		System.out.print("");
		
		for (int i = 0; i < ingresantes.length; i++) {
			if(ingresantes[i].getEdad() >= edadMinima || ingresantes[i].getAltura() >= alturaMinima){
				System.out.println("El ingresante " + ingresantes[i].getNombre() + " puede pasar ya que tiene una altura de " + ingresantes[i].getAltura() + " y tiene " + ingresantes[i].getEdad() + " años");
			}
		}
	}

	public static void actividad_16 () {
		System.out.print("Ingresar la cantidad de inscriptos: ");
		int inscriptos = Integer.parseInt(input.nextLine());
		System.out.print("Ingresar la cantidad de asientos: ");
		int asientos = Integer.parseInt(input.nextLine());
		
		System.out.print("");
		
		if(inscriptos > asientos){
			System.out.println("No alcazan los asientos, hay " + asientos + " asientos y son " + inscriptos + " personas");
			System.out.println("La cantidad de asientos que faltan para que entren todos es de: " + ( inscriptos - asientos ));
			return;
		}
		
		System.out.print("Entraron todos");
		
	}

	public static void actividad_17 () {
		System.out.print("Ingresa tu edad: ");
		int edad = Integer.parseInt(input.nextLine());
		System.out.print("Ingresa tu genero F/M: ");
		char generoChar = input.next().charAt(0);
		char genero = Character.toUpperCase(generoChar);
			
		if(( edad < 0 || edad > 121 ) && ( genero != 'F' || genero != 'M' )){
			System.out.print("edad fuera de rango o género inválido");
			return;
		};
		
		if(genero == 'F' && edad >= 60){
			System.out.print("Estas en la edad de jubilarte");
			return;
		};
		
		if(genero == 'M' && edad >= 65){
			System.out.print("Estas en la edad de jubilarte");
			return;
		};
		
		System.out.print("Aún no estás en la edad de jubilarte");
	}	

	public static void actividad_18 () {
		System.out.print("Ingresa el primer numero: ");
		int number_1 = Integer.parseInt(input.nextLine());
		System.out.print("Ingresa el segundo numero: ");
		int number_2 = Integer.parseInt(input.nextLine());
		int mayor = Math.max(number_1, number_2);
		int menor = Math.min(number_1, number_2);
		
		String mensaje = (mayor  % menor == 0) ?"Es divisible" : "No es divisible";
		System.out.print(mensaje);
	}

	public static void actividad_19 () {
		int number_1 = (int)(Math.random()*10+1);
		System.out.print("El numero que tenes es: " + number_1);
		boolean esDeUnSoloDigito = number_1 >= 0 && number_1 < 10;
		boolean esImpar = number_1 % 2 != 0;
		boolean estaEnAmbosGrupos = esDeUnSoloDigito && esImpar;
		boolean noEstaEnNingunGrupo = !estaEnAmbosGrupos;
		
		System.out.println("");
		
		if(esDeUnSoloDigito){
			System.out.println("Es de un solo digito " + number_1);
		}
		
		if(esImpar){
			System.out.println("Es impar " + number_1);
		}
		
		if(estaEnAmbosGrupos){
			System.out.println("Esta en ambos grupos es de un solo digito y es impar " + number_1);
			return;
		}		
		System.out.println("No esta en ningun grupo " + number_1);
	}
}
