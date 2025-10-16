/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<empleado> empleados = new ArrayList<>();

        empleados.add(new empleadoPlanta("Ana", 2000));
        empleados.add(new empleadoTemporal("Luis",300, 20));
        empleados.add(new empleadoPlanta("Carlos", 7000));
        empleados.add(new empleadoTemporal("Marta", 130, 25));

        for (empleado e : empleados) {
            System.out.print(e.getNombre() + " - Sueldo: " + e.calcularSueldo());
            if (e instanceof empleadoPlanta) {
                System.out.println(" (Planta)");
            } else if (e instanceof empleadoTemporal) {
                System.out.println(" (Temporal)");
            }
        }
    }
}