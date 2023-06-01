/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad4ejercicionumero4;

import java.util.*;

public class Equipo {
    private String Nombre;
    private static double TotalTiempo;
    private String Pais;
    Vector ListaCiclistas;
    
    public Equipo(String Nombre, String Pais){
        this.Nombre = Nombre;
        this.Pais = Pais;
        TotalTiempo = 0;
        ListaCiclistas = new Vector();
        
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    private String getPais() {
        return Pais;
    }

    private void setPais(String Pais) {
        this.Pais = Pais;
    }

    void AñadirCiclista(Ciclista Ciclista) {
        ListaCiclistas.add(Ciclista); 
    }
    
    void ListarEquipo() {
        for (int i = 0; i < ListaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) ListaCiclistas.elementAt(i); 
            System.out.println(c.getNombre());
        }
    }
    
    void BuscarCiclista(){
    
        Scanner sc = new Scanner(System.in); 
        String NombreCiclista = sc.nextLine();
        for (int i = 0; i < ListaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) ListaCiclistas.elementAt(i); 
            if (NombreCiclista.equals(c.getNombre())) { 
                System.out.println("El ciclista "+c.getNombre()+" si se encuentra registrado");
            }    
        }
        System.out.println("El nombre ingresado no se encuentra");
    }
    void CalcularTotalTiempo() {
        for (int i = 0; i < ListaCiclistas.size(); i++) { 
            Ciclista c = (Ciclista) ListaCiclistas.elementAt(i); 
            TotalTiempo = TotalTiempo + c.getTiempoAcumulado();
        }
    }
    void Print() {
        System.out.println(ListaCiclistas);
        //System.out.println("Nombre del equipo = " + Nombre);
        //System.out.println("País = " + Pais);
        //System.out.println("Total tiempo del equipo = " + TotalTiempo);
    }
}  
