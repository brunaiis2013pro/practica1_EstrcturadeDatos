/*
Ejercicio 3
Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas
entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha
sacado y la menor.
 */
package practica1;

import java.util.Scanner;

public class PRACTICA1 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        
        int[] notas = new int[5];
        double suma=0,promedio;
        int mayor=0,menor=999999;
        
        
        //Pedimos las 5 notas del alumno
        System.out.println("\t\tNotas comprendidas entre [0-10]\n");
        for(int i=0; i<notas.length; i++){
            
            //Controlamos que estee en dicho rango
            do{
                System.out.print("Digite la nota "+(i+1)+": ");
                notas[i] = entrada.nextInt();
            }while(notas[i]<0 || notas[i]>10);
           
            
            suma+=notas[i]; //Sumamos todas las notas
            
            if(notas[i]>mayor){//La nota mayor
                mayor = notas[i];
            }
            if(notas[i]<menor){//La nota menor
                menor = notas[i];
            }
        }
        promedio = suma /notas.length;
        
        //Mostramos todas las notas del alumno
        System.out.print("\nNOTAS: ");
        for(int i=0; i<notas.length; i++){
            System.out.print(notas[i]+" ");
        }
        System.out.println();
        
        
        System.out.println("La nota media es: "+promedio);
        System.out.println("La nota mayor es: "+mayor);
        System.out.println("La nota menor es: "+menor);
    }
    
}
