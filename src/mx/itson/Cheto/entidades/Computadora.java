/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.Cheto.entidades;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import mx.itson.Cheto.persistencia.Conexion;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Gabriel Leyva Esquivel
 */
public class Computadora {

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the Ram
     */
    public String getRam() {
        return Ram;
    }

    /**
     * @param Ram the Ram to set
     */
    public void setRam(String Ram) {
        this.Ram = Ram;
    }

    /**
     * @return the Procesador
     */
    public String getProcesador() {
        return Procesador;
    }

    /**
     * @param Procesador the Procesador to set
     */
    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    /**
     * @return the Almacenamiento
     */
    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    /**
     * @param Almacenamiento the Almacenamiento to set
     */
    public void setAlmacenamiento(String Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    /**
     * @return the Os
     */
    public String getOs() {
        return Os;
    }

    /**
     * @param Os the Os to set
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    public List<Computadora> obtener() {

        List<Computadora> computadoras = new ArrayList();

        try {
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT ID, Marca, Modelo, Color, Ram, Procesador, Almacenamiento, Os FROM computadora")
        } catch (Exception ex) {
            System.out.println("Ocurrio un error" + ex.getMessage());

        }
        return computadoras;
    }

  

    private int ID;
    private String Marca;
    private String Modelo;
    private String Color;
    private String Ram;
    private String Procesador;
    private String Almacenamiento;
    private String Os;

}
