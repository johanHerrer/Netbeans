package paquete1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *IMPLEMENTADORA 3
 * @author Usuario
 */
public class At implements ICombustible{
    @Override
    public int combustible(int litpar, int parsec, int cantNave) {
        return (litpar*parsec)-(int)(litpar*parsec*0.25); 
    }

    
}
