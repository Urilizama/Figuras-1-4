/*
 * Lizama Martinez Uriel Ivan
 */
package matriz;

import java.util.Scanner;

public class Figura3{
    
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
    boolean numeroCorrecto= false;
    int n,m;
        System.out.print("Ingresa la cantidad de filas(que sea numero impar):");
    int a= teclado.nextInt();
    
    char[][] matriz= new char[a][a];
    
    
   for(int i=0; i< matriz.length;i++){
   for(int j=0; j< matriz.length;j++){
       
       int D=i + 1;
          if((i==j) || (j==(a-a))){
              matriz[i][j]=' ';
              System.out.print(matriz[i][j]+" ");
          }else{
              matriz[i][j]='x';
              System.out.print(matriz[i][j]+" ");
          }
   } 
   System.out.println();
   }
  }
    
    
}

