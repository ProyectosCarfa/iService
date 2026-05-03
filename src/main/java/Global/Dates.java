/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Global;

import Class.Empleados;
import java.util.ArrayList;
import java.util.Arrays;
import Global.Credenciales;

/**
 *
 * @author Kendrick
 */
public class Dates {

    public static String[] roles = {"Empleado", "Tecnico"};
    public static ArrayList<Empleados> listaEmpleados = new ArrayList<>(
            Arrays.asList(
                    new Empleados((byte) 1, "Josefina", roles[0]),
                    new Empleados((byte) 2, "Emmanuel", roles[2]),
                    new Empleados((byte) 3, "Ana Maria", roles[0])
            )
    );

    public static ArrayList<Credenciales> credenciales = new ArrayList<>(
            Arrays.asList(
                    new Credenciales("josefina@gmail.com", "contraseña123"),
                    new Credenciales("emmanuel12@gmail.com", "ema123"),
                    new Credenciales("anamaria@gmail.com", "ana2025")
            )
    );

}
