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
        //Se escoge una palabra cualquiera según el número aleatorio aquél
        int vidas = 7;
        String[] palabraVacia = new String[palabraMagica.length()];
        for(int i=0;i<palabraVacia.length;i++){
            palabraVacia[i] = "_";
            //Se ponen los espacios de las letras de la palabra
        }
        imprimirPalabra(palabraVacia);
        System.out.println();;

        /*
        Aquí, la palabra que mete el usuario se lee sólo una vez (renglón 48) y se mete dentro de una variable
        (Si no lo meto dentro de la variable, la función se ejecuta varias veces)
        Después, en el if, verifica si la letra está dentro de la palabra. Si sí, sigue. Si no, sale "Paila" JAJA
        (Toca mirar cómo acomodamos el muñeco ese)
        Si está la letra en la palabra, mira el índice con eso de indexOf y reemplaza el espacio por el de la letra
        Luego imprime la letra con el avance     
         */
        String letra = leerLetras();
        String palabra = palabraMagica;
        if(palabra.contains(letra)){
            palabraVacia[palabra.indexOf(letra)] = letra;
        }else {
            vidas-=1;
            System.out.println("Paila");
        }
        imprimirPalabra(palabraVacia);
    }
}
//Hay que ver si mis cambios son visibles y editables
//Por cierto, para que le corra en el IDE toca quitarle el renglón de Package y copiar el resto en una clase de nombre Main
