package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static int numeroAleatorio(){
        return (int) Math.floor(Math.random()*10+0);
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

        System.out.println(palabrasMagicas[numeroAleatorio()]);
    }
}
//Hay que ver si mis cambios son visibles y editables
