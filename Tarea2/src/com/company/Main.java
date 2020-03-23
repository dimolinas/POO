package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static int numeroAleatorio(){
        return (int) Math.floor(Math.random()*10+0);
    }

    public static String leerLetras(){
        Scanner lector = new Scanner(System.in);
        return (String) lector.nextLine();
    }

    public static void imprimirPalabra(String arreglo[]){
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+" ");
        }
    }

    public static void main(String[] args){
        String[] palabrasMagicas = new String[10];
        palabrasMagicas[0] = "efimero";
        palabrasMagicas[1] = "superfluo";
        palabrasMagicas[2] = "inefable";
        palabrasMagicas[3] = "inconmensurable";
        palabrasMagicas[4] = "etereo";
        palabrasMagicas[5] = "sempiterno";
        palabrasMagicas[6] = "petricor";
        palabrasMagicas[7] = "perenne";
        palabrasMagicas[8] = "ojala";
        palabrasMagicas[9] = "luminiscencia";

        String palabraMagica = palabrasMagicas[numeroAleatorio()];
        int vidas = 7;
        String[] palabraVacia = new String[palabraMagica.length()];
        for(int i=0;i<palabraVacia.length;i++){
            palabraVacia[i] = "_";
        }
        imprimirPalabra(palabraVacia);
    }
}
//Hay que ver si mis cambios son visibles y editables
