package ejercicios1y2;

import java.util.Arrays;
import java.util.Collections;

public class EjercitacionClase3 {

	public static void main(String[] args) {
	
		
		System.out.println("a)Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String:");
		
		String variableString = "Dado un String y una letra";
		char unaLetra = 'a';
		int cantVecesDeAparicion= 0;
		
		for(int i= 0; i < variableString.length(); i++) {
			
			if(variableString.charAt(i) == unaLetra) {
				cantVecesDeAparicion++;
			}
			
		}
		System.out.println("Cantidad de veces que aparece la letra \""+unaLetra+"\" : "+cantVecesDeAparicion); 
		
		
		
		
		System.out.println("b) Dados 3 numeros y un orden (ascendente y decreciente) que ordene los mismos y los retorne en un vector de tres:");
		
		Integer numeros[] = {-2,23,0};
		boolean ascendente = true;
		
		
		if(ascendente) {
			//Ordenar de menor a mayor
			Arrays.sort(numeros);
		} else {
			//Ordenar de mayor a menor
			//Comparator.reverseOrder() o Collections.reverseOrder
			Arrays.sort(numeros, Collections.reverseOrder());
		}
		for(int elemento : numeros) {
			System.out.println(elemento);
		}
		
		System.out.println("c) dado un vector de numeros, y un numero X, que sume todos los numeros > X y retorne el resultado:");
		int vectorNumeros [] = {10,20,30,50,-2,50,-10};
		int X = 40;
		int sumatoriaDeNumeros = 0;
		
		for(int num : vectorNumeros) {
			if(num >= X)
			sumatoriaDeNumeros = sumatoriaDeNumeros + num;
		}
		 System.out.println("La sumatoria de los valores mayores o iguales a \""+X+"\" es:" +sumatoriaDeNumeros);
		 
		 
		 System.out.println("2) Genere una clase que tenga los metodos para realizar la codificacion y decodificacion de un string, dado un numero de desplazamiento:");
		 
		 String frase = "hola que tal";
			byte[] decodedBytes = frase.getBytes();
			byte desplazamiento = 1;
			
			for( int j = 0; j < decodedBytes.length ; j++) {
				
				decodedBytes[j] = (byte) (decodedBytes[j] + desplazamiento);
				frase = new String (decodedBytes);
				System.out.println(frase);
	
                        }
              }
 }

