package edu.ort.t1.tp1;
import java.util.Scanner;
import java.text.DecimalFormat;
import edu.ort.t1.tp1.PersonasAporte;


public class Activididad_1 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
//		actividad_1();
	
//		actividad_2();
	
//		actividad_3();
	
//		actividad_4();
	
//		actividad_5();		
		
//		actividad_6();	
		
//		actividad_7();
		
//		actividad_7();
		
//		actividad_8();
		
//		actividad_9();
		
		activida_10 ();
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
							System.err.println("Debes ingresar un n�mero ");
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
		
		System.out.print("El tercer angulo interior es: " + tercerAngulo + "�");
	}

	public static void activida_10 () {		
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

}
