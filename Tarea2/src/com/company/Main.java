package com.company;


import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static int numeroAleatorio() {
        return (int) Math.floor(Math.random() * 10 + 0);
    }

    public static String leerLetras() {
        Scanner lector = new Scanner(System.in); //Lee la letra ingresada por el usuario
        return (String) lector.nextLine();
    }

    public static void imprimirPalabra(String arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }


    public static void imprimirSignoPerdida(String arreglo[], int parametro) {
        if (parametro != 0) {
            for (int i = 0; i < parametro; i++) {
                System.out.print(arreglo[i]);
            }
        }
    }
    public static void espaciosVacios(String arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = "_";
        }
    }

    public static boolean buscadorLetras(String palabraClave, String vacio[], String letraClave) {
        boolean control = false;
        for (int i = 0; i < palabraClave.length(); i++) {
            if (palabraClave.charAt(i) == letraClave.charAt(0)) {
                vacio[i] = letraClave;
                control = true;
            }
        }
        return control;
    }

    public static boolean finalizar(String pal[], String palabra) { //No encontré la manera de darle finalización a esto :( | Me siento re miserable
        String palabraEnLista = String.join("", pal);
        boolean terminado = false;
        if (palabraEnLista.equals(palabra)) {
                    terminado = true;
                }
        return terminado;
    }

    public static void main(String[] args) {

        String[] palabrasMagicas = new String[10]; //Arreglo Palabras Predefinidas
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

        String[] signoPerdida = new String[7]; //Arreglo con los signos de pérdida
        signoPerdida[0] = "q";
        signoPerdida[1] = "(";
        signoPerdida[2] = "X";
        signoPerdida[3] = "-";
        signoPerdida[4] = "X";
        signoPerdida[5] = ")";
        signoPerdida[6] = "p";

        String palabraMagica = palabrasMagicas[numeroAleatorio()]; //Palabra escogida aleatoriamente, se escoge una palabra cualquiera según el número aleatorio aquél
        String[] palabraVacia = new String[palabraMagica.length()]; //Arreglo palabra vacia
        espaciosVacios(palabraVacia); //Se ponen los espacios de las letras de la palabra
        int vidas = 7; //Numero de intentos


        while (vidas > 0) {
            System.out.println("--------------------------------------------------");
            System.out.println("                     Hangman                      ");
            System.out.println("--------------------------------------------------");
            System.out.println("Te quedan " + vidas + " vidas");
            imprimirPalabra(palabraVacia);
            System.out.print("          "); // Imprime espacio de sobra
            imprimirSignoPerdida(signoPerdida, (7 - vidas));
            System.out.println();
            //String ingreso = (leerLetras());
            //System.out.print("    " + ingreso);
            if (!buscadorLetras(palabraMagica, palabraVacia, leerLetras())) {
                vidas -= 1;
            }
            if (finalizar(palabraVacia, palabraMagica)) {
                imprimirPalabra(palabraVacia);
                System.out.println();
                System.out.println();
                System.out.println("You Win!!!");
                System.out.println("   _O/                   ,");
                System.out.println("     \\                  /           \\O_");
                System.out.println("     /\\_             `\\_\\        ,/\\/");
                System.out.println("     \\  `        ,       \\         /");
                System.out.println("     `       O/ /       /O\\        \\");
                System.out.println("             /\\|/\\.                `");
                break;
            }

        }
        if (vidas == 0) {
            System.out.print("You Lose!!!The secret word is: " + palabraMagica); //Imprime la palabra al final
        }


    }
}
