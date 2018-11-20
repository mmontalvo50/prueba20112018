/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mmontalvo.controlador;

import ec.mmontalvo.modelo.Empleado;
import ec.mmontalvo.vista.EditaDatos;
import ec.mmontalvo.vista.Login;
import java.util.ArrayList;

/**
 *
 * @author PC6-LAB2
 */
public class Coordinador {
    Login login = new Login (this);
    EditaDatos editaDatos =new  EditaDatos (this);
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    public void agregarEmpleado(Empleado e){
     empleados.add(e);
        System.out.println("EMPLEADO CREADO");
    }
}
