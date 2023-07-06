package org.example;

import jdk.swing.interop.SwingInterOpUtils;
import org.example.modulos.Herramienta;
import org.example.modulos.Samurai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creando objetos
        Samurai samurai =  new Samurai();
        Samurai samurai2 =  new Samurai();
        Herramienta herramienta = new Herramienta("escopeta", 90.0 );
        Scanner entradaPorTeclado = new Scanner(System.in);
        samurai.setNombres("Koshito micamoto");
        System.out.print("Digita la edad del primer samurai: ");
        samurai.setEdad(entradaPorTeclado.nextInt());
        //System.out.print("Digita el nombre del segundo samurai: ");
        //samurai2.nombres = entradaPorTeclado.nextLine();

        System.out.println("**********RESULTADOS*************");
        System.out.println("El samurai "+samurai.getNombres()+" tiene "+samurai.getEdad()+" años.");




    }
}