/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template xd
 */
package mx.itson.Cheto.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author gabri
 */
public class Conexion {

    public Connection obtener() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/chetodb?user=root&password=gabrielleyva088");
        } catch (Exception ex) {
            System.out.println("Ocurrio un error " + ex.getMessage());
        }
        return conexion;

    }

}
