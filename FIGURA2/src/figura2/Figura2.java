/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura2;
import java.util.Scanner;

public class Figura2{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
         boolean numer = false;
             int d,m;
do{

    System.out.println("Ingresa cuantas columnas quieres: ");
    d=entrada.nextInt();
    System.out.println("Ingresa  cuantas filas quires: ");
    m=entrada.nextInt();
 
    if (d%2 !=0 && m%2 !=0){
        numer=true;
       }else{
       System.out.println("error intentalo de nuevo");
    }    
} while(!numer);
        int i;
char matriz[][] = new char [d][m];
for (i=0; i<matriz.length; i++){
        for (int j=0; j<matriz.length; j++){
            if ((i==0) || (i== matriz.length-1)||(j==0)||(j==matriz.length-1)){
                matriz[i][j] = 'x';
            }
                else{
                        matriz[i][j] = ' ';
                        }
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }          
    }  
}