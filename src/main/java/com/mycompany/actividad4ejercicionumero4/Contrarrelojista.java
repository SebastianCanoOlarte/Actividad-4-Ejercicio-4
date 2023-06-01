/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero4;


public class Contrarrelojista extends Ciclista {
    private double VelocidadMaxima;
    
    public Contrarrelojista(int Identificador, String Nombre, double VelocidadMaxima) {
        super(Identificador, Nombre);
        this.VelocidadMaxima = VelocidadMaxima;
    }
    protected double getVelocidadMáxima() {
        return VelocidadMaxima;
    }
    protected void setVelocidadMáxima(double VelocidadMaxima) {
        this.VelocidadMaxima = VelocidadMaxima;
    }
    protected void Print() {
        super.Print(); 
        System.out.println("Aceleración promedio = " + VelocidadMaxima);
    }
    protected String PrintTipo() {
        return "Es un constrarrelojista";
    }
   
}
