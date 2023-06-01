/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero4;


public class Velocista extends Ciclista{
    private double PotenciaPromedio;
    private double VelocidadPromedio;
    
    public Velocista(int Identificador, String Nombre, double PotenciaPromedio, double VelocidadPromedio) {
        super(Identificador, Nombre);
        this.PotenciaPromedio = PotenciaPromedio;
        this.VelocidadPromedio = VelocidadPromedio;
    }
    protected double getPotencialPromedio(){
        return PotenciaPromedio;
    }
    protected void setPotenciaPromedio(double PotenciaPromedio) {
        this.PotenciaPromedio = PotenciaPromedio;
    }
    protected double getVelocidadPromedio() {
        return VelocidadPromedio;
    }
    protected void setVelocidadPromedio(double VelocidadPromedio) {
        this.VelocidadPromedio = VelocidadPromedio;
    }
    protected void Print() {
        super.Print(); 
        System.out.println("Potencia promedio = " + PotenciaPromedio);
        System.out.println("Velocidad promedio = " + VelocidadPromedio);
    }

    protected String PrintTipo() {
        return "Es un velocista";
    }
}
