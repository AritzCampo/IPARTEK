package com.ipartek.com.excepciones;

import java.util.Scanner;

import com.ipartek.formacion.Youtube;

/**
 * 
 * @author Curso
 *
 */
public class CrearVideoYoutube {

	public static void main(String[] args) throws Exception {
		boolean repetir=true;
		Youtube video = null;
		String codigo;
		String titulo;
		
		System.out.println("--------   CREAR VIDEO YOUTUBE   ----------");
		System.out.println("-------------------------------------------");
		Scanner sc = new Scanner(System.in);
		do {
		
		System.out.println("Introduzca titulo: ");
		titulo = sc.nextLine();
		
		System.out.println("Introduzca codigo: ");
		codigo = sc.nextLine();
		try {
			video = new Youtube(titulo, codigo);
			repetir = false;
			
		}catch (Exception e){
			System.out.println("Error " + e.getMessage());
		}
			
		}while(repetir);
		
		
		System.out.println("Video creado correctamente ");
		System.out.println(titulo + codigo);
		System.out.println(video);
		System.out.println("Enlace del video en Youtube: " + video.getUrl());
		
		sc.close();
	}

}
