/*
 *Uriel Ivan Lizama Martinez
 */

import java.util.*;
public class Figura4{
    public static void main(String[] args) {

        int i,j;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa filas que desea:");

        int n=teclado.nextInt();
        int y=n-1;
        System.out.println("Ingresa columnas que desea;");

        int m=teclado.nextInt();

        String matriz [][]= new String [n][m];

        for( i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(i==j){
                    matriz[i][j]=" ";  
                }else{
                    matriz[i][j] = "x";
                }    
             }

            }
            for(j=0;j<m;j++){
                matriz[y][j]=" ";    
                y--;
           }

           for(i=0; i<n;i++){
            for(j=0;j<m;j++){
              System.out.print(" [" + matriz[i][j] + "] ");
            }
            System.out.println();
         }