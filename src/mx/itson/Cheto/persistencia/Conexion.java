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
/**
* Obtiene una conexion hacia la base de datos utilizando los parametros para conectarse a una base de datos
* @return la conexion a la base de datos
**/

    public static Connection obtener() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/chetodb?user=root&password=gabrielleyva088");
        } catch (Exception ex) {
            System.out.println("Ocurrio un error " + ex.getMessage());
        }
        return conexion;

    }

}
