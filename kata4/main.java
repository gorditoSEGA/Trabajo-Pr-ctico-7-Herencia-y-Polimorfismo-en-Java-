/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata4;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<animal> animales = new ArrayList<>();

       
        animales.add(new perro("Firulais"));
        animales.add(new gato("Michi"));
        animales.add(new vaca("Lola"));

        
        for (animal a : animales) {
            a.describirAnimal();
            a.hacerSonido(); 
            System.out.println("----------------------");
        }
    }
}