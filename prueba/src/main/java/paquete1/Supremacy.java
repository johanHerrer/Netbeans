package paquete1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * IMPLEMENTADORA 2
 * @author Usuario
 */
public class Supremacy implements ICombustible{

    public int getShips() {
        return ships;
    }

    public void setShips(int ships) {
        this.ships = ships;
    }
    private int ships; 
    
    @Override
    public int combustible(int litpar, int parsec, int cantNave) {
        return (int)((int)(litpar*parsec)+(litpar*parsec*0.1*ships));       
    }
  
}
