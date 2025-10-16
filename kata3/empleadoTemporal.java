/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata3;

public class empleadoTemporal extends empleado {
    private double sueldoPorHora;
    private int horasTrabajadas;

    public empleadoTemporal(String nombre, double sueldoPorHora, int horasTrabajadas) {
        super(nombre);
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return sueldoPorHora * horasTrabajadas;
    }
}