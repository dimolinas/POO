package com.company;

public class Main {
    public static void numeros(){
        int matriz[][] = new int[3][3];
        int vector[] = new int[3];
        recorrerMatriz(matriz,3,1,"numeros");
        System.out.println("");
        recorrerVector(vector,matriz,3,"numeros");
        System.out.println("\n");
    }

    public static void abecedario(){
        int matriz[][]= new int[4][4];
        int vector[] = new int[4];
        recorrerMatriz(matriz,4,97,"texto");
        System.out.println("");
        recorrerVector(vector, matriz, 4, "texto");
        System.out.println("");
    }

    public static void recorrerVector(int vec[], int matr[][],int tam,String logica){
        for(int i=0; i<tam;i++){
            if (logica == "numeros"){
                vec[i]= matr[i][i];
                System.out.print(vec[i]);
            }
            if (logica == "texto"){
                vec[i]= matr[i][tam-1-i];
                System.out.print((char) vec[i]);
            }
        }
    }

    public static void recorrerMatriz(int a[][],int tam, int variable,String logica){
        for (int i=0; i< tam; i++){
            for(int j=0;j< tam;j++){
                a[i][j] = variable;
                variable += 1;

                if (logica == "numeros"){
                    System.out.print(a[i][j]);
                }
                if (logica == "texto"){
                    System.out.print((char) a[i][j]);
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        numeros();
        abecedario();
    }
}
