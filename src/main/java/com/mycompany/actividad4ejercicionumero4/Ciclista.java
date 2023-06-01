/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero4;


public abstract class Ciclista {
    private int Identificador;
    private String Nombre;
    private int TiempoAcumulado = 0;
    
    public Ciclista(int Identificador, String Nombre){
        this.Identificador = Identificador;
        this.Nombre = Nombre;
    }
    abstract String PrintTipo();
    
    protected int GetIdentificador(){
        return Identificador;
    }
    protected void SetIdentificador(int Identificador){
        this.Identificador = Identificador;
    }
    protected String getNombre(){
        return Nombre;
    }
    protected void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    protected int getPosicionGeneral(int PosicionGeneral) {
        return PosicionGeneral;
    }
    protected int setPosicionGeneral(int PosicionGeneral) {
        return PosicionGeneral;
    }
    protected int getTiempoAcumulado() {
        return TiempoAcumulado;
    }
    protected void setTiempoAcumulado(int TiempoAcumulado) {
        this.TiempoAcumulado = TiempoAcumulado;
    }
    protected void Print() {
        System.out.println("Identificador = " + Identificador);
        System.out.println("Nombre = " + Nombre);
        System.out.println("Tiempo Acumulado = " + TiempoAcumulado);
    }
}
