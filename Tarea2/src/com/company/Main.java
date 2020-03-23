package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static int numeroAleatorio(){return (int) Math.floor(Math.random()*10+0);
    }

    public static String leerLetras(){
        //Lee la letra ingresada por el usuario
        Scanner lector = new Scanner(System.in);
        return (String) lector.nextLine();
    }

    public static void imprimirPalabra(String arreglo[]){
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+" ");
        }
    }

    public static void main(String[] args){
        String[] palabrasMagicas = new String[10]; //Arreglo Palabras Predefinidas
        String palabraMagica = palabrasMagicas[numeroAleatorio()]; //Palabra escogida aleatoriamente, se escoge una palabra cualquiera según el número aleatorio aquél
        String[] palabraVacia = new String[palabraMagica.length()]; //Arreglo palabra vacia
        int vidas = 7; //Numero de intentos

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

        for(int i=0;i<palabraVacia.length;i++){
            palabraVacia[i] = "_"; //Se ponen los espacios de las letras de la palabra
        }

        /*
        Aquí, la palabra que mete el usuario se lee sólo una vez (renglón 55) y se mete dentro de una variable
        (Si no lo meto dentro de la variable, la función se ejecuta varias veces)
        Después, en el if, verifica si la letra está dentro de la palabra. Si sí, sigue. Si no, sale "Paila" JAJA
        (Toca mirar cómo acomodamos el muñeco ese)
        Si está la letra en la palabra, mira el índice con eso de indexOf y reemplaza el espacio por el de la letra
        Luego imprime la letra con el avance
         */
        while (vidas>0) {
            System.out.println("--------------------------------------------------");
            System.out.println("                    Hangman                       ");
            System.out.println("--------------------------------------------------");
            imprimirPalabra(palabraVacia);
            System.out.println();
            String letraIngresar = leerLetras();
            if (palabraMagica.contains(letraIngresar)) {
                palabraVacia[palabraMagica.indexOf(letraIngresar)] = letraIngresar;
            } else {
                vidas -= 1;
            }
        }
        System.out.print(palabraMagica); //Imprime la palabra al final
    }
}
//Hay que ver si mis cambios son visibles y editables
//Por cierto, para que le corra en el IDE toca quitarle el renglón de Package y copiar el resto en una clase de nombre Main