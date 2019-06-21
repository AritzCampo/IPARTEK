package ejercicios.basicos.iterativas;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N, M;

        //Lectura de dos números enteros N Y M
        //N y M deben ser positivos
        //N debe ser menor que M
        do {
            System.out.print("Introduce un número entero positivo: ");
            N = sc.nextInt();
            if(N<=0){
                System.out.println("Debe introducir un número positivo");
            }
        }while(N<=0);
        do {
            System.out.print("Introduce otro número entero positivo mayor que " + N + ": ");
            M = sc.nextInt();
            if(M<=0){
                System.out.println("Debe introducir un número positivo");
            }else if(N>=M){
                System.out.println("Debe introducir un número mayor que " + N);
            }
        }while(M<=0 || N >=M);
          


        //Mostrar los múltiplos de N desde 1 hasta M
        System.out.println("\nMúltiplos de  " + N + " desde 1 hasta " + M + " : ");
        for (int i = N; i <= M; i++) {
            if (i % N == 0) {
                System.out.println(i);
            }
        }
	}

}
