/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.luisacosta;

import javax.swing.JOptionPane;
/**
 *
 * @author Luis Acosta
 */
public class LuisAcostaC711Actvidad2 {

    public static void main(String[] args) {
        
        int Cantidad;
        
        Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de estudiantes: ")); // Cantidad de estudiantes
        
        float[][] alumnos = new float[Cantidad + 2][5]; // Matrix bidimensional de datos
         
        for(int i = 1; i < Cantidad + 1; i++){
            for(int j = 1; j < 4; j++){
                alumnos[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Estudiante["+i+"], nota del Corte["+j+"]: ")); // Datos a guardar
            }
        }
        
        // Calcula el promedio de cada estudiante y lo guarda
//        for(int i = 1; i < Cantidad + 1; i++){
//            for(int j = 1; j < 5; j++){
//                if(j == 1){
//                    alumnos[i][4] = alumnos[i][1] * 0.3; // corte1
//                }
//                if(j == 2){
//                    alumnos[i][4] = alumnos[i][2] * 0.3 + alumnos[i][4]; // corte 2
//                }
//                if(j == 3){
//                    alumnos[i][4] = alumnos[i][3] * 0.6 + alumnos[i][4]; // corte 3
//                }
//            }
//        }
        
        // Calcula el promedio de todos los estudiantes y lo guarda
        for(int i = 1; i < Cantidad + 2; i++){
            for(int j = 1; j < 5; j++){
                if(j == 1){
                    float promedio1 = alumnos[i][1] + alumnos[i][1] % Cantidad; // corte1
                    alumnos[Cantidad + 1][1] = promedio1;
                }
                if(j == 2){
                    float promedio1 = alumnos[i][2] + alumnos[i][2] % Cantidad; // corte2
                    alumnos[Cantidad + 1][2] = promedio1;
                }
                if(j == 3){
                    float promedio1 = alumnos[i][3] + alumnos[i][3] % Cantidad; // corte3
                    alumnos[Cantidad + 1][3] = promedio1;
                }
                if(j == 4){
                    float promedio1 = alumnos[i][4] + alumnos[i][4] % Cantidad; // corte3
                    alumnos[Cantidad + 1][4] = promedio1;
                }
            }
        }
 
        // imprimir
        int imprimir = Cantidad + 1;
        String resultado = "Estudiantes        corte1        corte2        corte3         promedio";
        for(int i = 1; i < Cantidad + 2; i++){
            if(i < imprimir){
                resultado += "\nEstudiante["+i+"] :     ";
            }
            else{
                resultado += "\nPromedio de clase :      ";
            }
            for(int j = 1; j < 5; j++){
                if(i < imprimir){
                    resultado += alumnos[i][j];
                    resultado += "             ";
                }
                else{
                    resultado += alumnos[i][j];
                    resultado += "             ";
                }
            }
            resultado += "\n"; 
        }
        JOptionPane.showMessageDialog(null, resultado);
        
    }
}
