/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mportalesb.a09;

import java.util.Scanner;

/**
 *
 * @author may37
 */
public class SPP2MPortalesBA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] a, b, r; //declaracion de variables
        int tamaño;
        tamaño = solicitaTamaño();
        a = crearMatriz("A", tamaño);
        b = crearMatriz("B", tamaño);
        imprimirMatriz("Matriz A",a);
        imprimirMatriz("Matriz B",b);
      r = sumaMatriz(a, b);  
    }

    public static int solicitaTamaño() {
        int tamaño=0;
        boolean flag;
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                System.out.println("Introduce el tamaño");
                tamaño = teclado.nextInt();
                flag = false;
                return tamaño;
            } catch (Exception ex) {
                System.out.println("NO es un numero de tamaño");
                flag = true;
                teclado.next();
            }
        } while (flag);
        return tamaño;
    }


    // public static int [][] ....para matrices
    public static int [][]crearMatriz(String dato, int tamaño) {
        System.out.println("Matriz " + dato);
        int[][] miMatriz = new int[tamaño][tamaño];
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {
                miMatriz[i][j] = solicitaEntero();
            }
        }
        return miMatriz;
    }

    public static int solicitaEntero() {
        Scanner teclado = new Scanner(System.in);
        int entero=0;
        boolean flag;
        do{
        try{
        System.out.println("Introduce enteros");
        entero= teclado.nextInt();
        flag= false;
        } catch (Exception ex){
            System.out.println("No son enteros");
            flag= true;
            teclado.next();
        }
        } while (flag);
        return entero;
    }
    // int [][]... por ser matrices
    public static int[][] sumaMatriz(int[][] a, int[][] b){
        System.out.println("La suma de matrices es" );
        int [][] r= new int [a.length][a.length]; //por ser cuadrado
        for (int i=0; i<r.length; i++){
            for (int j=0; j<r[i].length; j++){         
                r[i][j]= (a[i][j]+ b[i][j]);
                System.out.print("["+r[i][j]+"]");
                //resultado
            }  
         }   
    return r;
}
    public static void imprimirMatriz(String x,int a[][]){
        System.out.println(x);
        for (int i=0; i<a.length;i++){
        for (int j=0;j<a[i].length;j++){
            System.out.print("["+a[i][j]+"]");
        } //impresion en pantalla en celda
            System.out.println();
}
    }
}
    

