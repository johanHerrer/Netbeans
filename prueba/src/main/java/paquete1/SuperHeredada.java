package paquete1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class SuperHeredada extends Herencia{
    int ships; 
    public SuperHeredada(int cantNaves,int litpar, int parsec, int cap, String tipo, int ships) {
        super(cantNaves, litpar, cap, parsec, tipo);
        this.ships=ships; 
    }

    @Override
    public String imprimirdatos() {
        String complete=super.imprimirdatos()+"Naves que carga cada nave: "+ships;
        return complete;
        
    }
}
