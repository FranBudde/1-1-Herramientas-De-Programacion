package edu.ort.t1.tp1;
import java.util.Scanner;

public class Activididad_1 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String name;
		
		//punto 1
		do{
			System.out.println("Ingresa tu nombre");
			name = input.nextLine();
			if(name.length() < 3){
			System.out.println("Tiene que tener minimo 3 caracteres");
			};
		}while (name.length() < 3);
		
		
		//Punto 2
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

}
