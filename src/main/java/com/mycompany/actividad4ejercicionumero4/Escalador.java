/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero4;


public class Escalador extends Ciclista{
    private double AceleracionPromedio;
    private double GradoRampa;
    
    public Escalador(int Identificador, String Nombre, double AceleracionPromedio, double GradoRampa) {
        super(Identificador, Nombre);
        this.AceleracionPromedio = AceleracionPromedio;
        this.GradoRampa = GradoRampa;
    }
    protected double getAceleraciónPromedio() {
        return AceleracionPromedio;
    }

    protected void setAceleraciónPromedio(double AceleracionPromedio) {
        this.AceleracionPromedio = AceleracionPromedio;
    }

    protected double getGradoRampa() {
        return GradoRampa;
    }
    protected void setGradoRampa(double GradoRampa) {
        this.GradoRampa = GradoRampa;
    }
    protected void Print() {
        super.Print(); 
        System.out.println("Aceleración promedio = " + AceleracionPromedio);
        System.out.println("Grado de rampa = " + GradoRampa);
    }

    protected String PrintTipo() {
        return "Es un escalador";
    }
}
