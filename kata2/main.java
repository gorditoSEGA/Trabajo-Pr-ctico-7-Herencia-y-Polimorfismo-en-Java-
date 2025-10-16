/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata2;

public class main {
    public static void main(String[] args) {
        figura[] figuras = {
            new circulo(5),
            new rectangulo(10, 5)
        };

        for (figura f : figuras) {
            System.out.println(f.getNombre() + " área: " + f.calcularArea());
        }
    }
}